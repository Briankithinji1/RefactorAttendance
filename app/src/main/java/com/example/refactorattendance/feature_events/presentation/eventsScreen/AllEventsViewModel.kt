package com.example.refactorattendance.feature_events.presentation.eventsScreen

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
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
class AllEventsViewModel @Inject constructor(
    private val repository: EventRepository
): ViewModel(){

    private val _eventsState = MutableStateFlow(AllEventsState())
    val eventsState: StateFlow<AllEventsState> = _eventsState

    init {
        getEventsList()
    } //Check later if this is the correct way to initialize the viewmodel

    private fun getEventsList(){
        viewModelScope.launch {
            val events = repository.getEvents()
            _eventsState.value = _eventsState.value.copy(
                events = events
            )
        }
    }

    fun deleteEvent(event: Event){
        viewModelScope.launch {
            repository.deleteEvent(event)
            getEventsList()
        }
    }

    fun onEditEventClicked() {
        //TODO: navigate to edit event screen
    }

    fun onAddEventClicked() {
        //TODO: navigate to add event screen
    }

    fun onBackPressed() {
        //TODO: navigate to previous screen
    }

}