package com.example.refactorattendance.feature_events.presentation.addEventScreen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.attendanceapp.feature_events.domain.model.Event
import com.example.refactorattendance.core.TopAppBar
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun AddEventScreen(
    navigator: DestinationsNavigator,
    event: Event,
    addNewEventViewModel: AddNewEventViewModel = hiltViewModel(),
) {
    val addEventScreenState = addNewEventViewModel.addEventScreenState


    Scaffold(
        topBar = {
            TopAppBar(
                title = "Add Event",
                icon = Icons.Filled.ArrowBack,
                onIconClick = { addNewEventViewModel.onBackButtonClicked() }
            )
        }
    ) {

        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            //OutlinedTextField

        }
        Spacer(modifier = Modifier.width(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = { addNewEventViewModel.onSaveButtonClicked(event) }
            ) {
                Text("Save")
            }
            Spacer(modifier = Modifier.width(2.dp))
            Button(
                onClick = { addNewEventViewModel.onCancelButtonClicked() }
            ) {
                Text("Cancel")
            }
        }
    }

}