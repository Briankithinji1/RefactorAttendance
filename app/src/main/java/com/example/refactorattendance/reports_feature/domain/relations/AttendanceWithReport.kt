package com.example.refactorattendance.reports_feature.domain.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.refactorattendance.attendance_feature.domain.model.Attendance
import com.example.refactorattendance.reports_feature.domain.model.Report

data class AttendanceWithReport(
    @Embedded val report: Report,
    @Relation(
        parentColumn = "inAttendance",
        entityColumn = "inAttendance"
    )
    val attendees: List<Attendance>
)