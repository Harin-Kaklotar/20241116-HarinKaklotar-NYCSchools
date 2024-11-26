package com.example.a20241116_harinkaklotar_nycschools.repository

import com.example.a20241116_harinkaklotar_nycschools.model.School
import com.example.a20241116_harinkaklotar_nycschools.network.SchoolApi
import javax.inject.Inject

class SchoolRespository @Inject constructor(
    private val schoolApi: SchoolApi,
) {
    suspend fun getSchoolList(): List<School> = schoolApi.getSchoolList()
}