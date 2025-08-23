package com.example.wotd.vector.myiconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wotd.vector.MyIconPack
import kotlin.Unit

public val MyIconPack.IcSound: ImageVector
    get() {
        if (_icSound != null) {
            return _icSound!!
        }
        _icSound = Builder(name = "IcSound", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp,
                viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
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
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.892f, 4.108f)
                curveTo(17.454f, 5.671f, 18.331f, 7.79f, 18.331f, 10.0f)
                curveTo(18.331f, 12.21f, 17.454f, 14.329f, 15.892f, 15.892f)
                moveTo(12.95f, 7.05f)
                curveTo(13.731f, 7.831f, 14.17f, 8.891f, 14.17f, 9.996f)
                curveTo(14.17f, 11.101f, 13.731f, 12.16f, 12.95f, 12.942f)
            }
        }
        .build()
        return _icSound!!
    }

private var _icSound: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyIconPack.IcSound, contentDescription = "")
    }
}
