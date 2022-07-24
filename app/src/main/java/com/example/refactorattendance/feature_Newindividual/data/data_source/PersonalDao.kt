package com.example.refactorattendance.feature_Newindividual.data.data_source

import androidx.room.*
import com.example.refactorattendance.feature_Newindividual.domain.model.AddIndividual
import java.util.*

@Dao
interface PersonalDao {

    @Query("SELECT * FROM AddIndividual")
    suspend fun getIndividuals(): List<AddIndividual>

    @Query("SELECT * FROM AddIndividual WHERE serial = (:serial) ")
    suspend fun getNameBySerial(serial: UUID): AddIndividual

    /*@Query("SELECT * FROM AddIndividual")
    suspend fun getAllDetails(): List<AddIndividual>*/

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertIndividual(addIndividual: AddIndividual)

    @Delete
    suspend fun deleteIndividual(addIndividual: AddIndividual)
}