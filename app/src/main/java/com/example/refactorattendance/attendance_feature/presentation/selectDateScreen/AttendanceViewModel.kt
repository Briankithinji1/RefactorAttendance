package com.example.refactorattendance.attendance_feature.presentation.selectDateScreen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.refactorattendance.attendance_feature.domain.repository.AttendanceRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AttendanceViewModel @Inject constructor(
    private val attendanceRepository: AttendanceRepository
) : ViewModel() {

    private val _attendanceMainState = mutableStateOf(AttendanceMainActivityState())
    val attendanceMainState: AttendanceMainActivityState get() = _attendanceMainState.value

    fun setAttendanceMainState(state: AttendanceMainActivityState) {
        _attendanceMainState.value = state
    }

    fun onDateSelected(date: String) {
        _attendanceMainState.value = attendanceMainState.copy(
            date = date
        )
    }

    fun onEventSelected(event: List<String>) {
        _attendanceMainState.value = attendanceMainState.copy(
            event = event
        )
    }

    fun onMarkAttendanceButtonClicked() {
        //TODO: Navigate to Mark Attendance Screen
    }
}
