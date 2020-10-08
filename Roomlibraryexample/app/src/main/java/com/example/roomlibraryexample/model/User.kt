package com.example.roomlibraryexample.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbluser")
data class User(
    @PrimaryKey
    @ColumnInfo
    var id: Int,
    @ColumnInfo(name = "name")
    var name: String,
    @ColumnInfo(name = "role")
    var role: String,
    @ColumnInfo
    var phone: String
)