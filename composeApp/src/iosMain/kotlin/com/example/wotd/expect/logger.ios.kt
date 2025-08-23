package com.example.wotd.expect

import platform.Foundation.NSLog

actual object AppLogger {
    actual fun e(tag: String, message: String, throwable: Throwable?) {
        if (throwable != null) {
            NSLog("[ERROR] %s: %s\n%s", tag, message, throwable.message ?: "Unknown error")
        } else {
            NSLog("[ERROR] %s: %s", tag, message)
        }
    }

    actual fun d(tag: String, message: String) {
        NSLog("[DEBUG] %s: %s", tag, message)
    }

    actual fun i(tag: String, message: String) {
        NSLog("[INFO] %s: %s", tag, message)
    }
}