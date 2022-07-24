package com.example.refactorattendance.feature_Newindividual.presentation.addIndividualScreen

import androidx.compose.foundation.layout.*
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
fun RegisterScreen(
    navigator: DestinationsNavigator,
    viewModel: AddIndividualViewModel = hiltViewModel()
) {
    val name = viewModel.name
    val serialNumber = viewModel.serialNumber
    val phoneNumber = viewModel.phoneNumber
    val location = viewModel.location
    val category = viewModel.category

    Scaffold(
        topBar = {
            TopAppBar(
                title = "Register User",
                icon = Icons.Filled.ArrowBack,
                onIconClick = {} //navController.popBackStack()
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            NameInput(
                name = viewModel.name.toString(),
                onNameChange = {it}
            )
            Spacer(modifier = Modifier.height(16.dp))
            SerialInput(
                serialNumber = viewModel.serialNumber.toString(),
                onSerialChange = {it}
            )
            Spacer(modifier = Modifier.height(16.dp))
            PhoneNoInput(
                phoneNUmber = viewModel.phoneNumber.toString(),
                onPhoneNoChange = { it }
            )
            Spacer(modifier = Modifier.height(16.dp))
            LocationInput(
                location = viewModel.location.toString(),
                onLocationChange = { it }
            )
            Spacer(modifier = Modifier.height(16.dp))
            CategoryInput(
                category = viewModel.category.toString(),
                onCategoryChange = { it }
            )
            Spacer(modifier = Modifier.height(32.dp))
            OnBtnClick(

            )
        }

    }
}
