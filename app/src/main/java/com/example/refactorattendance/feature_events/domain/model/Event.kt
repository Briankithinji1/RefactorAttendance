package com.example.attendanceapp.feature_events.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Event(
    @PrimaryKey(autoGenerate = false)
    val event_name: String,
)
