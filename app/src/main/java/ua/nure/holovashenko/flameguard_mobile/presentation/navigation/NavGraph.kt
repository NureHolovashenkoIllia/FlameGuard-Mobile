package ua.nure.holovashenko.flameguard_mobile.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ua.nure.holovashenko.flameguard_mobile.presentation.ui.auth.LoginScreen
import ua.nure.holovashenko.flameguard_mobile.presentation.ui.auth.RegisterScreen
import ua.nure.holovashenko.flameguard_mobile.presentation.ui.main.MainTabHost
import ua.nure.holovashenko.flameguard_mobile.presentation.ui.measurements.MeasurementsScreen
import ua.nure.holovashenko.flameguard_mobile.presentation.ui.sensors.SensorsScreen

@Composable
fun FlameGuardNavGraph(
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController, startDestination = Screen.Login.route) {

        composable(Screen.Login.route) {
            LoginScreen(
                onLoginSuccess = { navController.navigate(Screen.Buildings.route) {
                    popUpTo(Screen.Login.route) { inclusive = true }
                }},
                onRegisterClick = { navController.navigate(Screen.Register.route) }
            )
        }

        composable(Screen.Register.route) {
            RegisterScreen(
                onLoginClick = { navController.popBackStack() }
            )
        }

        composable(Screen.Buildings.route) {
            MainTabHost(navController)
        }

        composable(Screen.Sensors.route) {
            SensorsScreen(
                onSensorClick = { navController.navigate(Screen.Measurements.route) }
            )
        }

        composable(Screen.Measurements.route) {
            MeasurementsScreen()
        }
    }
}
