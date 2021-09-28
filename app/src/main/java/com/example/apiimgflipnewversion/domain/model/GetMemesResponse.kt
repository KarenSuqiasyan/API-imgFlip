package com.example.apiimgflipnewversion.domain.model

import com.google.gson.annotations.SerializedName

data class GetMemesResponse(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("success")
    val success: Boolean
)