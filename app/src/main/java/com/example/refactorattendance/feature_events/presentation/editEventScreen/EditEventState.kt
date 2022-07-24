package com.example.refactorattendance.feature_events.presentation.editEventScreen

import com.example.attendanceapp.feature_events.domain.model.Event

data class EditEventState(
    val event: Event? = null,
    val eventName: String = "",
    //val isLoading: Boolean = false,
    //val error: Throwable? = null
)
