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
    Image(ProfileFilled, null)
}

private var profileFilled: ImageVector? = null

public val ProfileFilled: ImageVector
    get() {
        if (profileFilled != null) {
            return profileFilled!!
        }
        profileFilled = ImageVector.Builder(
            name = "ProfileFilled",
            defaultWidth = 26.666687.dp,
            defaultHeight = 26.666656.dp,
            viewportWidth = 26.6667f,
            viewportHeight = 26.6667f
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
                moveTo(20f, 15.33f)
                curveTo(20f, 14.22f, 19.1f, 13.33f, 18f, 13.33f)
                lineTo(8.66f, 13.33f)
                curveTo(7.56f, 13.33f, 6.66f, 14.22f, 6.66f, 15.33f)
                lineTo(6.66f, 16f)
                curveTo(6.66f, 18.62f, 9.14f, 21.33f, 13.33f, 21.33f)
                curveTo(17.52f, 21.33f, 20f, 18.62f, 20f, 16f)
                lineTo(20f, 15.33f)
                close()
                moveTo(17f, 8.33f)
                curveTo(17f, 6.3f, 15.35f, 4.66f, 13.33f, 4.66f)
                curveTo(11.3f, 4.66f, 9.66f, 6.3f, 9.66f, 8.33f)
                curveTo(9.66f, 10.35f, 11.3f, 12f, 13.33f, 12f)
                curveTo(15.35f, 12f, 17f, 10.35f, 17f, 8.33f)
                close()
                moveTo(26.66f, 13.33f)
                curveTo(26.66f, 20.69f, 20.69f, 26.66f, 13.33f, 26.66f)
                curveTo(5.96f, 26.66f, 0f, 20.69f, 0f, 13.33f)
                curveTo(0f, 5.96f, 5.96f, 0f, 13.33f, 0f)
                curveTo(20.69f, 0f, 26.66f, 5.96f, 26.66f, 13.33f)
                close()
                moveTo(24.66f, 13.33f)
                curveTo(24.66f, 7.07f, 19.59f, 2f, 13.33f, 2f)
                curveTo(7.07f, 2f, 2f, 7.07f, 2f, 13.33f)
                curveTo(2f, 19.59f, 7.07f, 24.66f, 13.33f, 24.66f)
                curveTo(19.59f, 24.66f, 24.66f, 19.59f, 24.66f, 13.33f)
                close()
            }
        }.build()
        return profileFilled!!
    }

