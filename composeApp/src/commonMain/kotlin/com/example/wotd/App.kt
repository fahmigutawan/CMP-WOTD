package com.example.wotd

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import com.example.wotd.di.appModule
import com.example.wotd.di.viewModelModule
import com.example.wotd.presentation.splash.SplashScreen
import org.koin.compose.KoinMultiplatformApplication
import org.koin.core.annotation.KoinExperimentalAPI
import org.koin.dsl.KoinConfiguration

@OptIn(KoinExperimentalAPI::class)
@Composable
fun App() {
    MaterialTheme(
        colorScheme = appColorScheme,
        typography = appTypography()
    ) {
        Scaffold {
            KoinMultiplatformApplication(
                config = KoinConfiguration { modules(appModule, viewModelModule) }
            ) {
                Navigator(
                    screen = SplashScreen()
                )
            }
        }
    }
}