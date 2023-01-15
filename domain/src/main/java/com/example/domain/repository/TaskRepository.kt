package com.example.domain.repository

import com.example.domain.models.lists.ListID
import com.example.domain.models.tasks.*

interface TaskRepository {
    fun createTask(name : TaskName, description: TaskDescription,
                   date : TaskDate, mark : TaskMark) : Task

    fun deleteTask(task_id : TaskID)

    fun updateTaskName(task_id : TaskID, name : TaskName)

    fun updateTaskDescription(task_id : TaskID, description: TaskDescription)

    fun addTaskDate(task_id : TaskID, date: TaskDate)

    fun deleteTaskDate(task_id: TaskID)

    fun changeTaskMark(task_id: TaskID)

    fun setTaskCompleted(task_id: TaskID)

    fun setTaskIncompleted(task_id: TaskID)

    fun createSubTask(taskID: TaskID, subtask_name : TaskName) : Task

    fun deleteSubTask(subtask_id : TaskID)

    fun changeTaskList(task_id: TaskID, list_id : ListID)
}