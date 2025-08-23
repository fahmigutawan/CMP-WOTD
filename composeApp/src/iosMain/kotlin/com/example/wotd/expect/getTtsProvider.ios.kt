package com.example.wotd.expect

import com.example.wotd.tts.TTSProvider

private var ttsProvider: () -> TTSProvider? = { null }

fun setTTSProvider(provider: () -> TTSProvider) {
    ttsProvider = provider
}

actual fun getTtsProvider(): TTSProvider {
    return ttsProvider.invoke() ?: throw Exception("Text to Speech not Provided")
}