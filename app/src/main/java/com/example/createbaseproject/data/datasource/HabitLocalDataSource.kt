package com.example.createbaseproject.data.datasource

import com.example.createbaseproject.data.database.daos.HabitDao
import com.example.createbaseproject.data.database.entities.HabitEntity
import javax.inject.Inject

class HabitLocalDataSource @Inject constructor(private val habitDao: HabitDao) {

//    suspend fun getAllHabits()  {
//        habitDao.getAll()
//    }

    suspend fun insertHabit(habitEntity: HabitEntity)  {
        habitDao.insertHabit(habitEntity)
    }
}