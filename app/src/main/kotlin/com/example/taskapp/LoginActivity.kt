package com.example.taskapp

class LoginActivity {
    fun login(username: String, password: String): Boolean {
        return username == "admin" && password == "password"
    }
}
