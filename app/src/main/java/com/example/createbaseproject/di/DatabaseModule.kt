package com.example.createbaseproject.di

import android.content.Context
import androidx.room.Room
import com.example.createbaseproject.data.database.AppDatabase
import com.example.createbaseproject.data.database.daos.HabitDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context) : AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            AppDatabase.NAME
        ).build()
    }

    @Provides
    fun provideDao(database: AppDatabase) : HabitDao {
        return database.habitDao()
    }

}