package com.example.wotd.data

import com.example.wotd.model.ApiWrapper
import com.example.wotd.model.WordResponse

class Repository (
    private val remote: RemoteSource
){
    fun getWord() = getResponse<ApiWrapper<WordResponse>> {
        remote.getWord()
    }
}