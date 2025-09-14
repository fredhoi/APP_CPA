package com.macau.resumebuilder.data.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context

@Database(
    entities = [ResumeEntity::class],
    version = 1,
    exportSchema = false
)
abstract class ResumeDatabase : RoomDatabase() {
    
    abstract fun resumeDao(): ResumeDao
    
    companion object {
        @Volatile
        private var INSTANCE: ResumeDatabase? = null
        
        fun getDatabase(context: Context): ResumeDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ResumeDatabase::class.java,
                    "resume_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
