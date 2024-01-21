package com.example.createbaseproject.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "habit")
data class HabitEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = -1,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "content") val content: String
)