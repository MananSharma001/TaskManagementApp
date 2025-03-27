package com.example.taskapp

class TaskManager {
    private val taskRepository = TaskRepository()

    fun run() {
        while (true) {
            println("\n1. Add Task\n2. View Tasks\n3. Exit")
            print("Choose an option: ")
            when (readLine()?.toIntOrNull()) {
                1 -> {
                    print("Enter Task Title: ")
                    val title = readLine().orEmpty()
                    print("Enter Task Description: ")
                    val description = readLine().orEmpty()
                    taskRepository.addTask(title, description)
                }
                2 -> taskRepository.viewTasks()
                3 -> return
                else -> println("Invalid option. Try again.")
            }
        }
    }
}
