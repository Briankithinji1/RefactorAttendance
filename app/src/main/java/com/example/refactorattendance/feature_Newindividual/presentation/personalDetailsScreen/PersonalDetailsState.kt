package com.example.refactorattendance.feature_Newindividual.presentation.personalDetailsScreen

import java.util.*

data class PersonalDetailsState(
    val name: String = "",
    val serial: UUID? = null,
    val contact: String = "",
    val location: String = "",
    val category: String = "",
)
