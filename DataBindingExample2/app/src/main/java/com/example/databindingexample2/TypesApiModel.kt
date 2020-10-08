package com.example.databindingexample2

import com.example.databindingexample2.Model.Category
import com.google.gson.annotations.SerializedName

data class TypesApiModel(

    @SerializedName("status") val status: Int,
    @SerializedName("message") val message: String,
    @SerializedName("data") val data: List<Category>
)