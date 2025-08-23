package com.example.wotd.global_component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.wotd.AppColors

@Composable
fun TextWithGradient(
    modifier: Modifier = Modifier,
    text: String,
    fontSize: TextUnit = 10.sp,
    fontWeight: FontWeight = FontWeight.Normal,
) {
    Text(
        text = text,
        modifier = modifier,
        fontSize = fontSize,
        fontWeight = fontWeight,
        style = TextStyle(
            brush = Brush.horizontalGradient(
                colors = listOf(
                    AppColors.orange300,
                    AppColors.orange200
                )
            )
        )
    )
}