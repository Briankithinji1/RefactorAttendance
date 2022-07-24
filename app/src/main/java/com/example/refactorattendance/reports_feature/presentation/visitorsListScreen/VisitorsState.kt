package com.example.refactorattendance.reports_feature.presentation.visitorsListScreen

import com.example.refactorattendance.feature_Newindividual.domain.model.AddIndividual

data class VisitorsState(
    val visitors: List<AddIndividual> = emptyList(),
)
