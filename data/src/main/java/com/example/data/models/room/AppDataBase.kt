package com.example.data.models.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.models.tasks.room.entities.TaskDBEntity

@Database(
    version = 1,
    entities = [
        TaskDBEntity::class
    ]
)
abstract class AppDataBase : RoomDatabase() {
}