package com.example.refactorattendance.attendance_feature.domain.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.refactorattendance.attendance_feature.domain.model.Attendance
import com.example.refactorattendance.feature_Newindividual.domain.model.AddIndividual

data class IndividualDataWithAttendance(
    @Embedded val attendance: Attendance,
    @Relation(
        parentColumn = "serial",
        entityColumn = "serial"
    )
    val individual: List<AddIndividual>
)