package com.example.databindingexample

class User(name: String, email: String) {

    var nName = name
    var nEmail = email

    fun getName(): String {
        return nName
    }

    fun getEmail(): String {
        return nEmail
    }

}