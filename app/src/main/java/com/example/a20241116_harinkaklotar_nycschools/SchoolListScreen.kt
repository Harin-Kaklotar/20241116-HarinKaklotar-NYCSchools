package com.example.a20241116_harinkaklotar_nycschools

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.a20241116_harinkaklotar_nycschools.model.School

@Composable
fun SchoolListScreen(viewModel: SchoolViewModel, itemClick: (School) -> Unit) {

    val schools by viewModel.school

    Column(modifier = Modifier.padding(vertical = 20.dp)) {

        Text(text = "Schools")

        LazyColumn {
            items(schools) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Text(text = "${it.school_name}")
                    Button(onClick = {
                        itemClick(it)
                    }) {
                        Text(text = "Details")
                    }
                }
            }
        }

    }

}