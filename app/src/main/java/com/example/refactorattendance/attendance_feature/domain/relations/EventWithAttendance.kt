package com.example.attendanceapp.feature_attendance.domain.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.refactorattendance.attendance_feature.domain.model.Attendance
import com.example.attendanceapp.feature_events.domain.model.Event

data class EventWithAttendance(
    @Embedded val attendance: Attendance,
    @Relation(
        parentColumn = "event_name",
        entityColumn = "event_name"
    )
    val events: List<Event>
)