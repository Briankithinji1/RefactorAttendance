package com.example.refactorattendance.feature_Newindividual.presentation.personalDetailsScreen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.refactorattendance.core.TopAppBar
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun PersonalDetailsScreen(
    navigator: DestinationsNavigator,
    personalDetailsViewModel: PersonalDetailsViewModel = hiltViewModel()
) {

    val name = personalDetailsViewModel.personalDetailsState.collectAsState().value.name
    val serial = personalDetailsViewModel.personalDetailsState.collectAsState().value.serial
    val contact = personalDetailsViewModel.personalDetailsState.collectAsState().value.contact
    val location = personalDetailsViewModel.personalDetailsState.collectAsState().value.location
    val category = personalDetailsViewModel.personalDetailsState.collectAsState().value.category

    Scaffold(
        topBar = {
            TopAppBar(
                title = "Personal Details",
                icon = Icons.Filled.ArrowBack,
                onIconClick = {} //TODO: navigate to previous screen
            )
        }
    ) {

        Column {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 4.dp, end = 4.dp),
            verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Name: $name",
                    modifier = Modifier.width(100.dp)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 4.dp, end = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Serial: $serial",
                    modifier = Modifier.width(100.dp)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 4.dp, end = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Contact: $contact",
                    modifier = Modifier.width(100.dp)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 4.dp, end = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Location: $location",
                    modifier = Modifier.width(100.dp)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 4.dp, end = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Category: $category",
                    modifier = Modifier.width(100.dp)
                )
            }
        }
    }
}