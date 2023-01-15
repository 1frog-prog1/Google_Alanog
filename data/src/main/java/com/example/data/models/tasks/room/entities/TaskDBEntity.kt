package com.example.data.models.tasks.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.domain.models.tasks.*
import java.util.Date

@Entity(tableName = "Tasks")
data class TaskDBEntity (
    @PrimaryKey(autoGenerate = true) var task_id : Int,

    var name : String,
    var description : String,
    var date : Date,
    var is_marked : Boolean,
    var which_subtask : Int
) {

    fun toTask() : Task = Task (
        task_id = task_id,
        name = name,
        description = description,
        date = date,
        is_marked = is_marked,
        which_subtask = which_subtask
            )


}