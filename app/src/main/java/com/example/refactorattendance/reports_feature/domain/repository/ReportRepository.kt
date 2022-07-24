package com.example.refactorattendance.reports_feature.domain.repository

import com.example.refactorattendance.reports_feature.domain.relations.AttendanceWithReport
import com.example.refactorattendance.feature_Newindividual.domain.model.AddIndividual
import com.example.refactorattendance.reports_feature.domain.relations.IndividualDataWithReport
import java.util.*

interface ReportRepository {

    suspend fun getAbsentList(): List<AddIndividual>

    suspend fun getVisitorsList(): List<AddIndividual>

    suspend fun getTotalPresent(int: Int)

    //suspend fun insertIndividual(addIndividual: AddIndividual)

    fun getIndividualDataWithReport(): List<IndividualDataWithReport>

    suspend fun getAttendanceWithReport(inAttendance: String): List<AttendanceWithReport>
}