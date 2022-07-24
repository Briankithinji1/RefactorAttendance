package com.example.refactorattendance.feature_Newindividual.presentation.editDetailsScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.refactorattendance.feature_Newindividual.domain.repository.IndividualRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EditDetailsViewModel @Inject constructor(
    private val repository: IndividualRepository
) : ViewModel()  {

    private val _editDetailsState = MutableStateFlow(EditDetailsState())
    val editDetailsState: StateFlow<EditDetailsState> = _editDetailsState

    fun onNameChanged(name: String) {
        viewModelScope.launch {
            _editDetailsState.value = _editDetailsState.value.copy(
                name = repository.insertIndividual(name).toString()
            )
        }
    }

    fun onLocationChanged(location: String) {
        viewModelScope.launch {
            _editDetailsState.value = _editDetailsState.value.copy(
                location = repository.insertIndividual(location).toString()
            )
        }
    }

    fun onContactChanged(contact: String) {
        viewModelScope.launch {
            _editDetailsState.value = _editDetailsState.value.copy(
                contact = repository.insertIndividual(contact).toString()
            )
        }
    }

    fun onCategoryChanged(category: String) {
        viewModelScope.launch {
            _editDetailsState.value = _editDetailsState.value.copy(
                category = repository.insertIndividual(category).toString()
            )
        }
    }

    fun onSaveClicked() {
        viewModelScope.launch {
            _editDetailsState.value = _editDetailsState.value.copy()
            //TODO: navigate to home screen
        }
    }
}