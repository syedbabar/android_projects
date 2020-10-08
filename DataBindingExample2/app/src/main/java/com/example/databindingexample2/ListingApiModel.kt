package com.example.databindingexample2

import com.example.databindingexample2.Model.Listing
import com.google.gson.annotations.SerializedName

data class ListingApiModel(

    @SerializedName("status") val status: Int,
    @SerializedName("message") val message: String,
    @SerializedName("data") val data: List<Listing>
)
