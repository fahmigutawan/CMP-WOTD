package com.example.wotd.model

import kotlinx.serialization.Serializable

@Serializable
data class WordResponse(
    val word: String,
    val definitions: List<String>,
)