package com.example.wotd.expect

import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import okio.Path

fun createDataStore() = PreferenceDataStoreFactory
    .createWithPath(produceFile = { getDataStorePath() })

const val dataStoreFileName = "datastore.preferences_pb"
expect fun getDataStorePath(): Path