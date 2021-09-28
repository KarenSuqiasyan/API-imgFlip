package com.example.apiimgflipnewversion.data.remote.retrofit

import com.example.apiimgflipnewversion.domain.model.GetMemesResponse
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitServices {
    @GET("get_memes")
   suspend fun getMemeList(): Response<GetMemesResponse?>
}