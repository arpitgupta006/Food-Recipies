package com.arpit.foodrecipies

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Client {


    val retrofit = Retrofit.Builder()
        .baseUrl("http://www.recipepuppy.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val  api = retrofit.create(APIService::class.java)


}