package com.example.createbaseproject.ui.home

import androidx.lifecycle.viewModelScope
import com.example.createbaseproject.base.viewmodel.BaseViewModel
import com.example.createbaseproject.common.Logger
import com.example.createbaseproject.data.database.entities.HabitEntity
import com.example.createbaseproject.data.repositories.HabitRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.lang.Exception
import java.lang.RuntimeException
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val habitRepository: HabitRepository) : BaseViewModel() {
    private val _testFlow = MutableStateFlow(Unit)
    val testFlow = _testFlow.asStateFlow()
    init {
     viewModelScope.launch(handler) {
//         showLoading()
//         Logger.log("start loading loading")
//         habitRepository.insertHabit(HabitEntity(name = "test",  content = "kaka"))
//         _testFlow.value = Unit
//         Logger.log("Finish loading")
//         hideLoading()
        try {


                val a11 = async { func11() }
                val a12 = async { func22() }
                val a13 = async { func33() }


                val a111 = a11.await()
                val a121 =a12.await()
                val a131 =a13.await()


                // listOf(a11, a12, a13).awaitAll()

        } catch (e: Exception) {

        }

     }


    }

    suspend fun func11(): String {
        delay(2000)
        throw RuntimeException()
        return "ABc"
    }

    suspend fun func22(): String {
        delay(3000)
        Logger.log("Finish func22")
        return "ABc"
    }

    suspend fun func33(): String {
        delay(4000)
        Logger.log("Finish func33")
        return "ABc"
    }

}