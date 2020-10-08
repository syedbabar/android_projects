package com.example.roomlibraryexample

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.roomlibraryexample.model.AppDatabase
import com.example.roomlibraryexample.model.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: ArrayAdapter<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(this, AppDatabase::class.java, "user-list.db")
            .allowMainThreadQueries()
            .build()

        var data = db.userDao().getAllUser()

        adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, data)

        lv_user.adapter = adapter

        btn_submit.setOnClickListener {
            db.userDao().addUser(User(7, et_name.text.toString(), "admin", "03022243423"))
        }

        for (user in data) {
            Log.d("userData", user.id.toString() + " " + user.name + " " + user.role)
        }
    }

    override fun onResume() {
        super.onResume()

        adapter.notifyDataSetChanged()
    }
}
