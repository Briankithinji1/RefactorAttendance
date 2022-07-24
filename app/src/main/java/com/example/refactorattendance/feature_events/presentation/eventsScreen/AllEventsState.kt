package com.example.refactorattendance.feature_events.presentation.eventsScreen

import com.example.attendanceapp.feature_events.domain.model.Event

data class AllEventsState(
    val events: List<Event> = emptyList(),
)
