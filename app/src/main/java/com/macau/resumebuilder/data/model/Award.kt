package com.macau.resumebuilder.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Award(
    val id: Long = 0,
    val awardName: String = "",
    val issuingOrganization: String = "",
    val year: String = "",
    val description: String = ""
) : Parcelable {
    
    fun isValid(): Boolean {
        return awardName.isNotBlank() && 
               issuingOrganization.isNotBlank() && 
               year.isNotBlank()
    }
}
