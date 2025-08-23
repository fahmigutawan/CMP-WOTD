package com.example.wotd.vector.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.example.wotd.vector.MyIconPack

public val MyIconPack.IcGlobe: ImageVector
    get() {
        if (_icGlobe != null) {
            return _icGlobe!!
        }
        _icGlobe = Builder(name = "IcGlobe", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
                        StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(8.0f, 14.667f)
                    curveTo(11.682f, 14.667f, 14.667f, 11.682f, 14.667f, 8.0f)
                    curveTo(14.667f, 4.318f, 11.682f, 1.333f, 8.0f, 1.333f)
                    curveTo(4.318f, 1.333f, 1.333f, 4.318f, 1.333f, 8.0f)
                    curveTo(1.333f, 11.682f, 4.318f, 14.667f, 8.0f, 14.667f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
                        StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(1.333f, 8.0f)
                    horizontalLineTo(14.667f)
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
                        StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(8.0f, 1.333f)
                    curveTo(9.668f, 3.159f, 10.615f, 5.528f, 10.667f, 8.0f)
                    curveTo(10.615f, 10.472f, 9.668f, 12.841f, 8.0f, 14.667f)
                    curveTo(6.333f, 12.841f, 5.385f, 10.472f, 5.333f, 8.0f)
                    curveTo(5.385f, 5.528f, 6.333f, 3.159f, 8.0f, 1.333f)
                    close()
                }
            }
        }
        .build()
        return _icGlobe!!
    }

private var _icGlobe: ImageVector? = null
