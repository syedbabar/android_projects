package com.example.databindingexample

import android.content.Context
import android.widget.Toast

class EventHandler(context: Context) {
    private var context = context

    fun onButtonClick(text: String) {
        Toast.makeText(context, "Hello $text", Toast.LENGTH_SHORT).show()
    }
}