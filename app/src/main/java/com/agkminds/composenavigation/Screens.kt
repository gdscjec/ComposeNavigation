package com.agkminds.composenavigation

sealed class Screens(val route: String) {
    object HomeScreen : Screens(route = "home_screen")
    object DetailScreen : Screens(route = "detail_screen")

//    withArgsFunction that appends the passed arguments to all routes
    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}