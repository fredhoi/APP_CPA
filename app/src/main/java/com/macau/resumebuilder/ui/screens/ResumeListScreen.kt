package com.macau.resumebuilder.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.macau.resumebuilder.ui.viewmodel.ResumeViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ResumeListScreen(
    navController: NavHostController,
    viewModel: ResumeViewModel = hiltViewModel()
) {
    val resumes by viewModel.resumes.collectAsState()
    val isLoading by viewModel.isLoading.collectAsState()
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "My Resumes",
                style = MaterialTheme.typography.headlineMedium
            )
            
            Button(
                onClick = {
                    viewModel.createNewResume()
                    navController.navigate("resume_edit/0")
                }
            ) {
                Text("New Resume")
            }
        }
        
        Spacer(modifier = Modifier.height(16.dp))
        
        if (isLoading) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        } else if (resumes.isEmpty()) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "No resumes yet. Create your first resume!",
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        } else {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(resumes) { resume ->
                    ResumeCard(
                        resume = resume,
                        onEditClick = {
                            navController.navigate("resume_edit/${resume.id}")
                        },
                        onPreviewClick = {
                            navController.navigate("resume_preview/${resume.id}")
                        },
                        onDeleteClick = {
                            viewModel.deleteResume(resume)
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun ResumeCard(
    resume: com.macau.resumebuilder.data.model.Resume,
    onEditClick: () -> Unit,
    onPreviewClick: () -> Unit,
    onDeleteClick: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = resume.getResumeTitle(),
                style = MaterialTheme.typography.titleMedium
            )
            
            Text(
                text = "Updated: ${java.text.SimpleDateFormat("MMM dd, yyyy", java.util.Locale.getDefault()).format(java.util.Date(resume.updatedAt))}",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = onEditClick,
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Edit")
                }
                
                OutlinedButton(
                    onClick = onPreviewClick,
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Preview")
                }
                
                IconButton(onClick = onDeleteClick) {
                    Text("Delete")
                }
            }
        }
    }
}
