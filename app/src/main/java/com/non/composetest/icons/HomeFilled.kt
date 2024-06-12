import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(HomeFilled, null)
}

private var homeFilled: ImageVector? = null

public val HomeFilled: ImageVector
    get() {
        if (homeFilled != null) {
            return homeFilled!!
        }
        homeFilled = ImageVector.Builder(
            name = "HomeFilled",
            defaultWidth = 24.000000.dp,
            defaultHeight = 25.335938.dp,
            viewportWidth = 24f,
            viewportHeight = 25.3359f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF1675FF)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(10.06f, 0.7f)
                curveTo(11.18f, -0.24f, 12.81f, -0.24f, 13.93f, 0.7f)
                lineTo(22.93f, 8.29f)
                curveTo(23.6f, 8.86f, 24f, 9.7f, 24f, 10.58f)
                lineTo(24f, 23f)
                curveTo(24f, 24.29f, 22.95f, 25.33f, 21.66f, 25.33f)
                lineTo(17f, 25.33f)
                curveTo(15.71f, 25.33f, 14.66f, 24.29f, 14.66f, 23f)
                lineTo(14.66f, 16.32f)
                curveTo(14.66f, 16.14f, 14.51f, 15.99f, 14.33f, 15.99f)
                lineTo(9.66f, 15.99f)
                curveTo(9.48f, 15.99f, 9.33f, 16.14f, 9.33f, 16.32f)
                lineTo(9.33f, 23f)
                curveTo(9.33f, 24.29f, 8.28f, 25.33f, 7f, 25.33f)
                lineTo(2.33f, 25.33f)
                curveTo(1.04f, 25.33f, 0f, 24.29f, 0f, 23f)
                lineTo(0f, 10.58f)
                curveTo(0f, 9.7f, 0.39f, 8.86f, 1.06f, 8.29f)
                lineTo(10.06f, 0.7f)
                close()
                moveTo(12.64f, 2.23f)
                curveTo(12.27f, 1.92f, 11.72f, 1.92f, 11.35f, 2.23f)
                lineTo(2.35f, 9.82f)
                curveTo(2.13f, 10.01f, 2f, 10.29f, 2f, 10.58f)
                lineTo(2f, 23f)
                curveTo(2f, 23.18f, 2.14f, 23.33f, 2.33f, 23.33f)
                lineTo(7f, 23.33f)
                curveTo(7.18f, 23.33f, 7.33f, 23.18f, 7.33f, 23f)
                lineTo(7.33f, 16.32f)
                curveTo(7.33f, 15.03f, 8.37f, 13.99f, 9.66f, 13.99f)
                lineTo(14.33f, 13.99f)
                curveTo(15.62f, 13.99f, 16.66f, 15.03f, 16.66f, 16.32f)
                lineTo(16.66f, 23f)
                curveTo(16.66f, 23.18f, 16.81f, 23.33f, 17f, 23.33f)
                lineTo(21.66f, 23.33f)
                curveTo(21.85f, 23.33f, 22f, 23.18f, 22f, 23f)
                lineTo(22f, 10.58f)
                curveTo(22f, 10.29f, 21.87f, 10.01f, 21.64f, 9.82f)
                lineTo(12.64f, 2.23f)
                close()
            }
        }.build()
        return homeFilled!!
    }

