package com.example.wotd.data

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import com.example.wotd.model.ApiMetadata
import com.example.wotd.model.ApiWrapper
import com.example.wotd.model.WordResponse
import kotlinx.coroutines.flow.map
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class LocalSource(
    private val datastore: DataStore<Preferences>
) {
    suspend fun saveWord(word: ApiWrapper<WordResponse>) {
        datastore.edit {
            it[stringPreferencesKey("word")] = Json.encodeToString(word)
        }
    }

    fun getWord() = datastore.data.map {
        val res = it[stringPreferencesKey("word")] ?: ""
        try {
            Json.decodeFromString<ApiWrapper<WordResponse>>(res)
        } catch (_: Exception) {
            ApiWrapper(
                metadata = ApiMetadata(200, ""),
                WordResponse("", emptyList())
            )
        }
    }

    suspend fun saveTncPassingState(){
        datastore.edit {
            it[booleanPreferencesKey("tnc_passing")] = true
        }
    }

    fun getTncPassingState() = datastore.data.map {
        it[booleanPreferencesKey("tnc_passing")] ?: false
    }
}