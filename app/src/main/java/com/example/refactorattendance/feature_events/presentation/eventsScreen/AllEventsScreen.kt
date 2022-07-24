package com.example.refactorattendance.feature_events.presentation.eventsScreen

import androidx.compose.foundation.layout.*
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
fun EventsScreen(
    navigator: DestinationsNavigator,
    allEventsViewModel: AllEventsViewModel = hiltViewModel(),
) {

    val eventsState = allEventsViewModel.eventsState

    Scaffold(
        topBar = {
            TopAppBar(
                title = "Events",
                icon = Icons.Filled.ArrowBack,
                onIconClick = { allEventsViewModel.onBackPressed() }
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(eventsState.value.events.size) { i ->
                val event = eventsState.value.events[i]
                EventsItems(
                    event = event,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                )
                if (i < eventsState.value.events.size) {
                    Divider(modifier = Modifier.padding(
                        horizontal = 16.dp
                    ))
                }
            }
        }
    }
}