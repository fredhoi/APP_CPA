package com.macau.resumebuilder.data.database

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ResumeDao {
    
    @Query("SELECT * FROM resumes ORDER BY updatedAt DESC")
    fun getAllResumes(): Flow<List<ResumeEntity>>
    
    @Query("SELECT * FROM resumes WHERE id = :id")
    suspend fun getResumeById(id: Long): ResumeEntity?
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertResume(resume: ResumeEntity): Long
    
    @Update
    suspend fun updateResume(resume: ResumeEntity)
    
    @Delete
    suspend fun deleteResume(resume: ResumeEntity)
    
    @Query("DELETE FROM resumes WHERE id = :id")
    suspend fun deleteResumeById(id: Long)
}
