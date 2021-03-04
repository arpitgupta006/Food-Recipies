package com.arpit.foodrecipies

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("href")
	val href: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("version")
	val version: Double? = null,

	@field:SerializedName("results")
	val results: List<ResultsItem?>? = null
)

