package com.example.refactorattendance.reports_feature.presentation.visitorsListScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.refactorattendance.reports_feature.domain.repository.ReportRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class VisitorsViewModel @Inject constructor(
    private val repository: ReportRepository
): ViewModel() {

    private val _visitorsState = MutableStateFlow(VisitorsState())
    val visitorsState: StateFlow<VisitorsState> = _visitorsState

    fun getVisitorsList() {
        viewModelScope.launch {
            val visitors = repository.getVisitorsList()
            _visitorsState.value = _visitorsState.value.copy(
                visitors = visitors
            )
        }
    }
}
