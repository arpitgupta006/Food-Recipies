package com.arpit.foodrecipies

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Query

const val base_url = "http://www.recipepuppy.com/api/"



interface APIService {
    @GET("?")

    fun getRecipes(@Query("i")i:String ,@Query("q")q :String) : Call<List<ResultsItem>>


    //https://newsapi.org/v2/top-headlines?apiKey=$api_key&country=in&page=2
}

