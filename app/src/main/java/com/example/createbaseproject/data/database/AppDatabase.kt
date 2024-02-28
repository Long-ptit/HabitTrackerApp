package com.example.createbaseproject.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.createbaseproject.data.database.daos.HabitDao
import com.example.createbaseproject.data.database.entities.HabitEntity

@Database(entities = [HabitEntity::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

    companion object {
        const val NAME = "Habit Tracker"
    }
    abstract fun habitDao(): HabitDao
}