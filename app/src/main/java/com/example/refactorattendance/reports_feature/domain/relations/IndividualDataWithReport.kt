package com.example.refactorattendance.reports_feature.domain.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.refactorattendance.reports_feature.domain.model.Report
import com.example.refactorattendance.feature_Newindividual.domain.model.AddIndividual

data class IndividualDataWithReport(
    @Embedded val report: Report,
    @Relation(
        parentColumn = "serial",
        entityColumn = "serial"
    )
    val individual: List<AddIndividual>
)
