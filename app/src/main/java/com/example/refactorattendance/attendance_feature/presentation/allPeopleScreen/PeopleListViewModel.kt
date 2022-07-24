package com.example.refactorattendance.attendance_feature.presentation.allPeopleScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.refactorattendance.attendance_feature.domain.repository.AttendanceRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PeopleListViewModel @Inject constructor(
    private val repository: AttendanceRepository
) : ViewModel(){

    private val _peopleListState = MutableStateFlow(PeopleListState())
    val peopleListState: StateFlow<PeopleListState> = _peopleListState

    fun onSearchQueryChanged(query: String) {
        viewModelScope.launch {
            delay(500)
            _peopleListState.value = _peopleListState.value.copy(
                searchQuery = query
            )
        }
    }

    fun getPeopleList() {
        viewModelScope.launch {
            val people = repository.getIndividualList()
            _peopleListState.value = _peopleListState.value.copy(
                person = people
            )
        }
    }

    fun onIndividualClicked() {
        //TODO: navigate to personal info screen
    }


}