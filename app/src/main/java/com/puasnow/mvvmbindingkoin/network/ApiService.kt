package com.puasnow.mvvmbindingkoin.network

import com.puasnow.mvvmbindingkoin.config.URL
import com.puasnow.mvvmbindingkoin.config.URL.Companion.GETALLUSER
import com.puasnow.mvvmbindingkoin.models.GithubUser
import retrofit2.Call
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET

interface ApiService {
    @GET(GETALLUSER)
    suspend fun getAllUsers(): List<GithubUser>
}