package com.example.attendanceapp.feature_events.data.repository

import com.example.refactorattendance.feature_events.data.data_source.EventDao
import com.example.attendanceapp.feature_events.domain.model.Event
import com.example.refactorattendance.feature_events.domain.repository.EventRepository
import kotlinx.coroutines.flow.Flow

class EventRepositoryImpl(
    private val dao: EventDao
) : EventRepository {

    override fun getEvents(): Flow<List<Event>> {
        return dao.getEvents()
    }

    override fun insertEvent(event: Event) {
        dao.insertEvent(event)
    }

    override suspend fun deleteEvent(event: Event) {
        dao.deleteEvent(event)
    }
}