package com.example.refactorattendance.reports_feature.presentation.reportsScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.refactorattendance.reports_feature.domain.repository.ReportRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ReportsViewModel @Inject constructor(
    private val repository: ReportRepository
): ViewModel() {

    private val _reportsState = MutableStateFlow(ReportsState())
    val reportsState: StateFlow<ReportsState> = _reportsState

    fun onAbsenteesCardClicked() {
        //TODO: Navigate to Absentees List Screen
    }

    fun onVisitorsCardClicked() {
        //TODO: Navigate to Visitors List Screen
    }

    fun getTotalAttendance() {
        viewModelScope.launch {
            _reportsState.value = _reportsState.value.copy(
                totalCount = repository.getTotalPresent(0)
            )
        }
    }
}