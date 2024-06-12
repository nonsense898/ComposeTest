package com.non.composetest.screens

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Animatable
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.non.composetest.R


@SuppressLint("UnusedBoxWithConstraintsScope")
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ReminderScreen() {
    val default = 0

    var expanded by remember { mutableStateOf(true) }

    // visible state
    var state by remember { mutableStateOf(false) }


    val gradientBrush = Brush.verticalGradient(
        colors = listOf(Color(0xFF0090F6), Color(0xFF004DF4)), // Gradient colors
        startY = 0f, // Starting Y position of the gradient
        endY = 500f // Ending Y position of the gradient
    )

    Column(
        modifier = Modifier
            .background(colorResource(R.color.reminder_screen))
            .padding(0.dp, 0.dp, 0.dp, 100.dp)
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
    ) {

        Text(
            "Reminder",
            modifier = Modifier
                .padding(16.dp, 70.dp, 0.dp, 16.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            fontFamily = FontFamily(
                Font(R.font.nunito_bold)
            ), fontSize = 40.sp
        )


        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(R.color.reminder_screen)),
            verticalArrangement = Arrangement.Center
        ) {

            Box() {

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(16.dp, 70.dp, 16.dp, 12.dp),
                    shape = RoundedCornerShape(16.dp),
                    elevation = CardDefaults.cardElevation(10.dp)
                ) {

                    // Enable to animate
                    AnimatedVisibility(visible = state) {
                        Box(
                            modifier = Modifier
                                .background(brush = gradientBrush)
                                .padding(15.dp, 5.dp, 15.dp, 21.dp)
                                .fillMaxSize()
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .wrapContentHeight()
                            ) {

                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .wrapContentHeight(),
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.ic_notify_white),
                                        contentDescription = "image",
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .padding(5.dp, 25.dp, 5.dp, 5.dp)
                                            .wrapContentWidth()
                                            .wrapContentHeight()
                                    )
                                }

                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .wrapContentHeight(),
                                    horizontalAlignment = Alignment.CenterHorizontally

                                ) {
                                    Text(
                                        "Allow Notifications",
                                        modifier = Modifier.padding(5.dp),
                                        fontFamily = FontFamily(Font(R.font.nunito_bold)),
                                        fontSize = 18.sp, color = Color.White,
                                        textAlign = TextAlign.Center,
                                        fontWeight = FontWeight(700)

                                    )
                                }

                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .wrapContentHeight(),
                                    horizontalAlignment = Alignment.CenterHorizontally

                                ) {
                                    Text(
                                        "We will help you not forgot about your water balance",
                                        modifier = Modifier.padding(55.dp, 0.dp, 55.dp, 0.dp),
                                        fontFamily = FontFamily(Font(R.font.nunito_bold)),
                                        fontSize = 14.sp, color = Color(0xFF80FFFFFF),
                                        textAlign = TextAlign.Center,
                                        fontWeight = FontWeight(500)

                                    )
                                }
                            }


                        }
                    }
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(90.dp)
                        .padding(16.dp, 16.dp, 16.dp, 0.dp),
                    shape = RoundedCornerShape(16.dp),
                    elevation = CardDefaults.cardElevation(5.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .background(Color.White)
                            .padding(15.dp, 21.dp, 15.dp, 0.dp)
                            .fillMaxSize()
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {

                            Image(
                                painter = if(state) painterResource(id = R.drawable.ic_notify) else painterResource(id = R.drawable.ic_notify_disabled),
                                contentDescription = "image",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .width(24.dp)
                                    .height(20.dp)
                            )

                            Text(
                                "Notifications",
                                modifier = Modifier,
                                fontFamily = FontFamily(Font(R.font.nunito_bold)),
                                fontSize = 18.sp, color = Color.Black,
                            )



                            DarkModeSwitch(
                                state,
                                Modifier
                                    .height(28.dp)
                                    .width(60.dp)
                            ) {
                                state = it
                            }



                        }

                    }
                }

            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(290.dp)
                .padding(16.dp, 16.dp, 16.dp, 12.dp),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(5.dp)
        ) {
            Box(
                modifier = Modifier
                    .background(if (state) Color.White else Color(0xFFEFEFF3))
                    .padding(15.dp, 21.dp, 15.dp, 21.dp)
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                ) {

                    Text(
                        "Schedule",
                        modifier = Modifier,
                        fontFamily = FontFamily(Font(R.font.nunito_bold)),
                        fontSize = 18.sp,
                        color = if (state) colorResource(R.color.title_h1) else Color(0xFF898C8E),
                        fontWeight = FontWeight(900)
                    )

                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(color = colorResource(R.color.spacer))
                            .height(1.dp)
                    )

                    Column(
                        modifier = Modifier
                            .padding(0.dp, 13.dp, 0.dp, 0.dp)
                            .fillMaxWidth()
                    ) {
                        //Start frame
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(45.dp)
                        ) {

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .weight(1.3f)
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                    ) {
                                        Text(
                                            "Start",
                                            modifier = Modifier,
                                            fontFamily = FontFamily(Font(R.font.nunito_bold)),
                                            fontSize = 16.sp,
                                            color = if (state) colorResource(R.color.title_h2) else Color(
                                                0xFF898C8E
                                            ),
                                            fontWeight = FontWeight(700)

                                        )

                                    }
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                    ) {
                                        Text(
                                            "Time when you woke up",
                                            modifier = Modifier,
                                            fontFamily = FontFamily(Font(R.font.nunito_bold)),
                                            fontSize = 14.sp,
                                            color = if (state) colorResource(R.color.title_h3) else Color(
                                                0xFFDDE2E8
                                            ),
                                            fontWeight = FontWeight(500)
                                        )

                                    }
                                }

                                Column(
                                    modifier = Modifier
                                        .width(115.dp)
                                        .wrapContentHeight()
                                ) {
                                    Box() {
                                        val list = listOf(
                                            "08:00",
                                            "09:00",
                                            "10:00",
                                            "11:00",
                                            "12:00",
                                            "13:00",
                                            "14:00"
                                        )
                                        ExposedDropdownMenuSample(list, state)
                                    }
                                }
                            }
                        }


                        //End frame
                        Box(
                            modifier = Modifier
                                .padding(0.dp, 13.dp, 0.dp, 13.dp)
                                .fillMaxWidth()
                                .height(45.dp)
                        ) {

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .weight(1.3f)
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                    ) {
                                        Text(
                                            "End",
                                            modifier = Modifier,
                                            fontFamily = FontFamily(Font(R.font.nunito_bold)),
                                            fontSize = 16.sp,
                                            color = if (state) colorResource(R.color.title_h2) else Color(
                                                0xFF898C8E
                                            ),
                                            fontWeight = FontWeight(700)
                                        )

                                    }
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                    ) {
                                        Text(
                                            "Time when go sleep",
                                            modifier = Modifier,
                                            fontFamily = FontFamily(Font(R.font.nunito_bold)),
                                            fontSize = 14.sp,
                                            color = if (state) colorResource(R.color.title_h3) else Color(
                                                0xFFDDE2E8
                                            ),
                                            fontWeight = FontWeight(500)
                                        )

                                    }
                                }

                                Column(
                                    modifier = Modifier
                                        .width(115.dp)
                                        .wrapContentHeight()
                                ) {
                                    Box() {
                                        val list = listOf(
                                            "13:00",
                                            "14:00",
                                            "15:00",
                                            "16:00",
                                            "17:00",
                                            "18:00",
                                            "19:00"
                                        )
                                        ExposedDropdownMenuSample(list, state)
                                    }
                                }
                            }
                        }

                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(color = colorResource(R.color.spacer))
                                .height(1.dp)
                                .padding(16.dp, 13.dp, 16.dp, 13.dp)
                        )

                        //Interval frame
                        Box(
                            modifier = Modifier
                                .padding(0.dp, 14.dp, 0.dp, 0.dp)
                                .fillMaxWidth()
                                .height(45.dp)
                        ) {

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .weight(1.3f)
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                    ) {
                                        Text(
                                            "Interval",
                                            modifier = Modifier,
                                            fontFamily = FontFamily(Font(R.font.nunito_bold)),
                                            fontSize = 16.sp,
                                            color = if (state) colorResource(R.color.title_h2) else Color(
                                                0xFF898C8E
                                            ),
                                            fontWeight = FontWeight(700)
                                        )

                                    }
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                    ) {
                                        Text(
                                            "Interval between messages",
                                            modifier = Modifier,
                                            fontFamily = FontFamily(Font(R.font.nunito_bold)),
                                            fontSize = 14.sp,
                                            color = if (state) colorResource(R.color.title_h3) else Color(
                                                0xFFDDE2E8
                                            ),
                                            fontWeight = FontWeight(500)
                                        )

                                    }
                                }

                                Column(
                                    modifier = Modifier
                                        .width(120.dp)
                                        .wrapContentHeight()
                                ) {
                                    Box() {
                                        val list = listOf(
                                            "Every 1h",
                                            "Every 2h",
                                            "Every 3h",
                                            "Every 4h",
                                            "Every 5h"
                                        )
                                        ExposedDropdownMenuSample(list, state)
                                    }
                                }
                            }
                        }

                    }


                }

            }

        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(16.dp, 16.dp, 16.dp, 12.dp),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(5.dp)
        ) {
            Box(
                modifier = Modifier
                    .background(if (state) Color.White else Color(0xFFEFEFF3))
                    .padding(15.dp, 21.dp, 15.dp, 21.dp)
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                ) {
                    var checked by remember { mutableStateOf(true) }

                    Row(
                        modifier = Modifier
                            .padding(0.dp, 0.dp, 0.dp, 13.dp)
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            "Message",
                            modifier = Modifier,
                            fontFamily = FontFamily(Font(R.font.nunito_bold)),
                            fontSize = 18.sp,
                            color = if (state) colorResource(R.color.title_h1) else Color(0xFF898C8E),
                            fontWeight = FontWeight(900)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.ic_pro),
                            contentDescription = "image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .wrapContentWidth()
                                .wrapContentHeight()
                        )
                    }

                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(color = colorResource(R.color.spacer))
                            .height(1.dp)
                    )

                    Column(
                        modifier = Modifier
                            .padding(0.dp, 13.dp, 0.dp, 0.dp)
                            .fillMaxWidth()
                    ) {
                        //Start frame
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(45.dp)
                        ) {

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .weight(1.3f)
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                    ) {
                                        Text(
                                            "Its time to drink water",
                                            modifier = Modifier,
                                            fontFamily = FontFamily(Font(R.font.nunito_bold)),
                                            fontSize = 16.sp,
                                            color = if (state) colorResource(R.color.title_h2) else Color(
                                                0xFF898C8E
                                            ),
                                            fontWeight = FontWeight(700)
                                        )
                                    }
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                    ) {
                                        Text(
                                            "You need PRO account to create custom messages",
                                            modifier = Modifier,
                                            fontFamily = FontFamily(Font(R.font.nunito_bold)),
                                            fontSize = 14.sp,
                                            color = if (state) colorResource(R.color.title_h3) else Color(0xFFDDE2E8),
                                            fontWeight = FontWeight(500)
                                        )

                                    }
                                }

                            }
                        }

                    }


                }

            }

        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(16.dp, 16.dp, 16.dp, 12.dp),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(5.dp)
        ) {
            Box(
                modifier = Modifier
                    .background(if (state) Color.White else Color(0xFFEFEFF3))
                    .padding(15.dp, 21.dp, 15.dp, 21.dp)
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                ) {
                    var checked by remember { mutableStateOf(true) }

                    Row(
                        modifier = Modifier
                            .padding(0.dp, 0.dp, 0.dp, 12.dp)
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            "Notification Sound",
                            modifier = Modifier,
                            fontFamily = FontFamily(Font(R.font.nunito_bold)),
                            fontSize = 18.sp,
                            color = if (state) colorResource(R.color.title_h1) else Color(0xFF898C8E),
                            fontWeight = FontWeight(900)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.ic_pro),
                            contentDescription = "image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .wrapContentWidth()
                                .wrapContentHeight()
                        )
                    }

                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(color = colorResource(R.color.spacer))
                            .height(1.dp)
                    )

                    Column(
                        modifier = Modifier
                            .padding(0.dp, 13.dp, 0.dp, 0.dp)
                            .fillMaxWidth()
                            .wrapContentHeight()
                    ) {
                        //Play frame
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight()
                        ) {
                            Column {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.ic_play),
                                        contentDescription = "image",
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .wrapContentWidth()
                                            .wrapContentHeight()
                                            .padding(0.dp, 0.dp, 15.dp, 0.dp)
                                    )

                                    Text(
                                        "Default",
                                        modifier = Modifier,
                                        fontFamily = FontFamily(Font(R.font.nunito_bold)),
                                        fontSize = 16.sp,
                                        color = if (state) colorResource(R.color.title_h2) else Color(0xFF898C8E),                                        fontWeight = FontWeight(700)
                                    )
                                }

                                Row(
                                    modifier = Modifier
                                        .padding(0.dp, 14.dp, 0.dp, 0.dp)
                                        .fillMaxWidth(),
                                ) {
                                    Text(
                                        "You need PRO account to create custom messages",
                                        modifier = Modifier,
                                        fontFamily = FontFamily(Font(R.font.nunito_bold)),
                                        fontSize = 14.sp,
                                        color = if (state) colorResource(R.color.title_h3) else Color(0xFFDDE2E8),
                                        fontWeight = FontWeight(500)
                                    )
                                }
                            }


                        }

                    }


                }

            }

        }
    }


}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
    fun ExposedDropdownMenuSample(list: List<String>, state: Boolean) {

    var expanded by remember { mutableStateOf(false) }
    var expandedShape by remember { mutableStateOf(false) }
    var text by remember { mutableStateOf(list[0]) }
    var roundedShape = RoundedCornerShape(16.dp, 16.dp, 0.dp, 0.dp)

    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = { expanded = it },
    ) {
        OutlinedTextField(
            modifier = Modifier
                .menuAnchor()
                .wrapContentHeight(),
            value = if (state) text else "--:--",
            onValueChange = {
            },
            shape = roundedShape,
            readOnly = true,
            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF1675FF),
                unfocusedBorderColor = Color.Transparent,
                containerColor = Color(0xFFEFEFF3),
                focusedTrailingIconColor = Color(0xFF141A1E),
                unfocusedTrailingIconColor = if(state) Color(0xFF141A1E) else Color(0xFF898C8E)
            ),
        )
        MaterialTheme(
            shapes = MaterialTheme.shapes.copy(
                extraSmall = RoundedCornerShape(
                    0.dp,
                    0.dp,
                    16.dp,
                    16.dp
                )
            )
        ) {
            ExposedDropdownMenu(
                modifier = Modifier.background(Color(0xFFFFFFFF)),
                expanded = expanded,
                onDismissRequest = { expanded = false },
            ) {
                list.forEach { option ->
                    DropdownMenuItem(
                        text = { Text(option, style = MaterialTheme.typography.bodyLarge) },
                        onClick = {
                            text = option
                            expanded = false
                        }
                    )
                    HorizontalDivider()

                }
            }
        }
    }
}


@Composable
fun DarkModeSwitch(checked: Boolean, modifier: Modifier, onCheckedChanged: (Boolean) -> Unit) {
    val switchWidth = 57.dp
    val switchHeight = 28.dp

    val valueToOffset = if (checked) 1f else 0f
    val offset = remember { Animatable(valueToOffset) }

    Box(
        contentAlignment = Alignment.CenterStart,
        modifier = modifier
            .width(switchWidth)
            .height(switchHeight)
            .toggleable(
                value = checked,
                onValueChange = onCheckedChanged,
                role = Role.Switch,
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            )
    ) {

        val backgroundPainter =
            if (checked) painterResource(R.drawable.ic_switch_on) else painterResource(R.drawable.ic_switch_off)
        Canvas(modifier = Modifier.fillMaxSize()) {
            with(backgroundPainter) {
                val scale = size.width / intrinsicSize.width
                val scaledHeight = intrinsicSize.height * scale
                translate(top = (size.height - scaledHeight) * (1f - offset.value)) {
                    draw(Size(size.width, scaledHeight))
                }
            }
        }

    }
}




