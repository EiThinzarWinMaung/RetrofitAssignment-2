package com.example.foodparadise.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class apiClient {
    private val BASE_URL = "https://www.themealdb.com/api/json/v1/1/"

    private var apiInterface: ApiInterface

    init {
        val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
        apiInterface = retrofit.create(ApiInterface::class.java)
    }
}