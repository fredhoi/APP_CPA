package com.macau.resumebuilder.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Activity(
    val id: Long = 0,
    val activityName: String = "",
    val role: String = "",
    val startDate: String = "",
    val endDate: String = "",
    val isOngoing: Boolean = false,
    val description: String = "",
    val organization: String = ""
) : Parcelable {
    
    fun isValid(): Boolean {
        return activityName.isNotBlank() && 
               role.isNotBlank() && 
               startDate.isNotBlank()
    }
    
    fun getDateRange(): String {
        return if (isOngoing) {
            "$startDate - Present"
        } else {
            "$startDate - $endDate"
        }
    }
}
