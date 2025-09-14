package com.macau.resumebuilder.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Resume(
    val id: Long = 0,
    val basicInfo: BasicInfo = BasicInfo(),
    val education: List<Education> = emptyList(),
    val experience: List<Experience> = emptyList(),
    val skills: Skills = Skills(),
    val awards: List<Award> = emptyList(),
    val activities: List<Activity> = emptyList(),
    val templateId: String = "default",
    val createdAt: Long = System.currentTimeMillis(),
    val updatedAt: Long = System.currentTimeMillis()
) : Parcelable {
    
    fun isValid(): Boolean {
        return basicInfo.isValid() && 
               (education.isNotEmpty() || experience.isNotEmpty() || skills.isValid())
    }
    
    fun getResumeTitle(): String {
        return "${basicInfo.getDisplayName()} - Resume"
    }
}
