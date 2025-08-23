package com.example.wotd.presentation.splash

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel: ViewModel() {
    val isTncPassed = mutableStateOf<Boolean?>(null)
    init {
        viewModelScope.launch {
            delay(1500)
            isTncPassed.value = false
        }
    }
}