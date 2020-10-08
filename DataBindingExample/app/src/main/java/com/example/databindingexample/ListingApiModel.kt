package com.example.boxesnew

import com.example.databindingexample.Model.Listing
import com.google.gson.annotations.SerializedName

data class ListingApiModel(

    @SerializedName("status") val status: Int,
    @SerializedName("message") val message: String,
    @SerializedName("data") val data: List<Listing>
)
