package com.example.wotd.vector.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.example.wotd.vector.MyIconPack

public val MyIconPack.OrnamentForBg: ImageVector
    get() {
        if (_ornamentForBg != null) {
            return _ornamentForBg!!
        }
        _ornamentForBg = Builder(name = "OrnamentForBg", defaultWidth = 390.0.dp, defaultHeight =
                294.0.dp, viewportWidth = 390.0f, viewportHeight = 294.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFFFD2BA)),
                    strokeLineWidth = 31.459f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(-93.11f, -51.68f)
                lineTo(-61.96f, 79.84f)
                curveTo(-48.58f, 136.3f, -6.27f, 181.43f, 49.22f, 198.4f)
                lineTo(119.95f, 220.04f)
                curveTo(127.7f, 222.41f, 135.75f, 223.61f, 143.86f, 223.61f)
                lineTo(211.95f, 223.61f)
                curveTo(265.29f, 223.61f, 289.47f, 156.93f, 248.51f, 122.75f)
                verticalLineTo(122.75f)
                curveTo(238.26f, 114.19f, 225.32f, 109.5f, 211.95f, 109.5f)
                lineTo(207.7f, 109.5f)
                curveTo(152.16f, 109.5f, 119.52f, 171.93f, 151.22f, 217.54f)
                lineTo(169.83f, 244.32f)
                curveTo(177.43f, 255.25f, 187.73f, 264.04f, 199.73f, 269.83f)
                verticalLineTo(269.83f)
                curveTo(210.2f, 274.88f, 221.67f, 277.5f, 233.3f, 277.5f)
                lineTo(442.64f, 277.5f)
            }
        }
        .build()
        return _ornamentForBg!!
    }

private var _ornamentForBg: ImageVector? = null
