package com.example.attendanceapp.feature_events.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.attendanceapp.feature_events.domain.model.Event
import com.example.refactorattendance.feature_events.data.data_source.EventDao

@Database(
    entities = [Event::class],
    version = 1
)
abstract class EventDatabase: RoomDatabase() {

    abstract val dao: EventDao
}