package com.example.refactorattendance.attendance_feature.presentation.allPeopleScreen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.refactorattendance.core.TopAppBar
import com.example.refactorattendance.feature_Newindividual.presentation.individualsListScreen.IndividualsListItem
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun AllPeopleScreen(
    navigator: DestinationsNavigator,
    peopleListViewModel: PeopleListViewModel = hiltViewModel()
) {
    val peopleListState = peopleListViewModel.peopleListState
    val searchQuery = peopleListViewModel.peopleListState.collectAsState().value.searchQuery

    Scaffold(
        topBar = {
            TopAppBar(
                title = "All People",
                icon = Icons.Filled.ArrowBack,
                onIconClick = {  } //Navigation.back()
            )
        }
    ) {

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(16.dp)
                    .border(border = BorderStroke(width = 1.dp, color = Color.Black))
            ) {
                Text(
                    text = "Individuals",
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier
                    .padding(16.dp)
                    .border(border = BorderStroke(width = 1.dp, color = Color.Black))
                )
                Text(
                    text = "InAttendance",
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }
        }
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            OutlinedTextField(
                value = searchQuery,
                onValueChange = {
                    peopleListViewModel.onSearchQueryChanged(it)
                },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                placeholder = {
                    Text(text = "Search...")
                },
                maxLines = 1,
                singleLine = true
            )
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
        ) {
            items(peopleListState.value.person.size) { i ->
                val person = peopleListState.value.person[i]
                IndividualsListItem(
                    person = person,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            //TODO: navigate to personal detail screen
                        }
                        .padding(16.dp)
                )
                if (i < peopleListState.value.person.size) {
                    Divider(modifier = Modifier.padding(
                        horizontal = 16.dp,
                    ))
                }
            }
        }
    }
}