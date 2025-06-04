package ua.nure.holovashenko.flameguard_mobile.presentation.viewmodel.auth

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor() : ViewModel() {
    var email by mutableStateOf("")
    var password by mutableStateOf("")

    fun onLoginClick(onSuccess: () -> Unit) {
        // TODO: Replace with real API call
        if (email.isNotEmpty() && password.isNotEmpty()) {
            onSuccess()
        }
    }
}
