package com.example.a20241116_harinkaklotar_nycschools

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.a20241116_harinkaklotar_nycschools.model.School

@Composable
fun SchoolDetailsScreen(school: School?) {

    school?.let {
        Column(modifier = Modifier.padding(20.dp)) {
            Text(text = "School Name : ${school.school_name}")
            Text(text = "School Email : ${school.school_email}")
            Text(text = "School Phone : ${school.phone_number}")
            Text(text = "School City : ${school.city}")
        }
    }

}