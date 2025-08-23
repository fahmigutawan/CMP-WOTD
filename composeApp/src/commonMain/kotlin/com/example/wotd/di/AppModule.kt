package com.example.wotd.di

import com.example.wotd.data.RemoteSource
import com.example.wotd.data.Repository
import com.example.wotd.expect.AppLogger
import com.example.wotd.expect.createDataStore
import com.example.wotd.expect.getHttpClientEngine
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json
import org.koin.dsl.module

val appModule = module {
    single {
        HttpClient(getHttpClientEngine()) {
            install(ContentNegotiation) {
                json()
            }

            install(Logging){
                logger = object : Logger{
                    override fun log(message: String) {
                        AppLogger.d(tag = "Http Call", message = message)
                    }

                }
                level = LogLevel.ALL
            }
        }
    }

    single { createDataStore() }

    single { RemoteSource(get()) }

    single { Repository(get()) }
}

