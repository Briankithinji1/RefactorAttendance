package com.example.refactorattendance.attendance_feature.presentation.selectDateScreen

sealed class AttendanceMainActivityEvents {
    data class onDateSelected(val date: String) : AttendanceMainActivityEvents()
    data class onEventSelected(val event: String) : AttendanceMainActivityEvents()
    //object onBackPressed : AttendanceMainActivityEvents()
}
