package com.example.refactorattendance.attendance_feature.presentation.inAttendanceScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.refactorattendance.attendance_feature.domain.repository.AttendanceRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class InAttendanceViewModel @Inject constructor(
    private val repository: AttendanceRepository
): ViewModel() {

    private val _attendeesState = MutableStateFlow(AttendeesState())
    val attendeesState: StateFlow<AttendeesState> = _attendeesState

    fun getAttendees() {
        viewModelScope.launch {
            val attendees = repository.getIndividualDataWithAttendance()
            _attendeesState.value = _attendeesState.value.copy(
                attendees = attendees
            )
        }
    }
}
