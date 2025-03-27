package com.example.taskapp

class TaskRepository {
    private val tasks = mutableListOf<Task>()
    private var idCounter = 1

    fun addTask(title: String, description: String) {
        tasks.add(Task(idCounter++, title, description, false))
        println("Task added successfully!")
    }

    fun viewTasks() {
        if (tasks.isEmpty()) {
            println("No tasks found.")
            return
        }
        tasks.forEach { println(it) }
    }
}
