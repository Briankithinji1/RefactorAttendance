package com.example.refactorattendance.attendance_feature.presentation.allPeopleScreen

import com.example.refactorattendance.feature_Newindividual.domain.model.AddIndividual

data class PeopleListState(
    val person: List<AddIndividual> = emptyList(),
    val searchQuery: String = ""
)
