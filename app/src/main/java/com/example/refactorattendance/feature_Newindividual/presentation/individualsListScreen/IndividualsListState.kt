package com.example.refactorattendance.feature_Newindividual.presentation.individualsListScreen

import com.example.refactorattendance.feature_Newindividual.domain.model.AddIndividual

data class IndividualsListState(
    val person: List<AddIndividual> = emptyList(),
    val searchQuery: String = ""
)
