package com.agkminds.composenavigation

import androidx.navigation.NavArgs

sealed class Screens(val route: String) {
    object HomeScreen : Screens(route = "home_screen")
    object DetailScreen : Screens(route = "detail_screen")
}