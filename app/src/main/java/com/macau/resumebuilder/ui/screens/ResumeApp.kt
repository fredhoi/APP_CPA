package com.macau.resumebuilder.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ResumeApp() {
    val navController = rememberNavController()
    
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = { Text("Resume Builder") }
            )
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = "resume_list",
            modifier = Modifier.padding(paddingValues)
        ) {
            composable("resume_list") {
                ResumeListScreen(navController = navController)
            }
            composable("resume_edit/{resumeId}") { backStackEntry ->
                val resumeId = backStackEntry.arguments?.getString("resumeId")?.toLongOrNull() ?: 0L
                ResumeEditScreen(
                    resumeId = resumeId,
                    navController = navController
                )
            }
            composable("resume_preview/{resumeId}") { backStackEntry ->
                val resumeId = backStackEntry.arguments?.getString("resumeId")?.toLongOrNull() ?: 0L
                ResumePreviewScreen(
                    resumeId = resumeId,
                    navController = navController
                )
            }
        }
    }
}
