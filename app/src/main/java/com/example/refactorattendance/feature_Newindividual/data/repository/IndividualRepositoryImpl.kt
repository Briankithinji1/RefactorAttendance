package com.example.refactorattendance.feature_Newindividual.data.repository

import com.example.refactorattendance.feature_Newindividual.data.data_source.PersonalDao
import com.example.refactorattendance.feature_Newindividual.domain.model.AddIndividual
import com.example.refactorattendance.feature_Newindividual.domain.repository.IndividualRepository
import java.util.*

class IndividualRepositoryImpl(
    private val dao: PersonalDao
) : IndividualRepository {


    override suspend fun getIndividuals(): List<AddIndividual> {
        return dao.getIndividuals()
    }

    override suspend fun getNameBySerial(serial: UUID): AddIndividual {
        return dao.getNameBySerial(serial)
    }

    override suspend fun insertIndividual(addIndividual: String) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteIndividual(addIndividual: AddIndividual) {
        dao.deleteIndividual(addIndividual)
    }
}