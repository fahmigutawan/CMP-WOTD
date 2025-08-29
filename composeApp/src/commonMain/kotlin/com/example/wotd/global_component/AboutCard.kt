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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.wotd.AppColors
import com.example.wotd.tts.TtsState
import com.example.wotd.vector.MyIconPack
import com.example.wotd.vector.myiconpack.IcEmail
import com.example.wotd.vector.myiconpack.IcGlobe
import com.example.wotd.vector.myiconpack.IcPerson
import com.example.wotd.vector.myiconpack.IcSound
import com.example.wotd.vector.myiconpack.IcSoundMute
import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.AngleDownSolid
import compose.icons.lineawesomeicons.AngleUpSolid

@Composable
fun AboutCard(
    modifier: Modifier = Modifier,
) {
    val uriHandler = LocalUriHandler.current

    ElevatedCard(
        modifier = modifier,
        colors = CardDefaults.elevatedCardColors(
            containerColor = AppColors.white
        )
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(vertical = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .padding(horizontal = 24.dp)
                    .clip(CircleShape)
                    .size(80.dp)
                    .background(
                        Brush.horizontalGradient(
                            listOf(
                                AppColors.orange300,
                                AppColors.orange100
                            )
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    modifier = Modifier.size(24.dp),
                    imageVector = MyIconPack.IcPerson,
                    contentDescription = null,
                    tint = AppColors.white
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                "Fahmi Noordin R",
                style = MaterialTheme.typography.headlineSmall
            )

            Text(
                "Mobile Developer",
                style = MaterialTheme.typography.titleMedium
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                "Contact",
                modifier = Modifier.align(Alignment.Start).padding(horizontal = 24.dp),
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            AboutItem(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp, vertical = 8.dp),
                icon = MyIconPack.IcEmail,
                title = "Email",
                value = "fahmigutawan@gmail.com",
                onClick = {
                    uriHandler.openUri("mailto:fahmigutawan@gmail.com")
                }
            )

            AboutItem(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp, vertical = 8.dp),
                icon = MyIconPack.IcGlobe,
                title = "Portfolio",
                value = "fahmigutawan.my.id",
                onClick = {
                    uriHandler.openUri("https://fahmigutawan.my.id")
                }
            )
        }
    }
}

@Composable
fun AboutItem(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    icon: ImageVector,
    title: String,
    value: String,
) {
    Row(
        modifier = Modifier
            .clickable { onClick() }
            .then(modifier),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .size(24.dp)
                .background(AppColors.orange200),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                modifier = Modifier.size(16.dp),
                imageVector = icon,
                contentDescription = null,
                tint = AppColors.white
            )
        }

        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                title,
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.Bold
            )

            Text(
                value,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}