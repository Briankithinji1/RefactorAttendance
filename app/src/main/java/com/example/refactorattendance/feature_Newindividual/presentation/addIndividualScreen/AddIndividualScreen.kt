package com.example.refactorattendance.feature_Newindividual.presentation.addIndividualScreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import java.util.*


@Composable
fun AddIndividualScreen(addIndividualViewModel: AddIndividualViewModel = viewModel()) {

    val name : String by addIndividualViewModel.name.observeAsState("")
    NameInput(name = name) { addIndividualViewModel.onNameChange(it) }

    val serialNumber : String by addIndividualViewModel.serialNumber.observeAsState("")
    SerialInput(serialNumber = serialNumber) { addIndividualViewModel.onSerialChange() }

    val phoneNumber : String by addIndividualViewModel.phoneNumber.observeAsState("")
    PhoneNoInput(phoneNUmber = phoneNumber, onPhoneNoChange = { addIndividualViewModel.onPhoneNoChange(it) })

    val location : String by addIndividualViewModel.location.observeAsState("")
    LocationInput(location = location, onLocationChange = { addIndividualViewModel.onLocationChange(it) })

    val category : String by addIndividualViewModel.category.observeAsState("")
    CategoryInput(category = category, onCategoryChange = { addIndividualViewModel.onCategoryChange(it) })

}

@Composable
fun NameInput(name: String, onNameChange: (String) -> Unit) {
        OutlinedTextField(
            value = name,
            onValueChange = onNameChange,
            label = { Text(text = "Name") },
            placeholder = { Text(text = "Name") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(0.8f)
        )
}

@Composable
fun SerialInput(serialNumber: String, onSerialChange: (String) -> Unit) {
    OutlinedTextField(
        value = serialNumber,
        onValueChange = onSerialChange,
        label = { Text(text = "Serial Number") },
        placeholder = { Text(text = "Serial Number") },
        singleLine = true,
        modifier = Modifier.fillMaxWidth(0.8f)
    )
}

@Composable
fun PhoneNoInput(phoneNUmber: String, onPhoneNoChange: (String) -> Unit) {
    OutlinedTextField(
        value = phoneNUmber,
        onValueChange = onPhoneNoChange,
        label = { Text(text = "Phone Number") },
        placeholder = { Text(text = "Phone Number") },
        singleLine = true,
        modifier = Modifier.fillMaxWidth(0.8f),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
    )
}

@Composable
fun LocationInput(location: String, onLocationChange: (String) -> Unit) {
    OutlinedTextField(
        value = location,
        onValueChange = onLocationChange,
        label = { Text(text = "Location") },
        placeholder = { Text(text = "Location") },
        singleLine = true,
        modifier = Modifier.fillMaxWidth(0.8f)
    )
}

@Composable
fun CategoryInput(category: String, onCategoryChange: (String) -> Unit) {
    OutlinedTextField(
        value = category,
        onValueChange = onCategoryChange,
        label = { Text(text = "Category") },
        placeholder = { Text(text = "Member/Visitor") },
        singleLine = true,
        modifier = Modifier.fillMaxWidth(0.8f)
    )
}

@Composable
fun OnBtnClick() {
    Button(
        onClick = {},
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .height(50.dp))
    {
        Text(text = "Register")
    }
        

}
