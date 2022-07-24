package com.example.refactorattendance.reports_feature.presentation.reportsScreen

import com.example.refactorattendance.reports_feature.domain.model.Report

data class ReportsState(
    val reports: List<Report> = emptyList(),
    val totalCount: Unit = Unit,
)
