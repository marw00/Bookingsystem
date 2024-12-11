package com.example.aufgabe3.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.aufgabe3.ui.add.AddScreen
import com.example.aufgabe3.ui.home.HomeScreen
import com.example.aufgabe3.viewmodel.SharedViewModel

/**
 * Navigation host that manages the navigation between different screens in the app.
 * @param navController The navigation controller used for navigation.
 */
@Composable
fun AppNavHost(navController: NavHostController) {
    val sharedViewModel: SharedViewModel = viewModel()

    NavHost(navController, startDestination = "home") {

        composable("home") {
            HomeScreen(
                navController = navController,
                sharedViewModel = sharedViewModel
            )
        }

        composable("add") {
            AddScreen(
                navController = navController,
                sharedViewModel = sharedViewModel
            )
        }

    }
}
