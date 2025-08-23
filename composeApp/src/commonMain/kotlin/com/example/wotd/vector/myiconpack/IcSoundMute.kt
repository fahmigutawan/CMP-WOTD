package com.example.wotd.vector.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.example.wotd.vector.MyIconPack

public val MyIconPack.IcSoundMute: ImageVector
    get() {
        if (_icSoundMute != null) {
            return _icSoundMute!!
        }
        _icSoundMute = Builder(name = "IcSoundMute", defaultWidth = 20.0.dp, defaultHeight =
                20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.167f, 4.167f)
                lineTo(5.0f, 7.5f)
                horizontalLineTo(1.667f)
                verticalLineTo(12.5f)
                horizontalLineTo(5.0f)
                lineTo(9.167f, 15.833f)
                verticalLineTo(4.167f)
                close()
            }
        }
        .build()
        return _icSoundMute!!
    }

private var _icSoundMute: ImageVector? = null
