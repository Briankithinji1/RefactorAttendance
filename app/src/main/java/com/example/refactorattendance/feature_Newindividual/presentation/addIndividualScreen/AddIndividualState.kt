package com.example.refactorattendance.feature_Newindividual.presentation.addIndividualScreen

import java.util.*

data class AddIndividualState(
    val name: String = "",
    val serialNumber: UUID,
    val phoneNumber: String = "",
    val location: String = "",
    val category: String = ""
)
