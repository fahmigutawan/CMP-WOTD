package com.example.wotd.presentation.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wotd.data.Repository
import com.example.wotd.expect.AppLogger
import com.example.wotd.model.ApiWrapper
import com.example.wotd.model.Resource
import com.example.wotd.model.WordResponse
import com.example.wotd.tts.TtsState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(
    private val repository: Repository
) : ViewModel() {
    private val _word = MutableStateFlow<Resource<ApiWrapper<WordResponse>>>(Resource.Loading())
    val word get() = _word.asStateFlow()

    val ttsState = mutableStateOf(TtsState.INITIALIZING)

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getWord().collect {
                _word.value = it
            }
        }
    }

    fun refreshWord() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.refreshWord().collect {
                _word.value = it
            }
        }
    }
}