package com.example.refactorattendance.reports_feature.presentation.reportsScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun ReportsScreen(
    navigator: DestinationsNavigator,
    reportsViewModel: ReportsViewModel = hiltViewModel()
) {

    val reportsState = reportsViewModel.reportsState
    val totalCount = reportsViewModel.reportsState.collectAsState().value?.totalCount

    TopAppBar(
        title = {
            Text("Reports")
                },
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable { }, //TODO: Navigate to Absentees Screen
        elevation = 10.dp
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
        ) {
            Text(
                text = "Absentees",
                fontWeight = FontWeight.Bold,
            )
        }
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable { }, //TODO: Navigate to Visitors Screen
        elevation = 10.dp
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
        ) {
            Text(
                text = "Visitors",
                fontWeight = FontWeight.Bold,
            )
        }
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = 10.dp
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
        ) {
            Text(
                text = "Total Attendance",
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "$totalCount",
            )
        }
    }
}