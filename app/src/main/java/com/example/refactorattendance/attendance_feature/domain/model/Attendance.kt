package com.example.refactorattendance.attendance_feature.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.refactorattendance.feature_Newindividual.domain.model.AddIndividual
import java.util.*

@Entity
data class Attendance(
    val individuals: String,
    @PrimaryKey(autoGenerate = false)
    val inAttendance: String,
    val date: Date,
    val serial: UUID,
    val event_name: String
)
