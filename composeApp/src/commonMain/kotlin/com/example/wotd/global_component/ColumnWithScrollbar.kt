package com.example.wotd.global_component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp

@Composable
fun ColumnWithScrollbar(
    modifier: Modifier = Modifier,
    verticalArrangement: Arrangement.Vertical = Arrangement.spacedBy(0.dp),
    alwaysShowScrollbar: Boolean = true,
    content: @Composable () -> Unit,
) {
    val scrollState = rememberScrollState()
    val columnHeight = remember {
        mutableStateOf(0.dp)
    }
    val density = LocalDensity.current
    Box {
        Column(
            modifier = modifier
                .verticalScroll(scrollState)
                .verticalScrollbar(
                    scrollState,
                    alwaysShowScrollbar = alwaysShowScrollbar
                )
                .onSizeChanged {
                    with(density) {
                        columnHeight.value = it.height.toDp()
                    }
                },
            verticalArrangement = verticalArrangement
        ) {
            content()
        }

//        if(alwaysShowScrollbar){
//            Box(
//                modifier = Modifier
//                    .clip(RoundedCornerShape(Int.MAX_VALUE.dp))
//                    .width(4.dp)
//                    .height(columnHeight.value)
//                    .background(Color.LightGray)
//                    .align(Alignment.CenterEnd)
//            )
//        }
    }
}