package com.example.wotd.data

import com.example.wotd.model.Resource
import io.ktor.client.call.body
import io.ktor.client.statement.HttpResponse
import kotlinx.coroutines.flow.flow

inline fun <reified T> getResponse(
    crossinline httpCall:suspend () -> HttpResponse
) = flow {
    emit(Resource.Loading())

    try {
        val res = httpCall()
        val body = res.body<T>()
        emit(Resource.Success(body))
    }catch (e: Exception){
        emit(Resource.Error(e.message.toString()))
    }
}