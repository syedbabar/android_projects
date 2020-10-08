package com.example.databindingexample.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.databindingexample.Contact
import com.example.databindingexample.R
import com.example.databindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val contact = Contact()
        /*contact.setName("Syed aarish")
        contact.setEmail("aarish_shah@gmail.com")*/

        binding = DataBindingUtil.setContentView(this,
            R.layout.activity_main
        )
        binding.contact = Contact()

    }
}
