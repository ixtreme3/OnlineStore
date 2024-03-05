package com.example.onlinestore.data.sources.local.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.onlinestore.data.sources.local.dao.UserDao
import com.example.onlinestore.data.sources.local.model.User

@Database(
    entities = [User::class],
    version = 1,
    exportSchema = false
)
abstract class UserDatabase : RoomDatabase() {
    abstract fun userDao() : UserDao

    companion object {
        private var INSTANCE: UserDatabase? = null

        @Synchronized
        fun getInstance(context: Context): UserDatabase {
            var instance = INSTANCE
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                    "user.db"
                ).build()
                INSTANCE = instance
            }
            return instance
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}