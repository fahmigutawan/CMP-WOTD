package com.example.wotd.vector.myiconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wotd.vector.MyIconPack
import kotlin.Unit

public val MyIconPack.IcApp: ImageVector
    get() {
        if (_icApp != null) {
            return _icApp!!
        }
        _icApp = Builder(name = "IcApp", defaultWidth = 199.0.dp, defaultHeight = 167.0.dp,
                viewportWidth = 199.0f, viewportHeight = 167.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFFFF8B00), 0.58f to Color(0xFFEBDFD1), 1.0f
                    to Color(0xFF808080), start = Offset(107.5f,65.75f), end =
                    Offset(85.0f,176.0f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.07f, 17.24f)
                curveTo(162.98f, 10.37f, 170.9f, 7.16f, 177.76f, 10.07f)
                curveTo(184.63f, 12.98f, 187.84f, 20.9f, 184.93f, 27.77f)
                lineTo(140.32f, 133.13f)
                curveTo(129.44f, 158.81f, 91.52f, 153.16f, 88.6f, 125.43f)
                lineTo(86.07f, 101.38f)
                lineTo(73.43f, 131.39f)
                curveTo(62.52f, 157.31f, 24.2f, 151.36f, 21.66f, 123.36f)
                lineTo(13.06f, 28.73f)
                curveTo(12.38f, 21.3f, 17.85f, 14.73f, 25.28f, 14.06f)
                curveTo(32.7f, 13.38f, 39.27f, 18.86f, 39.94f, 26.28f)
                lineTo(48.55f, 120.92f)
                lineTo(61.19f, 90.9f)
                curveTo(72.02f, 65.17f, 110.0f, 70.79f, 112.92f, 98.55f)
                lineTo(115.45f, 122.6f)
                lineTo(160.07f, 17.24f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFFFF2F2)),
                    strokeLineWidth = 5.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.07f, 17.24f)
                curveTo(162.98f, 10.37f, 170.9f, 7.16f, 177.76f, 10.07f)
                curveTo(184.63f, 12.98f, 187.84f, 20.9f, 184.93f, 27.77f)
                lineTo(140.32f, 133.13f)
                curveTo(129.44f, 158.81f, 91.52f, 153.16f, 88.6f, 125.43f)
                lineTo(86.07f, 101.38f)
                lineTo(73.43f, 131.39f)
                curveTo(62.52f, 157.31f, 24.2f, 151.36f, 21.66f, 123.36f)
                lineTo(13.06f, 28.73f)
                curveTo(12.38f, 21.3f, 17.85f, 14.73f, 25.28f, 14.06f)
                curveTo(32.7f, 13.38f, 39.27f, 18.86f, 39.94f, 26.28f)
                lineTo(48.55f, 120.92f)
                lineTo(61.19f, 90.9f)
                curveTo(72.02f, 65.17f, 110.0f, 70.79f, 112.92f, 98.55f)
                lineTo(115.45f, 122.6f)
                lineTo(160.07f, 17.24f)
                close()
            }
        }
        .build()
        return _icApp!!
    }

private var _icApp: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyIconPack.IcApp, contentDescription = "")
    }
}
