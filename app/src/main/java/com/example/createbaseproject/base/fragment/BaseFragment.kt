package com.example.createbaseproject.base.fragment

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import com.example.createbaseproject.base.activity.BaseActivity
import com.example.createbaseproject.base.viewmodel.BaseViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

abstract class BaseFragment : Fragment{
    constructor() : super()

    constructor(@LayoutRes layoutId: Int) : super(layoutId)

    protected open val viewModel: BaseViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindViewModel()
        initView()
    }

    protected open fun initView() {
    }

    protected fun showLoading(isShow: Boolean) {
        (activity as? BaseActivity)?.showLoading(isShow)
    }

    protected open fun bindViewModel() {
        with(viewModel) {
            loadingStateFlow.onEachWithLifecycleScope {
                showLoading(it)
            }
        }
    }


    protected fun <T> Flow<T>.onEachWithLifecycleScope(action: suspend (T) -> Unit) {
        this.flowWithLifecycle(lifecycle) //by default Lifecycle.State.STARTED
            .onEach { action(it) }
            .launchIn(lifecycleScope)
    }
}