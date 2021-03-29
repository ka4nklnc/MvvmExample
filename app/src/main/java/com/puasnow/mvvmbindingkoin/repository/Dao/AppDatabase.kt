package com.puasnow.mvvmbindingkoin.repository.Dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.puasnow.mvvmbindingkoin.models.GithubUser

@Database(entities = [GithubUser::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract val userDao: UserDao
}