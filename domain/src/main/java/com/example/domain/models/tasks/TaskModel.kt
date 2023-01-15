package com.example.domain.models.tasks

data class TaskModel (
    var task_id : TaskID,

    var name : TaskName,
    var description : TaskDescription,
    var date : TaskDate,
    var is_marked : Boolean,
    var which_subtask : TaskID
)