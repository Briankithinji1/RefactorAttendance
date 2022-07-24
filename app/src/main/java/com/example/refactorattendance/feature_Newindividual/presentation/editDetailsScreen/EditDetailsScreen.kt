package com.example.refactorattendance.feature_Newindividual.presentation.editDetailsScreen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
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
fun EditDetailsScreen(
    navigator: DestinationsNavigator,
    editDetailsViewModel: EditDetailsViewModel = hiltViewModel()
) {

    //val editDetailsState = editDetailsViewModel.editDetailsState
    val name = editDetailsViewModel.editDetailsState.collectAsState().value.name
    val contact = editDetailsViewModel.editDetailsState.collectAsState().value.contact
    val location= editDetailsViewModel.editDetailsState.collectAsState().value.location
    val category = editDetailsViewModel.editDetailsState.collectAsState().value.category

    Scaffold(
        topBar = {
            TopAppBar(
                title = "Edit Details",
                icon = Icons.Filled.ArrowBack,
                onIconClick = {} //TODO: navigate to previous screen
            )
        }
    ) {
        OutlinedTextField(
            value = name,
            onValueChange = { editDetailsViewModel.onNameChanged(it) },
            label = { Text(text = "Name") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(0.8f)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = contact,
            onValueChange = { editDetailsViewModel.onContactChanged(it) },
            label = { Text(text = "Contact") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(0.8f)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = location,
            onValueChange = { editDetailsViewModel.onLocationChanged(it) },
            label = { Text(text = "Location") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(0.8f)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = category,
            onValueChange = { editDetailsViewModel.onCategoryChanged(it) },
            label = { Text(text = "Category") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(0.8f)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { editDetailsViewModel.onSaveClicked() }) {
            Text(text = "SAVE")
        }
    }
}