package com.example.refactorattendance.feature_Newindividual.presentation.personalDetailsScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.refactorattendance.feature_Newindividual.domain.repository.IndividualRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PersonalDetailsViewModel @Inject constructor(
    private val repository: IndividualRepository
): ViewModel() {

    private val _personalDetailsState = MutableStateFlow(PersonalDetailsState())
    val personalDetailsState: StateFlow<PersonalDetailsState> = _personalDetailsState

    fun displayName() {
        viewModelScope.launch {
            displayName()
        }
    }

    fun displaySerial() {
        viewModelScope.launch {
            displaySerial()
        }
    }

    fun displayContact() {
        viewModelScope.launch {
            displayContact()
        }
    }

    fun displayLocation() {
        viewModelScope.launch {
            displayLocation()
        }
    }

    fun displayCategory() {
        viewModelScope.launch {
            displayCategory()
        }
    }
}