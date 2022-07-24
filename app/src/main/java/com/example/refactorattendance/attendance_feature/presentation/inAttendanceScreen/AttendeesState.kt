package com.example.refactorattendance.attendance_feature.presentation.inAttendanceScreen

import com.example.refactorattendance.attendance_feature.domain.relations.IndividualDataWithAttendance

data class AttendeesState(
    val attendees: List<IndividualDataWithAttendance> = emptyList()
)
