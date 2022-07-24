package com.example.refactorattendance.feature_Newindividual.presentation.individualsListScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.refactorattendance.feature_Newindividual.domain.model.AddIndividual
import com.example.refactorattendance.feature_Newindividual.domain.repository.IndividualRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class IndividualsListViewModel @Inject constructor(
    private val repository: IndividualRepository
): ViewModel() {

    private val _individualsListState = MutableStateFlow(IndividualsListState())
    val individualsListState: StateFlow<IndividualsListState> = _individualsListState

    fun onSearchQueryChanged(query: String) {
        viewModelScope.launch {
            delay(500)
            _individualsListState.value = _individualsListState.value.copy(
                searchQuery = query
            )
        }
    }

    fun getIndividualsList() {
        viewModelScope.launch {
            val individuals = repository.getIndividuals()
            _individualsListState.value = _individualsListState.value.copy(
                person = individuals
            )
        }
    }

    fun onIndividualClicked() {
        //TODO: navigate to personal info screen
    }

    fun onBackPressed() {
        //TODO: navigate to previous screen
    }
}