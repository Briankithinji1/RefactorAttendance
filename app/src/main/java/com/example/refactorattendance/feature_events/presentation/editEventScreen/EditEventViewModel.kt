package com.example.refactorattendance.feature_events.presentation.editEventScreen

import androidx.lifecycle.ViewModel
import com.example.refactorattendance.feature_events.domain.repository.EventRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class EditEventViewModel @Inject constructor(
    private val repository: EventRepository
): ViewModel() {

    private val _editEventState = MutableStateFlow(EditEventState())
    val editEventState: StateFlow<EditEventState> = _editEventState

    fun onEventNameChanged(name: String) {
        _editEventState.value = _editEventState.value.copy(
            eventName = name
        )
    }

    fun onSaveEventClicked() {
        _editEventState.value = _editEventState.value.copy()
        //TODO: navigate to event list screen
    }

    fun onBackClicked() {
        //TODO: navigate to event list screen
    }
}
