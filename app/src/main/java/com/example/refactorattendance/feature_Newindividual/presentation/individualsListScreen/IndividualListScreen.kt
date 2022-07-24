package com.example.refactorattendance.feature_Newindividual.presentation.individualsListScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
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
import com.example.refactorattendance.feature_Newindividual.domain.model.AddIndividual
import com.example.refactorattendance.reports_feature.presentation.absentListScreen.AbsentItem
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun IndividualListScreen(
    navigator: DestinationsNavigator,
    individualsListViewModel: IndividualsListViewModel = hiltViewModel()
) {

    val individualsListState = individualsListViewModel.individualsListState
    val searchQuery = individualsListViewModel.individualsListState.collectAsState().value.searchQuery

    Scaffold(
        topBar = {
            TopAppBar(
                title = "Individuals",
                icon = Icons.Filled.ArrowBack,
                onIconClick = {  } //Navigation.back()
            )
        }
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            OutlinedTextField(
                value = searchQuery,
                onValueChange = {
                    individualsListViewModel.onSearchQueryChanged(it)
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
            items(individualsListState.value.person.size) { i ->
                val person = individualsListState.value.person[i]
                IndividualsListItem(
                    person = person,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            //TODO: navigate to personal detail screen
                        }
                        .padding(16.dp)
                )
                if (i < individualsListState.value.person.size) {
                    Divider(modifier = Modifier.padding(
                        horizontal = 16.dp,
                    ))
                }
            }
        }
    }
}