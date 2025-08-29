package com.example.wotd.presentation.about

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import com.example.wotd.AppColors
import com.example.wotd.global_component.AboutCard
import com.example.wotd.global_component.AppLayout
import com.example.wotd.vector.MyIconPack
import com.example.wotd.vector.myiconpack.IcApp
import com.example.wotd.vector.myiconpack.IcInfo
import com.example.wotd.vector.myiconpack.OrnamentForBg
import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.ArrowAltCircleLeftSolid
import compose.icons.lineawesomeicons.ArrowLeftSolid
import compose.icons.lineawesomeicons.CaretLeftSolid
import compose.icons.lineawesomeicons.ChevronLeftSolid
import compose.icons.lineawesomeicons.StepBackwardSolid

class AboutScreen : Screen {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current

        Scaffold(
            topBar = {
                TopAppBar(
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = AppColors.orange100
                    ),
                    title = {
                        Text("Developer Profile")
                    },
                    navigationIcon = {
                        IconButton(
                            modifier = Modifier.padding(start = 8.dp),
                            onClick = {
                                navigator?.pop()
                            }
                        ) {
                            Icon(
                                imageVector = LineAwesomeIcons.ArrowLeftSolid,
                                contentDescription = null
                            )
                        }
                    }
                )
            }
        ) { paddingValues ->
            AppLayout(
                modifier = Modifier.padding(paddingValues).fillMaxSize()
            ) {
                Icon(
                    modifier = Modifier.fillMaxWidth(),
                    imageVector = MyIconPack.OrnamentForBg,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary
                )

                AboutCard(
                    modifier = Modifier
                        .padding(horizontal = 24.dp)
                        .padding(bottom = 24.dp)
                )
            }
        }
    }
}