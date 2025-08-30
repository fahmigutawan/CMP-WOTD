package com.example.wotd.presentation.splash

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wotd.data.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import org.koin.compose.koinInject

class SplashViewModel(
    private val repository: Repository
): ViewModel() {
    val isTncPassed = mutableStateOf<Boolean?>(null)

    fun saveTncPassingState(){
        viewModelScope.launch(Dispatchers.IO) {
            repository.saveTncPassingState()
        }
    }

    init {
        viewModelScope.launch {
            delay(1500)
            isTncPassed.value = repository.getTncPassingState().first()
        }

        viewModelScope.launch(Dispatchers.IO) {
            repository.getTncPassingState().collect{
                isTncPassed.value = it
            }
        }
    }
}