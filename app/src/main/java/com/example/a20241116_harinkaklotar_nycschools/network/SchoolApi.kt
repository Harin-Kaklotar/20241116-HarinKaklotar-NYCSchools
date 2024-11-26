package com.example.a20241116_harinkaklotar_nycschools.network

import com.example.a20241116_harinkaklotar_nycschools.model.School
import retrofit2.http.GET

interface SchoolApi {

    @GET("s3k6-pzi2.json")
    suspend fun getSchoolList(): List<School>

}