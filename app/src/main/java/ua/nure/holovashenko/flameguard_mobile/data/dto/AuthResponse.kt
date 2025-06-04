package ua.nure.holovashenko.flameguard_mobile.data.dto

data class AuthResponse(
    val token: String,
    val role: String? = null,
    val error: String? = null
)