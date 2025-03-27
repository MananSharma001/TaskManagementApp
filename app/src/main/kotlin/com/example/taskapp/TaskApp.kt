package com.example.taskapp

object TaskApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val manager = TaskManager()
        manager.run()
    }
}
