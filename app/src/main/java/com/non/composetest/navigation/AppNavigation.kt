package com.non.composetest.navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.non.composetest.screens.HomeScreen
import com.non.composetest.screens.ProfileScreen
import com.non.composetest.screens.ReminderScreen

@Preview(showBackground = true, showSystemUi = true)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    var roundedShape = RoundedCornerShape(16.dp, 16.dp, 0.dp, 0.dp)

    Scaffold(
        bottomBar = {
            NavigationBar(containerColor = Color.White, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                listOfNavItem.forEach { navItem ->
                    val selected =
                        currentDestination?.hierarchy?.any { it.route == navItem.route } == true
                    NavigationBarItem(
                        onClick = {
                            navController.navigate(navItem.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        icon = {
                            Image(
                                imageVector = if (selected) navItem.filledIcon else navItem.outlinedIcon,
                                contentDescription = navItem.label
                            )
                        },
                        selected = selected,
                        label = {
                            Text(text = navItem.label)
                        })

                }
            }


        }
    ) {
        NavHost(
            navController = navController,
            startDestination = Screens.ReminderScreen.name,
        ) {
            composable(route = Screens.HomeScreen.name) {
                HomeScreen { }
            }

            composable(route = Screens.ReminderScreen.name) {
                ReminderScreen { }
            }

            composable(route = Screens.ProfileScreen.name) {
                ProfileScreen { }
            }
        }
    }
}

