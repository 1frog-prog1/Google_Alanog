package com.example.data.models.tasks.room

import com.example.domain.models.lists.ListID
import com.example.domain.models.tasks.*
import com.example.domain.repository.TaskRepository

class RoomTaskRepository : TaskRepository {
    override fun createTask(
        name: TaskName,
        description: TaskDescription,
        date: TaskDate,
        mark: TaskMark
    ): Task {
        TODO("Not yet implemented")
    }

    override fun deleteTask(task_id: TaskID) {
        TODO("Not yet implemented")
    }

    override fun updateTaskName(task_id: TaskID, name: TaskName) {
        TODO("Not yet implemented")
    }

    override fun updateTaskDescription(task_id: TaskID, description: TaskDescription) {
        TODO("Not yet implemented")
    }

    override fun addTaskDate(task_id: TaskID, date: TaskDate) {
        TODO("Not yet implemented")
    }

    override fun deleteTaskDate(task_id: TaskID) {
        TODO("Not yet implemented")
    }

    override fun changeTaskMark(task_id: TaskID) {
        TODO("Not yet implemented")
    }

    override fun setTaskCompleted(task_id: TaskID) {
        TODO("Not yet implemented")
    }

    override fun setTaskIncompleted(task_id: TaskID) {
        TODO("Not yet implemented")
    }

    override fun createSubTask(taskID: TaskID, subtask_name: TaskName): Task {
        TODO("Not yet implemented")
    }

    override fun deleteSubTask(subtask_id: TaskID) {
        TODO("Not yet implemented")
    }

    override fun changeTaskList(task_id: TaskID, list_id: ListID) {
        TODO("Not yet implemented")
    }
}