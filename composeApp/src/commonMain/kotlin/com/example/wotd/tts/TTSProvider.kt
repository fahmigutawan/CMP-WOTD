package com.example.wotd.tts

interface TTSProvider {
    fun initialize(
        onSuccess:() -> Unit,
        onFailed: () -> Unit
    )
    fun speak(
        text: String,
        onStart: () -> Unit,
        onComplete: () -> Unit
    )
}