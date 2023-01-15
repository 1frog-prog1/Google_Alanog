package com.example.domain.models.tasks

import java.util.*

data class Task (
    var task_id : Int,
    var name : String,
    var description : String,
    var date : Date,
    var is_marked : Boolean,
    var which_subtask : Int
)