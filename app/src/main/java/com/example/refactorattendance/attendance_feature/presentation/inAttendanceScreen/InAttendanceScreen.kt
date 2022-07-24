package com.example.refactorattendance.attendance_feature.presentation.inAttendanceScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.refactorattendance.core.TopAppBar
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun InAttendanceScreen(
    navigator: DestinationsNavigator,
    inAttendanceViewModel: InAttendanceViewModel = hiltViewModel()
) {

    val attendeesState = inAttendanceViewModel.attendeesState

    Scaffold(
        topBar = {
            TopAppBar(
                title = "Absentee List",
                icon = Icons.Filled.ArrowBack,
                onIconClick = {  } //Navigation.back()
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
        ) {
            items(attendeesState.value.attendees.size) { i ->
                val attendees = attendeesState.value.attendees[i]
                InAttendanceItem(
                    attendees = attendees,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            //TODO: navigate to personal detail screen
                        }
                        .padding(16.dp)
                )
                if (i < attendeesState.value.attendees.size) {
                    Divider(modifier = Modifier.padding(
                        horizontal = 16.dp,
                    ))
                }
            }
        }
    }
}