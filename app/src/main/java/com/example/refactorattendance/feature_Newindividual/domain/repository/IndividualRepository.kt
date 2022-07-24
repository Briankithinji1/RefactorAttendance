package com.example.refactorattendance.feature_Newindividual.domain.repository

import com.example.refactorattendance.feature_Newindividual.domain.model.AddIndividual
import java.util.*

interface IndividualRepository {

    suspend fun getIndividuals(): List<AddIndividual>

    suspend fun getNameBySerial(serial: UUID): AddIndividual

    suspend fun insertIndividual(addIndividual: String)

    suspend fun deleteIndividual(addIndividual: AddIndividual)
}