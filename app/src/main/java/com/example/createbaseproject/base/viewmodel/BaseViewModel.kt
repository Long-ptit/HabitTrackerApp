package com.example.createbaseproject.base.viewmodel

import androidx.lifecycle.ViewModel
import com.example.createbaseproject.common.Logger
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
open class BaseViewModel @Inject constructor() : ViewModel() {

    private val _loadingStateFlow = MutableStateFlow(false)
    val loadingStateFlow = _loadingStateFlow.asStateFlow()

    private val _exceptionMessage = MutableStateFlow("")
    val exceptionMessage = _exceptionMessage.asStateFlow()

    var parentJob: Job? = null
        protected set

    protected fun registerJobFinish(){
        parentJob?.invokeOnCompletion {
            Logger.log("Finish job")
            hideLoading()
        }
    }

    protected fun showLoading() {
        _loadingStateFlow.value = true
    }

    protected fun hideLoading() {
        _loadingStateFlow.value = false
    }

    protected val handler = CoroutineExceptionHandler { _, exception ->

    }


}