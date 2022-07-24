package com.example.attendanceapp.feature_attendance.data.data_source

import androidx.room.*
import com.example.refactorattendance.attendance_feature.domain.model.Attendance
import com.example.attendanceapp.feature_attendance.domain.relations.EventWithAttendance
import com.example.refactorattendance.attendance_feature.domain.relations.IndividualDataWithAttendance
import com.example.attendanceapp.feature_events.domain.model.Event
import com.example.refactorattendance.feature_Newindividual.domain.model.AddIndividual
import kotlinx.coroutines.flow.Flow
import java.util.*


@Dao
interface AttendanceDao {

    //@Insert(onConflict = OnConflictStrategy.REPLACE)
    @Query("SELECT individuals FROM Attendance")
    suspend fun getIndividualList(): List<AddIndividual>

    @Transaction
    @Query("SELECT * FROM AddIndividual WHERE serial != :serial IN Attendance")
     fun getIndividualDataWithAttendance(serial: UUID):List<IndividualDataWithAttendance>

    @Query("SELECT inAttendance FROM attendance")
    fun getInAttendance():Flow<List<Attendance>>

    @Query("SELECT date FROM attendance")
    suspend fun getDate(date: Attendance)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEvent(event: Event)

    @Transaction
    @Query("SELECT * FROM event WHERE event_name = :event_name")
    fun getEventWithAttendance(event_name: String): List<EventWithAttendance>
    //abstract fun getIndividualDataWithAttendance(): List<IndividualDataWithAttendance>
}