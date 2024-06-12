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
    Image(AlarmOutlined, null)
}

private var alarmOutlined: ImageVector? = null

public val AlarmOutlined: ImageVector
    get() {
        if (alarmOutlined != null) {
            return alarmOutlined!!
        }
        alarmOutlined = ImageVector.Builder(
            name = "AlarmOutlined",
            defaultWidth = 26.666809.dp,
            defaultHeight = 25.333344.dp,
            viewportWidth = 26.6668f,
            viewportHeight = 25.3333f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF141A1E)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(9.47f, 1.96f)
                curveTo(8.49f, 0.76f, 7f, 0f, 5.33f, 0f)
                curveTo(2.38f, 0f, 0f, 2.38f, 0f, 5.33f)
                curveTo(0f, 7f, 0.76f, 8.49f, 1.96f, 9.47f)
                curveTo(1.55f, 10.68f, 1.33f, 11.98f, 1.33f, 13.33f)
                curveTo(1.33f, 16.28f, 2.4f, 18.99f, 4.17f, 21.08f)
                lineTo(1.62f, 23.62f)
                curveTo(1.23f, 24.01f, 1.23f, 24.64f, 1.62f, 25.04f)
                curveTo(2.01f, 25.43f, 2.64f, 25.43f, 3.04f, 25.04f)
                lineTo(5.58f, 22.49f)
                curveTo(7.67f, 24.26f, 10.37f, 25.33f, 13.33f, 25.33f)
                curveTo(16.28f, 25.33f, 18.99f, 24.26f, 21.08f, 22.49f)
                lineTo(23.62f, 25.04f)
                curveTo(24.01f, 25.43f, 24.64f, 25.43f, 25.04f, 25.04f)
                curveTo(25.43f, 24.64f, 25.43f, 24.01f, 25.04f, 23.62f)
                lineTo(22.49f, 21.08f)
                curveTo(24.26f, 18.99f, 25.33f, 16.28f, 25.33f, 13.33f)
                curveTo(25.33f, 11.98f, 25.11f, 10.68f, 24.69f, 9.47f)
                curveTo(25.89f, 8.49f, 26.66f, 7f, 26.66f, 5.33f)
                curveTo(26.66f, 2.38f, 24.27f, 0f, 21.33f, 0f)
                curveTo(19.66f, 0f, 18.17f, 0.76f, 17.19f, 1.96f)
                curveTo(15.98f, 1.55f, 14.68f, 1.33f, 13.33f, 1.33f)
                curveTo(11.98f, 1.33f, 10.68f, 1.55f, 9.47f, 1.96f)
                close()
                moveTo(5.33f, 2f)
                curveTo(6.17f, 2f, 6.94f, 2.31f, 7.53f, 2.82f)
                curveTo(5.55f, 3.92f, 3.92f, 5.55f, 2.82f, 7.53f)
                curveTo(2.31f, 6.94f, 2f, 6.17f, 2f, 5.33f)
                curveTo(2f, 3.49f, 3.49f, 2f, 5.33f, 2f)
                close()
                moveTo(19.13f, 2.82f)
                curveTo(19.72f, 2.31f, 20.49f, 2f, 21.33f, 2f)
                curveTo(23.17f, 2f, 24.66f, 3.49f, 24.66f, 5.33f)
                curveTo(24.66f, 6.17f, 24.35f, 6.94f, 23.83f, 7.53f)
                curveTo(22.74f, 5.55f, 21.11f, 3.92f, 19.13f, 2.82f)
                close()
                moveTo(12.33f, 6.66f)
                curveTo(12.88f, 6.66f, 13.33f, 7.11f, 13.33f, 7.66f)
                lineTo(13.33f, 13.33f)
                lineTo(17f, 13.33f)
                curveTo(17.55f, 13.33f, 18f, 13.78f, 18f, 14.33f)
                curveTo(18f, 14.88f, 17.55f, 15.33f, 17f, 15.33f)
                lineTo(12.33f, 15.33f)
                curveTo(11.78f, 15.33f, 11.33f, 14.88f, 11.33f, 14.33f)
                lineTo(11.33f, 7.66f)
                curveTo(11.33f, 7.11f, 11.78f, 6.66f, 12.33f, 6.66f)
                close()
            }
        }.build()
        return alarmOutlined!!
    }

