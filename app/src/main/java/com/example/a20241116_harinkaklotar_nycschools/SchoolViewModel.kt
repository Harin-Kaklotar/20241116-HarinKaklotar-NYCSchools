package com.example.a20241116_harinkaklotar_nycschools

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.a20241116_harinkaklotar_nycschools.model.School
import com.example.a20241116_harinkaklotar_nycschools.repository.SchoolRespository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SchoolViewModel @Inject constructor(
    val schoolRespository: SchoolRespository,
) : ViewModel() {

    private val _schools = mutableStateOf<List<School>>(emptyList())
    val school: State<List<School>> = _schools

    init {
        fetchSchoolData()
    }

    private fun fetchSchoolData() {
        viewModelScope.launch {
            _schools.value = schoolRespository.getSchoolList()
        }
    }

}