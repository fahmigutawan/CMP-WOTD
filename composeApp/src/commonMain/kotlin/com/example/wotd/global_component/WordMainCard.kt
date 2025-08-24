package com.example.wotd.global_component

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.wotd.AppColors
import com.example.wotd.tts.TtsState
import com.example.wotd.vector.MyIconPack
import com.example.wotd.vector.myiconpack.IcSound
import com.example.wotd.vector.myiconpack.IcSoundMute
import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.AngleDownSolid
import compose.icons.lineawesomeicons.AngleUpSolid

@Composable
fun WordMainCard(
    modifier: Modifier = Modifier,
    ttsState: TtsState,
    onVoiceClick: () -> Unit,
    word: String,
    definitions: List<String>,
    loading: Boolean
) {
    ElevatedCard(
        modifier = modifier,
        colors = CardDefaults.elevatedCardColors(
            containerColor = AppColors.white
        )
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(vertical = 48.dp, horizontal = 24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = word.uppercase(),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.Bold
                )
            )

            FilledIconButton(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(
                        if (ttsState == TtsState.NOT_AVAILABLE) {
                            Brush.horizontalGradient(
                                listOf(
                                    Color.LightGray
                                )
                            )
                        } else {
                            Brush.horizontalGradient(
                                listOf(
                                    AppColors.orange300,
                                    AppColors.orange200
                                )
                            )
                        }
                    ),
                onClick = onVoiceClick,
                colors = IconButtonDefaults.filledIconButtonColors(
                    containerColor = Color.Transparent
                ),
                shape = CircleShape,
                enabled = ttsState != TtsState.NOT_AVAILABLE
            ) {
                Icon(
                    imageVector = if (ttsState == TtsState.NOT_AVAILABLE) {
                        MyIconPack.IcSoundMute
                    } else {
                        MyIconPack.IcSound
                    },
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onPrimary
                )
            }

            if (loading) {
                CircularProgressIndicator(
                    strokeWidth = 5.dp,
                    modifier = Modifier.size(32.dp),
                    color = AppColors.darkBlue200
                )
            } else {
                ColumnWithScrollbar(
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = parseMarkdownBold(definitions.firstOrNull() ?: "-")
                    )
                }
            }
        }
    }
}

@Composable
fun DefinitionItem(
    modifier: Modifier = Modifier,
    index: Int,
    isExpand: Boolean,
    onExpandClick: (Boolean) -> Unit,
    definition: AnnotatedString
) {
    AnimatedContent(
        targetState = isExpand,
        transitionSpec = {
            fadeIn().togetherWith(fadeOut())
        }
    ) { _isExpand ->
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .clip(RoundedCornerShape(4.dp))
                    .background(AppColors.orange100),
                contentAlignment = Alignment.Center
            ) {
                Text("${index + 1}")
            }

            Text(
                modifier = Modifier.fillMaxWidth().weight(1f),
                text = definition,
                maxLines = if (_isExpand) Int.MAX_VALUE else 2,
                overflow = if (_isExpand) TextOverflow.Visible else TextOverflow.Ellipsis
            )

            Icon(
                modifier = Modifier
                    .size(32.dp)
                    .clip(CircleShape)
                    .clickable {
                        onExpandClick(!isExpand)
                    }.padding(8.dp),
                imageVector = if (isExpand) {
                    LineAwesomeIcons.AngleUpSolid
                } else {
                    LineAwesomeIcons.AngleDownSolid
                },
                contentDescription = null
            )
        }
    }
}