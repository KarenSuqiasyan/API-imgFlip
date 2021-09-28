package com.example.apiimgflipnewversion.data.di


import com.example.apiimgflipnewversion.util.Constants
import com.example.apiimgflipnewversion.data.remote.retrofit.RetrofitServices
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val retrofitModule = module {
    single { retrofitClient() }
    single { retrofitService(get()) }

}



private fun retrofitClient(
): Retrofit =
    Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

private fun retrofitService(retrofit: Retrofit): RetrofitServices =
    retrofit.create(RetrofitServices::class.java)

