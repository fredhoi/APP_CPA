package com.macau.resumebuilder.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.macau.resumebuilder.data.model.Resume

@Entity(tableName = "resumes")
data class ResumeEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val basicInfoJson: String,
    val educationJson: String,
    val experienceJson: String,
    val skillsJson: String,
    val awardsJson: String,
    val activitiesJson: String,
    val templateId: String,
    val createdAt: Long,
    val updatedAt: Long
) {
    fun toResume(): Resume {
        // This would use Gson or similar to convert JSON strings back to objects
        // For now, returning a basic Resume object
        return Resume(
            id = id,
            templateId = templateId,
            createdAt = createdAt,
            updatedAt = updatedAt
        )
    }
    
    companion object {
        fun fromResume(resume: Resume): ResumeEntity {
            return ResumeEntity(
                id = resume.id,
                basicInfoJson = "", // Convert to JSON
                educationJson = "", // Convert to JSON
                experienceJson = "", // Convert to JSON
                skillsJson = "", // Convert to JSON
                awardsJson = "", // Convert to JSON
                activitiesJson = "", // Convert to JSON
                templateId = resume.templateId,
                createdAt = resume.createdAt,
                updatedAt = resume.updatedAt
            )
        }
    }
}
