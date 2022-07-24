package com.example.refactorattendance.feature_Newindividual.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class AddIndividual(
    val name: String,
    @PrimaryKey val serial: UUID,//Int? = null,
    val contact: Int,
    val location: String,
    val category: String
)
