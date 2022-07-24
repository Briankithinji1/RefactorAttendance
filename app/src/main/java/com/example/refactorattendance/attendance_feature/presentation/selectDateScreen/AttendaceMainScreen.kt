package com.example.refactorattendance.attendance_feature.presentation.selectDateScreen

import android.widget.CalendarView
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.refactorattendance.core.TopAppBar
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun SelectDateScreen(
    navigator: DestinationsNavigator,
    viewModel: AttendanceViewModel
) {
    var date = viewModel.attendanceMainState.date
    var event = viewModel.attendanceMainState.event

    Scaffold(
        topBar = {
            TopAppBar(
                title = "Attendance",
                icon = Icons.Filled.ArrowBack,
                onIconClick = {}
            )
        },
        content = {
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                AndroidView(factory = { CalendarView(it) }, update = {
                    it.setOnDateChangeListener { calendarView, year, month, day ->
                        date = "$day - ${month + 1} $year"
                    }
                })
                Text(text = date)
            }
        }
    )
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {

        dropDownMenu(viewModel = viewModel)

        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {  }) {
            Text(text = "Mark Attendance")
        }
    }

}