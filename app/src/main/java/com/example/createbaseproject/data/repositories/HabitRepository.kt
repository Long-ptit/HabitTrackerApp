package com.example.createbaseproject.data.repositories

import com.example.createbaseproject.data.database.entities.HabitEntity
import com.example.createbaseproject.data.datasource.HabitLocalDataSource
import javax.inject.Inject

class HabitRepository @Inject constructor(private val localDataSource: HabitLocalDataSource) {

    suspend fun insertHabit(habit: HabitEntity) {
        localDataSource.insertHabit(habit)
    }

}