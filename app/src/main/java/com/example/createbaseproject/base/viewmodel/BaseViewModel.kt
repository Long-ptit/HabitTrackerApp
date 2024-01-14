package com.example.createbaseproject.base.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

open class BaseViewModel : ViewModel() {

    private val _loadingStateFlow = MutableStateFlow(false)
    val loadingStateFlow = _loadingStateFlow.asStateFlow()

    protected fun showLoading() {
        _loadingStateFlow.value = true
    }

    protected fun hideLoading() {
        _loadingStateFlow.value = false
    }


}