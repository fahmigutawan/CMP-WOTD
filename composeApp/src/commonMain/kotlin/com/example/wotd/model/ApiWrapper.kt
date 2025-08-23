package com.example.wotd.model

import kotlinx.serialization.Serializable

@Serializable
data class ApiWrapper<T>(
    val metadata: ApiMetadata,
    val data: T?,
)
