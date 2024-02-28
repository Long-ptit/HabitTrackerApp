package com.example.createbaseproject.data.datasource

import com.example.createbaseproject.data.database.daos.HabitDao
import com.example.createbaseproject.data.database.entities.HabitEntity
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class HabitLocalDataSource @Inject constructor(private val habitDao: HabitDao) {

//    suspend fun getAllHabits() : Flow<List<HabitEntity>> {
//       return habitDao.getAll()
//    }

    suspend fun insertHabit(habitEntity: HabitEntity)  {
        habitDao.insertHabit(habitEntity)
        delay(5000)
    }
}