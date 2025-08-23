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

public val MyIconPack.IcEmail: ImageVector
    get() {
        if (_icEmail != null) {
            return _icEmail!!
        }
        _icEmail = Builder(name = "IcEmail", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.667f, 2.667f)
                horizontalLineTo(13.333f)
                curveTo(14.067f, 2.667f, 14.667f, 3.267f, 14.667f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(14.667f, 12.733f, 14.067f, 13.333f, 13.333f, 13.333f)
                horizontalLineTo(2.667f)
                curveTo(1.933f, 13.333f, 1.333f, 12.733f, 1.333f, 12.0f)
                verticalLineTo(4.0f)
                curveTo(1.333f, 3.267f, 1.933f, 2.667f, 2.667f, 2.667f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.667f, 4.0f)
                lineTo(8.0f, 8.667f)
                lineTo(1.333f, 4.0f)
            }
        }
        .build()
        return _icEmail!!
    }

private var _icEmail: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyIconPack.IcEmail, contentDescription = "")
    }
}
