package com.example.createbaseproject.data.models

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class Habit(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "content") val content: String
)
