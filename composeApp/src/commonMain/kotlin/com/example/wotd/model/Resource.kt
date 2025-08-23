package com.example.wotd.model

sealed class Resource<T>(
    val message: String?,
    val data:T? = null
) {
    class Success<T>(data: T) : Resource<T>(null, data)
    class Error<T>(message: String) : Resource<T>(message)
    class Loading<T> : Resource<T>(null)
}