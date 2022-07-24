package com.example.refactorattendance.feature_Newindividual.presentation.addIndividualScreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.refactorattendance.feature_Newindividual.domain.repository.IndividualRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import java.util.*
import javax.inject.Inject

@HiltViewModel
class AddIndividualViewModel @Inject constructor(
    private val repository: IndividualRepository,
): ViewModel() {

    private val _name: MutableLiveData<String> = MutableLiveData("")
    val name: LiveData<String> = _name

    fun onNameChange(realName: String) {
        _name.value = realName
    }

    private var _serialNumber: MutableLiveData<String> = MutableLiveData()
    val serialNumber: LiveData<String> = _serialNumber

    fun onSerialChange() {
        //_serialNumber.value = newSerial
        this._serialNumber = _serialNumber
    }

    private val _phoneNumber: MutableLiveData<String> = MutableLiveData("")
    val phoneNumber: LiveData<String> = _phoneNumber

    fun onPhoneNoChange(newPhoneNumber: String) {
        _phoneNumber.value = newPhoneNumber
    }

    private val _location: MutableLiveData<String> = MutableLiveData("")
    val location: LiveData<String> = _location

    fun onLocationChange(newLocation: String) {
        _location.value = newLocation
    }

    private val _category : MutableLiveData<String> = MutableLiveData()
    var category: LiveData<String> = _category

    fun onCategoryChange(categoryType: String) {
        _category.value = categoryType
    }
}
