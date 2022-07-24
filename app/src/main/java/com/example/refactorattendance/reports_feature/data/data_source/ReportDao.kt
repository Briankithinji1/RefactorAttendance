package com.example.refactorattendance.reports_feature.data.data_source

import androidx.room.*
import com.example.refactorattendance.reports_feature.domain.relations.AttendanceWithReport
import com.example.refactorattendance.feature_Newindividual.domain.model.AddIndividual
import com.example.refactorattendance.reports_feature.domain.relations.IndividualDataWithReport
import java.util.*

@Dao
interface ReportDao {

    @Query("SELECT * FROM AddIndividual WHERE serial != serial IN Attendance ")
    suspend fun getAbsentList(): List<AddIndividual>

    @Query("SELECT * FROM AddIndividual WHERE category = 'visitor'")
    suspend fun getVisitorsList(): List<AddIndividual>

    @Query("SELECT * FROM attendance WHERE (inAttendance = inAttendance) + 'visitor'")
    suspend fun getTotalPresent(int: Int)

    @Transaction
    @Query("SELECT * FROM AddIndividual WHERE serial != :serial IN Attendance")
    fun getIndividualDataWithReport(serial: UUID):List<IndividualDataWithReport>

    @Transaction
    @Query("SELECT * FROM attendance WHERE inAttendance = :inAttendance")
    suspend fun getAttendanceWithReport(inAttendance: String): List<AttendanceWithReport>
}