package com.example.taskapp

class TaskController(private val repository: TaskRepository) {
    fun addNewTask(title: String, description: String) {
        repository.addTask(title, description)
    }

    fun getTasks() {
        repository.viewTasks()
    }
}
