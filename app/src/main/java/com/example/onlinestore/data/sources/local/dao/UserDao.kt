package com.example.onlinestore.data.sources.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import com.example.onlinestore.data.sources.local.model.User

@Dao
interface UserDao {
    @Insert
    suspend fun insertUser(user: User): Long

    @Delete
    suspend fun deleteUser(user: User): Long
}