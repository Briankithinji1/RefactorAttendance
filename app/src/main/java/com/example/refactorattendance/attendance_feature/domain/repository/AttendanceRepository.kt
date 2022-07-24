package com.example.refactorattendance.attendance_feature.domain.repository

import com.example.refactorattendance.attendance_feature.domain.model.Attendance
import com.example.attendanceapp.feature_attendance.domain.relations.EventWithAttendance
import com.example.refactorattendance.attendance_feature.domain.relations.IndividualDataWithAttendance
import com.example.attendanceapp.feature_events.domain.model.Event
import com.example.refactorattendance.feature_Newindividual.domain.model.AddIndividual
import kotlinx.coroutines.flow.Flow
import java.util.*

interface AttendanceRepository {

    suspend fun getInAttendance(): Flow<List<Attendance>>

    suspend fun getDate(date: Attendance)

    suspend fun getIndividualList():List<AddIndividual>

    fun getIndividualDataWithAttendance():List<IndividualDataWithAttendance>

    suspend fun insertEvent(event: Event)

    fun getEventWithAttendance(event_name: String): List<EventWithAttendance>

}