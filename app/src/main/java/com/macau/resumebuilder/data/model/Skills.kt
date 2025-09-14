package com.macau.resumebuilder.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Skills(
    val id: Long = 0,
    val technicalSkills: List<String> = emptyList(),
    val languageSkills: List<LanguageSkill> = emptyList(),
    val softSkills: List<String> = emptyList(),
    val certifications: List<String> = emptyList()
) : Parcelable {
    
    fun isValid(): Boolean {
        return technicalSkills.isNotEmpty() || 
               languageSkills.isNotEmpty() || 
               softSkills.isNotEmpty()
    }
}

@Parcelize
data class LanguageSkill(
    val language: String = "",
    val proficiency: ProficiencyLevel = ProficiencyLevel.BEGINNER
) : Parcelable

enum class ProficiencyLevel {
    BEGINNER,
    INTERMEDIATE,
    ADVANCED,
    NATIVE
}
