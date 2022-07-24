package com.example.refactorattendance.feature_events.presentation.addEventScreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.attendanceapp.feature_events.domain.model.Event
import com.example.refactorattendance.feature_events.domain.repository.EventRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddNewEventViewModel @Inject constructor(
    private val repository: EventRepository
): ViewModel() {

    private val _addEventScreenState = MutableStateFlow(AddEventScreenState())
    val addEventScreenState: StateFlow<AddEventScreenState> = _addEventScreenState


    private fun addNewEvent(event: Event) {
        viewModelScope.launch {
            repository.insertEvent(event)
        }
    }

    fun onSaveButtonClicked(event: Event) {
        _addEventScreenState.value = _addEventScreenState.value.copy()
        addNewEvent(event)
    }

    fun onCancelButtonClicked() {
        _addEventScreenState.value = _addEventScreenState.value.copy()
        //TODO: Navigate to previous screen
    }

    fun onBackButtonClicked() {
        //TODO: Navigate to previous screen
    }
}