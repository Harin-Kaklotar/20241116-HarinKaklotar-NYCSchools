package com.example.a20241116_harinkaklotar_nycschools

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.a20241116_harinkaklotar_nycschools.ui.theme._20241116HarinKaklotarNYCSchoolsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _20241116HarinKaklotarNYCSchoolsTheme {
                val schoolViewModel: SchoolViewModel = hiltViewModel()
                MainNavigation(schoolViewModel)
            }
        }
    }
}