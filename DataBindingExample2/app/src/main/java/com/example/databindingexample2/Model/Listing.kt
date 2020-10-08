package com.example.databindingexample2.Model

import com.google.gson.annotations.SerializedName

data class Listing(

    @SerializedName("id") val id: String,
    @SerializedName("listing_name") val listing_name: String,
    @SerializedName("image") val image: String,
    @SerializedName("listing_caption") val listing_caption: String,
    @SerializedName("type_id") val type_id: String,
    @SerializedName("delivery_time") val delivery_time: String,
    @SerializedName("distance") val distance: Double

)