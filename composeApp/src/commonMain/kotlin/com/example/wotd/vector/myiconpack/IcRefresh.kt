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

public val MyIconPack.IcRefresh: ImageVector
    get() {
        if (_icRefresh != null) {
            return _icRefresh!!
        }
        _icRefresh = Builder(name = "IcRefresh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.0f, 4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.51f, 9.0f)
                curveTo(4.017f, 7.567f, 4.879f, 6.285f, 6.015f, 5.275f)
                curveTo(7.152f, 4.265f, 8.525f, 3.56f, 10.008f, 3.224f)
                curveTo(11.491f, 2.889f, 13.035f, 2.934f, 14.495f, 3.357f)
                curveTo(15.956f, 3.779f, 17.285f, 4.565f, 18.36f, 5.64f)
                lineTo(23.0f, 10.0f)
                moveTo(1.0f, 14.0f)
                lineTo(5.64f, 18.36f)
                curveTo(6.715f, 19.435f, 8.044f, 20.221f, 9.505f, 20.643f)
                curveTo(10.965f, 21.066f, 12.509f, 21.111f, 13.992f, 20.776f)
                curveTo(15.474f, 20.44f, 16.848f, 19.735f, 17.985f, 18.725f)
                curveTo(19.121f, 17.715f, 19.983f, 16.433f, 20.49f, 15.0f)
            }
        }
        .build()
        return _icRefresh!!
    }

private var _icRefresh: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyIconPack.IcRefresh, contentDescription = "")
    }
}
