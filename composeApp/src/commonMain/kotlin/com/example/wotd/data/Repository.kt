package com.example.wotd.data

import com.example.wotd.expect.AppLogger
import com.example.wotd.model.ApiWrapper
import com.example.wotd.model.WordResponse
import com.example.wotd.util.checkIsExpired
import kotlinx.coroutines.flow.first
import kotlinx.serialization.json.Json

class Repository(
    private val remote: RemoteSource,
    private val local: LocalSource,
) {
    fun getWord() = getResponseWithDatastore(
        remoteGetter = {
            remote.getWord()
        },
        responseToBody = { res ->
            Json.decodeFromString<ApiWrapper<WordResponse>>(res)
        },
        needToGetRemote = {
            it.data?.date?.checkIsExpired() == true
        },
        localGetter = {
            local.getWord().first()
        },
        localInsert = {
            local.saveWord(it)
        }
    )

    fun refreshWord() = getResponseWithDatastore(
        remoteGetter = {
            remote.refreshWord()
        },
        responseToBody = { res ->
            Json.decodeFromString<ApiWrapper<WordResponse>>(res)
        },
        needToGetRemote = { true },
        localGetter = {
            local.getWord().first()
        },
        localInsert = {
            local.saveWord(it)
        }
    )

    suspend fun saveTncPassingState() = local.saveTncPassingState()

    fun getTncPassingState() = local.getTncPassingState()
}