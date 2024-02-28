package com.example.createbaseproject.data.models

import com.example.createbaseproject.data.database.entities.HabitEntity

class Habit(
    var id: Long = -1,
    var name: String? = null,
    var content: String? = null
) {
    fun toHabitEntity(): HabitEntity {
        return HabitEntity(
            id = id ,
            name = name ?: "",
            content = content ?: ""
        )
    }
}

fun HabitEntity.toHabit(): Habit {
    return Habit(name = name, content = content, id = id)
}
