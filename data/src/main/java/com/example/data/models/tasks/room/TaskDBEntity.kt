package com.example.data.models.tasks.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "Tasks")
data class TaskDBEntity (
    @PrimaryKey(autoGenerate = true) var task_id : Int,

    var name : String,
    var description : String,
    var date : Date,
    var is_marked : Boolean,
    var which_task : Int
)