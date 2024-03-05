package com.example.onlinestore.domain.repository

import com.example.onlinestore.domain.model.User

interface UserRepository {
    fun saveUser(user: User)
}