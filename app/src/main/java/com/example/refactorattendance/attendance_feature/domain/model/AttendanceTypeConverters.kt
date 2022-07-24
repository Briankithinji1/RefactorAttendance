package com.example.attendanceapp.feature_attendance.domain.model

import androidx.room.TypeConverter
import java.util.*

class AttendanceTypeConverters {
    @TypeConverter
    fun fromDate(date: Date): Long {
        return date.time
    }

    @TypeConverter
    fun toDate(millisSinceEpoch: Long): Date {
        return Date(millisSinceEpoch)
    }
}