package com.example.databindingexample2.Model

import com.google.gson.annotations.SerializedName


data class Category(

    @SerializedName("id") val id: String,
    @SerializedName("type_name") val type_name: String,
    @SerializedName("image") val image: String,
    @SerializedName("default") val default: Int,
    @SerializedName("is_food") val is_food: Int

)