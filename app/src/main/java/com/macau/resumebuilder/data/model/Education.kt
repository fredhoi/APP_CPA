package com.macau.resumebuilder.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Education(
    val id: Long = 0,
    val schoolName: String = "",
    val degree: String = "",
    val major: String = "",
    val startDate: String = "",
    val endDate: String = "",
    val gpa: String = "",
    val location: String = "",
    val isCurrentlyEnrolled: Boolean = false,
    val achievements: String = ""
) : Parcelable {
    
    fun isValid(): Boolean {
        return schoolName.isNotBlank() && 
               degree.isNotBlank() && 
               major.isNotBlank()
    }
    
    fun getDateRange(): String {
        return if (isCurrentlyEnrolled) {
            "$startDate - Present"
        } else {
            "$startDate - $endDate"
        }
    }
}
