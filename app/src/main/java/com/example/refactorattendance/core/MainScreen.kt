package com.example.refactorattendance.core

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination(start = true)
@Composable
fun MainScreen(
    navigator: DestinationsNavigator
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = "Register User",
                icon = Icons.Filled.Menu,
                onIconClick = {} //displays the menu
            )
        }
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .clickable { }, //TODO: Navigate to RegisterUserScreen
            elevation = 10.dp
        ) {
            Column(
                modifier = Modifier.padding(15.dp),
            ) {

                Text(text = "REGISTER USER")
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .clickable { }, //TODO: Navigate to IndividualListScreen
            elevation = 10.dp
        ) {
            Column(
                modifier = Modifier.padding(15.dp),
            ) {

                Text(text = "ALL USERS")
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .clickable { }, //TODO: Navigate to AttendanceScreen
            elevation = 10.dp
        ) {
            Column(
                modifier = Modifier.padding(15.dp),
            ) {

                Text(text = "ATTENDANCE")
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .clickable { }, //TODO: Navigate to EventScreen
            elevation = 10.dp
        ) {
            Column(
                modifier = Modifier.padding(15.dp),
            ) {

                Text(text = "EVENTS")
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .clickable { }, //TODO: Navigate to ReportScreen
            elevation = 10.dp
        ) {
            Column(
                modifier = Modifier.padding(15.dp),
            ) {

                Text(text = "REPORTS")
            }
        }
    }
}