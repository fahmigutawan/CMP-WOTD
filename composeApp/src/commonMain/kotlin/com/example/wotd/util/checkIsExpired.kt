package com.example.wotd.util

import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlin.time.Clock
import kotlin.time.ExperimentalTime
import kotlin.time.Instant

@OptIn(ExperimentalTime::class)
fun Long.checkIsExpired(): Boolean {
    val now = Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault()).date
    val target = Instant.fromEpochMilliseconds(this)
        .toLocalDateTime(TimeZone.currentSystemDefault()).date
    return now > target
}