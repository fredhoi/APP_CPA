package com.macau.resumebuilder.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class BasicInfo(
    val id: Long = 0,
    val fullName: String = "",
    val phoneNumber: String = "",
    val email: String = "",
    val address: String = "",
    val linkedInProfile: String = "",
    val personalWebsite: String = "",
    val summary: String = "",
    val profileImagePath: String = ""
) : Parcelable {
    
    fun isValid(): Boolean {
        return fullName.isNotBlank() && 
               email.isNotBlank() && 
               phoneNumber.isNotBlank()
    }
    
    fun getDisplayName(): String {
        return fullName.ifBlank { "Your Name" }
    }
}
