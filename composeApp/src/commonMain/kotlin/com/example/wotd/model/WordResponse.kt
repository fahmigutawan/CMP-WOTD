package com.example.wotd.model

import kotlinx.serialization.Serializable
import kotlin.time.Clock
import kotlin.time.ExperimentalTime

@Serializable
data class WordResponse @OptIn(ExperimentalTime::class) constructor(
    val word: String,
    val definitions: List<String>,
    val date:Long = Clock.System.now().toEpochMilliseconds()
)