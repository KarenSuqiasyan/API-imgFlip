package com.example.apiimgflipnewversion.util

sealed class Result<out S> {
    data class Success<S>(val data: S?) : Result<S>()
    data class Error<E>(val errors: MyException<E>) : Result<E>()
}