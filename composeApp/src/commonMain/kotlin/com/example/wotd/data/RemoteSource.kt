package com.example.wotd.data

import io.ktor.client.HttpClient
import io.ktor.client.request.get

class RemoteSource (
    private val httpClient: HttpClient
) {
    suspend fun getWord() = httpClient.get("https://api.yourwotd.my.id/word")
    suspend fun refreshWord() = httpClient.get("https://api.yourwotd.my.id/refresh")
}