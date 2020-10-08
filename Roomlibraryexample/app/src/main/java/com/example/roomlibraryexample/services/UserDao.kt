package com.example.roomlibraryexample.services

import androidx.room.*
import com.example.roomlibraryexample.model.User

@Dao
interface UserDao {

    @Query("select * from tbluser")
    fun getAllUser(): List<User>

    @Query("delete from tbluser")
    fun deleteAllUser()

    @Query("select * from tbluser where role like:role")
    fun findUserByRole(role: String): User

    @Insert
    fun addUser(user: User)

    @Update
    fun updateUser(user: User)

    @Delete
    fun deleteUser(user: User)

}