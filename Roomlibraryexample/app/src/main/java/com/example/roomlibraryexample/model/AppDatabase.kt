package com.example.roomlibraryexample.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomlibraryexample.services.UserDao

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}