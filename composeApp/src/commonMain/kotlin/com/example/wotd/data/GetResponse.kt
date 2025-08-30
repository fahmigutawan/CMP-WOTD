package com.example.wotd.data

import com.example.wotd.model.Resource
import io.ktor.client.call.body
import io.ktor.client.statement.HttpResponse
import kotlinx.coroutines.flow.flow
import io.ktor.client.statement.bodyAsText

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

inline fun <reified Type> getResponseWithDatastore(
    crossinline remoteGetter: suspend () -> HttpResponse,
    crossinline responseToBody: suspend (json: String) -> Type,
    crossinline needToGetRemote:(Type) -> Boolean,
    crossinline localGetter: suspend () -> Type,
    crossinline localInsert: suspend (Type) -> Unit,
) = flow {
    emit(Resource.Loading())
    val local = localGetter()

    try {
        if(needToGetRemote(local)){
            val remote = remoteGetter()
            val remoteConverted = responseToBody(remote.bodyAsText())
            localInsert(remoteConverted)
            emit(Resource.Success(remoteConverted))
        } else {
            emit(Resource.Success(local))
        }
    } catch (e: Exception) {
        e.printStackTrace()
        try {
            emit(Resource.Success(local))
        }catch (e2: Exception){
            e2.printStackTrace()
            emit(Resource.Error(e2.message.toString()))
        }
    }
}