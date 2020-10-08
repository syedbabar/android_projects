package com.example.databindingexample

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.databindingexample.databinding.ActivityMain2Binding

class Main2Activity : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)

        binding.ivImage.setImageResource(R.mipmap.ic_launcher_round)
        binding.tvModelName.setTextColor(Color.BLUE)
        binding.tvModelEmail.setTextColor(Color.RED)
        binding.user = User("Syed aarish", "aarish_shah47@gmail.com")

        binding.handler = EventHandler(this)
        binding.btn.text
    }
}
