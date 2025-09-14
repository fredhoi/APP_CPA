package com.macau.resumebuilder.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.macau.resumebuilder.data.model.BasicInfo

@Composable
fun BasicInfoForm(
    basicInfo: BasicInfo,
    onBasicInfoChange: (BasicInfo) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Basic Information",
            style = MaterialTheme.typography.headlineSmall
        )
        
        OutlinedTextField(
            value = basicInfo.fullName,
            onValueChange = { onBasicInfoChange(basicInfo.copy(fullName = it)) },
            label = { Text("Full Name *") },
            modifier = Modifier.fillMaxWidth()
        )
        
        OutlinedTextField(
            value = basicInfo.email,
            onValueChange = { onBasicInfoChange(basicInfo.copy(email = it)) },
            label = { Text("Email *") },
            modifier = Modifier.fillMaxWidth()
        )
        
        OutlinedTextField(
            value = basicInfo.phoneNumber,
            onValueChange = { onBasicInfoChange(basicInfo.copy(phoneNumber = it)) },
            label = { Text("Phone Number *") },
            modifier = Modifier.fillMaxWidth()
        )
        
        OutlinedTextField(
            value = basicInfo.address,
            onValueChange = { onBasicInfoChange(basicInfo.copy(address = it)) },
            label = { Text("Address") },
            modifier = Modifier.fillMaxWidth()
        )
        
        OutlinedTextField(
            value = basicInfo.linkedInProfile,
            onValueChange = { onBasicInfoChange(basicInfo.copy(linkedInProfile = it)) },
            label = { Text("LinkedIn Profile") },
            modifier = Modifier.fillMaxWidth()
        )
        
        OutlinedTextField(
            value = basicInfo.personalWebsite,
            onValueChange = { onBasicInfoChange(basicInfo.copy(personalWebsite = it)) },
            label = { Text("Personal Website") },
            modifier = Modifier.fillMaxWidth()
        )
        
        OutlinedTextField(
            value = basicInfo.summary,
            onValueChange = { onBasicInfoChange(basicInfo.copy(summary = it)) },
            label = { Text("Professional Summary") },
            modifier = Modifier.fillMaxWidth(),
            minLines = 3,
            maxLines = 5
        )
    }
}
