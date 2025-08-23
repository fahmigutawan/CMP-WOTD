package com.example.wotd.expect

import com.example.wotd.ApplicationHolder
import okio.Path
import okio.Path.Companion.toOkioPath
import java.io.File

actual fun getDataStorePath(): Path {
    val file = File(
        ApplicationHolder.applicationContext.filesDir,
        dataStoreFileName
    )
    return file.toOkioPath()
}