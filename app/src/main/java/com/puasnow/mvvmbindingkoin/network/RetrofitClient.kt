package com.puasnow.mvvmbindingkoin.network

import com.google.gson.GsonBuilder
import com.puasnow.mvvmbindingkoin.config.URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    companion object {
        val webService: ApiService by lazy {
            Retrofit.Builder()
                .baseUrl(URL.BASEURL)
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
                .build().create(ApiService::class.java)
        }
    }
}