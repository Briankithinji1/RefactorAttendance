package com.example.refactorattendance.feature_events.data.data_source

import androidx.room.*
import com.example.attendanceapp.feature_events.domain.model.Event
import kotlinx.coroutines.flow.Flow

@Dao
interface EventDao {

    @Query("SELECT * FROM event")
    fun getEvents(): Flow<List<Event>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertEvent(event: Event)

    @Delete
    suspend fun deleteEvent(event: Event)
}