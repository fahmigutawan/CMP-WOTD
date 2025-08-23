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

public val MyIconPack.IcPerson: ImageVector
    get() {
        if (_icPerson != null) {
            return _icPerson!!
        }
        _icPerson = Builder(name = "IcPerson", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 21.0f)
                verticalLineTo(19.0f)
                curveTo(20.0f, 17.939f, 19.579f, 16.922f, 18.828f, 16.172f)
                curveTo(18.078f, 15.421f, 17.061f, 15.0f, 16.0f, 15.0f)
                horizontalLineTo(8.0f)
                curveTo(6.939f, 15.0f, 5.922f, 15.421f, 5.172f, 16.172f)
                curveTo(4.421f, 16.922f, 4.0f, 17.939f, 4.0f, 19.0f)
                verticalLineTo(21.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                curveTo(14.209f, 11.0f, 16.0f, 9.209f, 16.0f, 7.0f)
                curveTo(16.0f, 4.791f, 14.209f, 3.0f, 12.0f, 3.0f)
                curveTo(9.791f, 3.0f, 8.0f, 4.791f, 8.0f, 7.0f)
                curveTo(8.0f, 9.209f, 9.791f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _icPerson!!
    }

private var _icPerson: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyIconPack.IcPerson, contentDescription = "")
    }
}
