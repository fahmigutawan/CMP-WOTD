package com.example.wotd.di

import com.example.wotd.presentation.home.HomeViewModel
import com.example.wotd.presentation.splash.SplashViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { SplashViewModel(get()) }
    viewModel { HomeViewModel(get()) }
}