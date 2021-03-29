package com.puasnow.mvvmbindingkoin.repository

import com.puasnow.mvvmbindingkoin.network.ApiService
import com.puasnow.mvvmbindingkoin.repository.Dao.UserDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UserRepository(private val apiService: ApiService, private val userDao: UserDao) {
    val data = userDao.findAll()

    suspend fun refresh() {
        withContext(Dispatchers.IO) {
            val users = apiService.getAllUsers()
            userDao.add(users)
        }
    }
}