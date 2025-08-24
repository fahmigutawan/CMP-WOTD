package com.example.wotd.presentation.home

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import cafe.adriel.voyager.core.screen.Screen
import com.example.wotd.AppColors
import com.example.wotd.expect.getTtsProvider
import com.example.wotd.global_component.AppLayout
import com.example.wotd.global_component.ButtonWithGradient
import com.example.wotd.global_component.WordMainCard
import com.example.wotd.model.Resource
import com.example.wotd.presentation.home.components.HomeTopAppBar
import com.example.wotd.tts.TtsState
import com.example.wotd.vector.MyIconPack
import com.example.wotd.vector.myiconpack.IcRefresh
import com.example.wotd.vector.myiconpack.OrnamentForBg
import org.koin.compose.viewmodel.koinViewModel

class HomeScreen : Screen {
    @Composable
    override fun Content() {
        val viewModel = koinViewModel<HomeViewModel>()
        val word = viewModel.word.collectAsStateWithLifecycle()
        val ttsProvider = getTtsProvider().apply {
            initialize(
                onSuccess = {
                    viewModel.ttsState.value = TtsState.IDLE
                },
                onFailed = {
                    viewModel.ttsState.value = TtsState.NOT_AVAILABLE
                }
            )
        }

        Scaffold(
            topBar = {
                HomeTopAppBar(
                    onAboutClick = {
                        //TODO
                    }
                )
            },
            bottomBar = {
                BottomAppBar(
                    containerColor = AppColors.white
                ) {
                    ButtonWithGradient(
                        modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp),
                        onClick = {
                            viewModel.refreshWord()
                        },
                        shape = RoundedCornerShape(Int.MAX_VALUE.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            Icon(
                                imageVector = MyIconPack.IcRefresh,
                                contentDescription = null
                            )
                            Text("Get New Word")
                        }
                    }
                }
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

                WordMainCard(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp)
                        .padding(bottom = 24.dp),
                    ttsState = viewModel.ttsState.value,
                    onVoiceClick = {
                        ttsProvider.speak(
                            text = word.value?.data?.data?.word ?: "",
                            onStart = {
                                viewModel.ttsState.value = TtsState.SPEAKING
                            },
                            onComplete = {
                                viewModel.ttsState.value = TtsState.IDLE
                            }
                        )
                    },
                    word = word.value?.data?.data?.word ?: "-",
                    definitions = word.value?.data?.data?.definitions.orEmpty(),
                    loading = word.value is Resource.Loading
                )
            }
        }
    }
}