package com.example.refactorattendance.reports_feature.presentation.absentListScreen

import com.example.refactorattendance.reports_feature.domain.relations.IndividualDataWithReport

data class AbsenteeState(
    //val individualDataWithReport: IndividualDataWithReport
    val absentees: List<IndividualDataWithReport> = emptyList(),
)