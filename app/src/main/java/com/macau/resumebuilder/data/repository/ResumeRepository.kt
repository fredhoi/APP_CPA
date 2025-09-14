package com.macau.resumebuilder.data.repository

import com.macau.resumebuilder.data.database.ResumeDao
import com.macau.resumebuilder.data.database.ResumeEntity
import com.macau.resumebuilder.data.model.Resume
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ResumeRepository @Inject constructor(
    private val resumeDao: ResumeDao
) {
    
    fun getAllResumes(): Flow<List<Resume>> {
        return resumeDao.getAllResumes().map { entities ->
            entities.map { it.toResume() }
        }
    }
    
    suspend fun getResumeById(id: Long): Resume? {
        return resumeDao.getResumeById(id)?.toResume()
    }
    
    suspend fun insertResume(resume: Resume): Long {
        return resumeDao.insertResume(ResumeEntity.fromResume(resume))
    }
    
    suspend fun updateResume(resume: Resume) {
        resumeDao.updateResume(ResumeEntity.fromResume(resume))
    }
    
    suspend fun deleteResume(resume: Resume) {
        resumeDao.deleteResume(ResumeEntity.fromResume(resume))
    }
    
    suspend fun deleteResumeById(id: Long) {
        resumeDao.deleteResumeById(id)
    }
}
