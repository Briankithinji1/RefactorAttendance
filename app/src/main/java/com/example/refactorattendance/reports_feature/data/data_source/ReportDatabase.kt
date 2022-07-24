package com.example.attendanceapp.feature_report.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.refactorattendance.reports_feature.data.data_source.ReportDao
import com.example.refactorattendance.reports_feature.domain.model.Report

@Database(
    entities = [Report::class],
    version = 1
)
abstract class ReportDatabase : RoomDatabase() {

    abstract val reportDao: ReportDao
}