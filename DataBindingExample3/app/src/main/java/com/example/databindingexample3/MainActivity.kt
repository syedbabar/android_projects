package com.example.databindingexample3

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.databindingexample3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CustomClickListener {

    lateinit var binding: ActivityMainBinding

    var data = Data()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.data = data
        binding.handler = this

    }

    override fun onClick(view: View) {

        data.setData((data.getData().toInt()) + 1)


        Toast.makeText(this, "Oh yeah data binding works!!" + data.getData(), Toast.LENGTH_SHORT)
            .show()
    }
}
