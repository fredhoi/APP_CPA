package com.macau.resumebuilder.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.macau.resumebuilder.data.model.Resume
import com.macau.resumebuilder.data.repository.ResumeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ResumeViewModel @Inject constructor(
    private val repository: ResumeRepository
) : ViewModel() {
    
    private val _resumes = MutableStateFlow<List<Resume>>(emptyList())
    val resumes: StateFlow<List<Resume>> = _resumes.asStateFlow()
    
    private val _currentResume = MutableStateFlow<Resume?>(null)
    val currentResume: StateFlow<Resume?> = _currentResume.asStateFlow()
    
    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()
    
    init {
        loadResumes()
    }
    
    private fun loadResumes() {
        viewModelScope.launch {
            repository.getAllResumes().collect { resumeList ->
                _resumes.value = resumeList
            }
        }
    }
    
    fun loadResumeById(id: Long) {
        viewModelScope.launch {
            _isLoading.value = true
            _currentResume.value = repository.getResumeById(id)
            _isLoading.value = false
        }
    }
    
    fun saveResume(resume: Resume) {
        viewModelScope.launch {
            _isLoading.value = true
            if (resume.id == 0L) {
                repository.insertResume(resume)
            } else {
                repository.updateResume(resume)
            }
            _isLoading.value = false
        }
    }
    
    fun deleteResume(resume: Resume) {
        viewModelScope.launch {
            repository.deleteResume(resume)
        }
    }
    
    fun createNewResume() {
        _currentResume.value = Resume()
    }
}
