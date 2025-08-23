package com.example.wotd.presentation.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import com.example.wotd.AppColors
import com.example.wotd.global_component.TncDialog
import com.example.wotd.presentation.home.HomeScreen
import com.example.wotd.vector.MyIconPack
import com.example.wotd.vector.myiconpack.IcApp
import org.koin.compose.viewmodel.koinViewModel

class SplashScreen : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current
        val viewModel = koinViewModel<SplashViewModel>()

        if(viewModel.isTncPassed.value == false){
            TncDialog(
                onFinishClick = {
                    viewModel.isTncPassed.value = true
                }
            )
        }

        LaunchedEffect(viewModel.isTncPassed.value){
            if(viewModel.isTncPassed.value == true){
                navigator?.replace(HomeScreen())
            }
        }

        Column(
            modifier = Modifier.fillMaxSize().background(AppColors.orange300),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                modifier = Modifier.size(140.dp),
                imageVector = MyIconPack.IcApp,
                contentDescription = "",
                tint = Color.Unspecified
            )
//            Spacer(Modifier.height(12.dp))
//            CircularProgressIndicator(modifier = Modifier.size(34.dp), color = AppColors.white)
        }
    }
}