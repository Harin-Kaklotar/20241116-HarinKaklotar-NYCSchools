package com.example.a20241116_harinkaklotar_nycschools

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.a20241116_harinkaklotar_nycschools.model.School
import com.google.gson.Gson

@Composable
fun MainNavigation(viewModel: SchoolViewModel) {

    val navController = rememberNavController()
    val navHost = NavHost(navController, startDestination = "school_list")
    {
        composable("school_list" ) {
            SchoolListScreen(viewModel = viewModel){
                val school = Gson().toJson(it)
                navController.navigate("school_details/$school")
            }
        }
        composable("school_details/{school}", arguments = listOf(
            navArgument("school") {
                type = NavType.StringType
                defaultValue = ""
            }
        )) {
            val schoolString = it.arguments?.getString("school")
            val school = Gson().fromJson(schoolString, School::class.java)
            SchoolDetailsScreen(school)
        }
    }

}