package com.example.wotd.data

import io.ktor.client.HttpClient
import io.ktor.client.request.get

class RemoteSource (
    private val httpClient: HttpClient
) {
    suspend fun getWord() = httpClient.get("http://145.79.13.138:9876/word")
}