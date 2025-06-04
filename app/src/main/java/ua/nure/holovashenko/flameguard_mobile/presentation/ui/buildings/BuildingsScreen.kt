package ua.nure.holovashenko.flameguard_mobile.presentation.ui.buildings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun BuildingsScreen(onSensorClick: () -> Unit) {
    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Buildings Screen")
        Button(onClick = onSensorClick) {
            Text("Go to Sensors")
        }
    }
}