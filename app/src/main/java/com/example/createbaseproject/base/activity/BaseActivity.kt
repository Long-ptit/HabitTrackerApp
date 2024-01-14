package com.example.createbaseproject.base.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import com.example.createbaseproject.R
import com.example.createbaseproject.base.dialogs.ErrorDialog
import com.example.createbaseproject.base.viewmodel.BaseViewModel
import com.example.createbaseproject.common.Logger
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlin.math.ceil

open abstract class BaseActivity : AppCompatActivity() {

    protected open val viewModel: BaseViewModel by viewModels();
    private lateinit var loadingDialog: AlertDialog

    protected fun showErrorDialog(message: String) {
        val errorDialog = ErrorDialog(this, message)
        errorDialog.show()
        errorDialog.window?.setGravity(Gravity.CENTER)
        errorDialog.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
    }

    protected open fun bindViewModel() {
        with(viewModel) {
            loadingStateFlow.onEachWithLifecycleScope {
                showLoading(it)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDialog()
        bindViewModel()
    }

    protected fun <T> Flow<T>.onEachWithLifecycleScope(action: suspend (T) -> Unit) {
        this.flowWithLifecycle(lifecycle)
            .onEach { action(it) }
            .launchIn(lifecycleScope)
    }

     fun showLoading(isShow: Boolean) {
        if (isShow) loadingDialog.show() else loadingDialog.hide()
    }

    private fun initDialog() {
       loadingDialog = AlertDialog.Builder(this, R.style.DialogLoading).setView(View.inflate(this, R.layout.dialog_loading, null)).create()
    }



}