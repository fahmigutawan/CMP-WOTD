package com.example.wotd.global_component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import com.example.wotd.AppColors

@Composable
fun AppLayout(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Box(
        modifier =
            modifier
                .background(
                    Brush.verticalGradient(
                        listOf(
                            AppColors.orange100,
                            AppColors.white
                        )
                    )
                )
    ) {
        content()
    }
}