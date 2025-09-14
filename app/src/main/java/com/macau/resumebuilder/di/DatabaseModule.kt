package com.macau.resumebuilder.di

import android.content.Context
import com.macau.resumebuilder.data.database.ResumeDao
import com.macau.resumebuilder.data.database.ResumeDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    
    @Provides
    @Singleton
    fun provideResumeDatabase(@ApplicationContext context: Context): ResumeDatabase {
        return ResumeDatabase.getDatabase(context)
    }
    
    @Provides
    fun provideResumeDao(database: ResumeDatabase): ResumeDao {
        return database.resumeDao()
    }
}
