package com.example.refactorattendance.reports_feature.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Report(
    @PrimaryKey
    val absent_list: String,
    val visitors_list: String,
    val total_present: Int,
    val serial: Int? = null,
    val inAttendance: String
)
