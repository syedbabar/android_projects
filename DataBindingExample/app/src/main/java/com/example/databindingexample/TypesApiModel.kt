package com.example.boxesnew

import com.example.databindingexample.Model.Category
import com.google.gson.annotations.SerializedName

data class TypesApiModel(

    @SerializedName("status") val status: Int,
    @SerializedName("message") val message: String,
    @SerializedName("data") val data: List<Category>
)