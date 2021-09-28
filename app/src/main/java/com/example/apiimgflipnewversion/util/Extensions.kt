package com.example.apiimgflipnewversion.util

import android.util.Log
import retrofit2.Response


suspend fun <R> makeApiCall(
    call: suspend () -> Result<R>,
    errorMessage: Int = 4567
) = try {
    call()
} catch (e: Exception) {
    Log.i("ErrorMessage", "makeApiCall: ${e.message}")
    Result.Error(MyException<Nothing>(errorMessage, e.message))
}

fun <R> analyzeResponse(response: Response<R>): Result<R> {
    return when (response.code()) {
        200 -> {
            val responseBody = response.body()
            Result.Success(responseBody)
        }
        else -> {
            Result.Error(MyException<Nothing>(response.code(), response.message()))
        }
    }
}
