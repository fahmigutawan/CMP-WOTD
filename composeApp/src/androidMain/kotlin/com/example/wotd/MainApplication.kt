package com.example.wotd

import android.app.Application

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        ApplicationHolder.init(this)
    }
}