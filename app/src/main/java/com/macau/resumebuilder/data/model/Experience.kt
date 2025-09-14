package com.macau.resumebuilder.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Experience(
    val id: Long = 0,
    val companyName: String = "",
    val position: String = "",
    val startDate: String = "",
    val endDate: String = "",
    val isCurrentJob: Boolean = false,
    val location: String = "",
    val description: String = "",
    val achievements: List<String> = emptyList()
) : Parcelable {
    
    fun isValid(): Boolean {
        return companyName.isNotBlank() && 
               position.isNotBlank() && 
               startDate.isNotBlank()
    }
    
    fun getDateRange(): String {
        return if (isCurrentJob) {
            "$startDate - Present"
        } else {
            "$startDate - $endDate"
        }
    }
}
