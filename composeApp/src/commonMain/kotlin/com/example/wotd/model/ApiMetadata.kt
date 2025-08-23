package com.example.wotd.model

import kotlinx.serialization.Serializable

@Serializable
data class ApiMetadata(
    val status:Int,
    val message: String
)
