package com.example.refactorattendance.attendance_feature.data.repository

import com.example.attendanceapp.feature_attendance.data.data_source.AttendanceDao
import com.example.refactorattendance.attendance_feature.domain.model.Attendance
import com.example.attendanceapp.feature_attendance.domain.relations.EventWithAttendance
import com.example.refactorattendance.attendance_feature.domain.relations.IndividualDataWithAttendance
import com.example.refactorattendance.attendance_feature.domain.repository.AttendanceRepository
import com.example.attendanceapp.feature_events.domain.model.Event
import com.example.refactorattendance.feature_Newindividual.domain.model.AddIndividual
import kotlinx.coroutines.flow.Flow
import java.util.*
import kotlin.Unit.toString

abstract class AttendanceRepositoryImpl(
    private val dao: AttendanceDao
): AttendanceRepository {

    override suspend fun getInAttendance(): Flow<List<Attendance>> {
        return dao.getInAttendance()
    }

    override suspend fun getDate(date: Attendance) {
        return dao.getDate(date)
    }

    suspend fun getIndividualList(individual: AddIndividual): List<AddIndividual> {
        return dao.getIndividualList()
    }

    override fun getIndividualDataWithAttendance(serial: UUID): List<IndividualDataWithAttendance> {
        return dao.getIndividualDataWithAttendance(serial)
    }

    /*fun getIndividualDataWithAttendance(serial: UUID): List<IndividualDataWithAttendance> {
        return dao.getIndividualDataWithAttendance(serial)
    }*/

    override suspend fun insertEvent(event: Event) {
        dao.insertEvent(event)
    }

    override fun getEventWithAttendance(event_name: String): List<EventWithAttendance> {
        return dao.getEventWithAttendance(event_name)
    }
}