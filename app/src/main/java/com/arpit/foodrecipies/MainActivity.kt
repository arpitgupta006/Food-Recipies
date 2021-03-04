package com.arpit.foodrecipies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buSearch.setOnClickListener {
           val first = etFirstIng.text.toString()
           val second = etSecondIng.text.toString()
        }

        Client.api.getRecipes("first", "second").enqueue(object : Callback<List<ResultsItem>> {
            override fun onFailure(call: Call<List<ResultsItem>>, t: Throwable) {

            }

            override fun onResponse(call: Call<List<ResultsItem>>, response: Response<List<ResultsItem>>) {
                showRecipies(response.body()!!)
            }

        })
    }

    private fun showRecipies(memes: List<ResultsItem>) {
        rvNewsList.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ViewAdapter(memes)
        }

    }
}