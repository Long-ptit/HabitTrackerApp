package com.example.createbaseproject.ui.home

import androidx.lifecycle.viewModelScope
import com.example.createbaseproject.base.viewmodel.BaseViewModel
import com.example.createbaseproject.common.Logger
import com.example.createbaseproject.data.database.entities.HabitEntity
import com.example.createbaseproject.data.repositories.HabitRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val habitRepository: HabitRepository) : BaseViewModel() {
    private val _testFlow = MutableStateFlow("ABC")
    val testFlow = _testFlow.asStateFlow()
    init {
     viewModelScope.launch {
         habitRepository.insertHabit(HabitEntity(name = "test",  content = "kaka"))
     }
    }

    fun getName(): String {
        return "HomeViewModel"
    }

}