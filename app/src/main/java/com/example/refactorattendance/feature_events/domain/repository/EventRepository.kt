package com.example.refactorattendance.feature_events.domain.repository

import com.example.attendanceapp.feature_events.domain.model.Event
import kotlinx.coroutines.flow.Flow

interface EventRepository {

    fun getEvents(): List<Event>

    fun insertEvent(event: Event)

    suspend fun deleteEvent(event: Event)
}