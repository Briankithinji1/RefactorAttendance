package com.example.refactorattendance.feature_Newindividual.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.refactorattendance.feature_Newindividual.domain.model.AddIndividual
import com.example.refactorattendance.feature_Newindividual.data.data_source.PersonalDao
import com.example.refactorattendance.feature_Newindividual.domain.model.UUIDConverter

@Database(
    entities = [AddIndividual::class],
    version = 1
)
@TypeConverters(UUIDConverter::class)
abstract class IndividualDatabase: RoomDatabase() {

    abstract val personalDao: PersonalDao
}