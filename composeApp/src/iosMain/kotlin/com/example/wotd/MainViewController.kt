package com.example.wotd

import androidx.compose.ui.window.ComposeUIViewController
import com.example.wotd.expect.setTTSProvider
import com.example.wotd.tts.TTSProvider

fun MainViewController(ttsProvider: TTSProvider) = ComposeUIViewController(
    configure = {
        setTTSProvider { ttsProvider }
    }
) {
    App()
}