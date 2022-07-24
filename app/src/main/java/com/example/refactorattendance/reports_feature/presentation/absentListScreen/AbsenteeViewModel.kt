package com.example.refactorattendance.reports_feature.presentation.absentListScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.refactorattendance.reports_feature.domain.repository.ReportRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AbsenteeViewModel @Inject constructor(
    private val repository: ReportRepository
): ViewModel() {

    private val _absenteeState = MutableStateFlow(AbsenteeState())
    val absenteeState: StateFlow<AbsenteeState> = _absenteeState

    fun getAbsenteesList() {
        viewModelScope.launch {
            val absentees = repository.getIndividualDataWithReport()
            _absenteeState.value = _absenteeState.value.copy(
                absentees = absentees)
        }
    }

    fun onAbsenteeClicked() {
        //TODO: navigate to personal details screen
    }
}