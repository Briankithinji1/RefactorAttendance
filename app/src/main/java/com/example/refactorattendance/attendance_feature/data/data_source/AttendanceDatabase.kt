package com.example.refactorattendance.attendance_feature.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.attendanceapp.feature_attendance.data.data_source.AttendanceDao
import com.example.refactorattendance.attendance_feature.domain.model.Attendance
import com.example.attendanceapp.feature_attendance.domain.model.AttendanceTypeConverters

@Database(
    entities = [Attendance::class],
    version = 1
)
@TypeConverters(AttendanceTypeConverters::class)
abstract class AttendanceDatabase : RoomDatabase() {

    abstract val attendanceDao: AttendanceDao
}