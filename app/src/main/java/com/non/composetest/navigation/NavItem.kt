package com.non.composetest.navigation

import AlarmFilled
import AlarmOutlined
import HomeFilled
import HomeOutlined
import ProfileFilled
import ProfileOutlined
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.non.composetest.R

data class NavItem(
    val label: String,
    val filledIcon: ImageVector,
    var outlinedIcon: ImageVector,
    val route: String
)

val listOfNavItem = listOf(
    NavItem(
        label = "Home",
        filledIcon = HomeFilled,
        outlinedIcon = HomeOutlined,
        route = Screens.HomeScreen.name
    ),
    NavItem(
        label = "Reminder",
        filledIcon = AlarmFilled,
        outlinedIcon = AlarmOutlined,
        route = Screens.ReminderScreen.name
    ),
    NavItem(
        label = "Profile",
        filledIcon = ProfileFilled,
        outlinedIcon = ProfileOutlined,
        route = Screens.ProfileScreen.name
    )
)