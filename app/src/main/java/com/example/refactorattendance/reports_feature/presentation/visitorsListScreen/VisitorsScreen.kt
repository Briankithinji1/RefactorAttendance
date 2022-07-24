package com.example.refactorattendance.reports_feature.presentation.visitorsListScreen

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
fun VisitorsListScreen(
    navigator: DestinationsNavigator,
    visitorsViewModel: VisitorsViewModel = hiltViewModel(),
) {

    val visitorsState = visitorsViewModel.visitorsState

    Scaffold(
        topBar = {
            TopAppBar(
                title = "Visitors List",
                icon = Icons.Filled.ArrowBack,
                onIconClick = {  } //Navigation.back()
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
        ) {
            items(visitorsState.value.visitors.size) { i ->
                val visitors = visitorsState.value.visitors[i]
                VisitorsItem(
                    individual = visitors,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            //TODO: navigate to personal detail screen
                        }
                        .padding(16.dp)
                )
                if (i < visitorsState.value.visitors.size) {
                    Divider(modifier = Modifier.padding(
                        horizontal = 16.dp,
                    ))
                }
            }
        }
    }
}