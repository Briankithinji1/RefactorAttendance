package com.example.refactorattendance.reports_feature.data.repository

import com.example.refactorattendance.reports_feature.data.data_source.ReportDao
import com.example.refactorattendance.reports_feature.domain.relations.AttendanceWithReport
import com.example.refactorattendance.feature_Newindividual.domain.model.AddIndividual
import com.example.refactorattendance.reports_feature.domain.relations.IndividualDataWithReport
import com.example.refactorattendance.reports_feature.domain.repository.ReportRepository
import java.util.*

abstract class ReportRepositoryImpl(
    private val dao: ReportDao
) : ReportRepository {

    override suspend fun getAbsentList(): List<AddIndividual> {
        return dao.getAbsentList()
    }

    override suspend fun getVisitorsList(): List<AddIndividual> {
        return dao.getVisitorsList()
    }

    override suspend fun getTotalPresent(int: Int) {
        return dao.getTotalPresent(int)
    }

    fun getIndividualDataWithReport(serial: UUID): List<IndividualDataWithReport> {
        return dao.getIndividualDataWithReport(serial)
    }

    override suspend fun getAttendanceWithReport(inAttendance: String): List<AttendanceWithReport> {
        return dao.getAttendanceWithReport(inAttendance)
    }
}