package com.example.refactorattendance.feature_events.presentation.editEventScreen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.refactorattendance.core.TopAppBar
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun EditEventScreen(
    navigator: DestinationsNavigator,
    editEventViewModel: EditEventViewModel = hiltViewModel()
) {
    //val editEventState = editEventViewModel.editEventState
    //val eventName: String? by editEventState.eventName.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = "Edit Event",
                icon = Icons.Filled.ArrowBack,
                onIconClick = { editEventViewModel.onBackClicked() }
            )
        }
    ) {
        //Column
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
        Spacer(modifier = Modifier.width(16.dp))
        Button(onClick = { editEventViewModel.onSaveEventClicked() }) {
            Text(text = "Save")
        }
    }

}
}
