package com.example.wotd

import android.app.Application

object ApplicationHolder {
    lateinit var applicationContext: Application
        private set

    fun init(app: Application) {
        applicationContext = app
    }
}
