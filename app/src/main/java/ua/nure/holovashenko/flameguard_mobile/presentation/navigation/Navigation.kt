package ua.nure.holovashenko.flameguard_mobile.presentation.navigation

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Register : Screen("register")
    object Buildings : Screen("buildings")
    object Diagrams : Screen("diagrams")
    object Profile : Screen("profile")
    object Sensors : Screen("sensors")
    object Measurements : Screen("measurements")
}
