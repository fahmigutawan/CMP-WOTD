package com.example.wotd.expect

import android.speech.tts.TextToSpeech
import com.example.wotd.ApplicationHolder
import com.example.wotd.util.tts.TTSProvider
import java.util.Locale

actual fun getTtsProvider(): TTSProvider {
    var tts: TextToSpeech? = null

    val obj = object : TTSProvider {
        override fun initialize(onSuccess: () -> Unit, onFailed: () -> Unit) {
            tts = TextToSpeech(ApplicationHolder.applicationContext){ status ->
                if(status == TextToSpeech.SUCCESS){
                    onSuccess()
                } else {
                    onFailed()
                }
            }

            tts.apply {
                language = Locale.ENGLISH
            }
        }

        override fun speak(
            text: String,
            onStart: () -> Unit,
            onComplete: () -> Unit
        ) {
            onStart()
            tts?.speak(text, TextToSpeech.QUEUE_ADD, null, "tts")
            onComplete()
        }
    }

    return obj
}