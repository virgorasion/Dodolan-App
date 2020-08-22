package com.fazahidah.dodolan.model

// User Data class to show on the screen
// Simple Data User will do for the app for now
// TODO: update User & make data class for Database

data class User(
    val name: String,
    val username: String,
    val password: String,
    val email: String
)