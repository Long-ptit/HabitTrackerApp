package com.example.createbaseproject.data.repositories

import com.example.createbaseproject.data.database.entities.HabitEntity
import com.example.createbaseproject.data.datasource.HabitLocalDataSource
import com.example.createbaseproject.di.IoDispatcher
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import javax.inject.Inject

class HabitRepository @Inject constructor(
    private val localDataSource: HabitLocalDataSource,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
) {

    suspend fun insertHabit(habit: HabitEntity) = withContext(dispatcher) {
        localDataSource.insertHabit(habit)
    }

//    suspend fun getAllHabits() : Flow<List<HabitEntity>> = withContext(dispatcher) {
//        localDataSource.getAllHabits()
//    }

}