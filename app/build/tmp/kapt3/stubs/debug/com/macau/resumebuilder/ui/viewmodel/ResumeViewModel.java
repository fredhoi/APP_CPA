package com.macau.resumebuilder.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/macau/resumebuilder/ui/viewmodel/ResumeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/macau/resumebuilder/data/repository/ResumeRepository;", "(Lcom/macau/resumebuilder/data/repository/ResumeRepository;)V", "_currentResume", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/macau/resumebuilder/data/model/Resume;", "_isLoading", "", "_resumes", "", "currentResume", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentResume", "()Lkotlinx/coroutines/flow/StateFlow;", "isLoading", "resumes", "getResumes", "createNewResume", "", "deleteResume", "resume", "loadResumeById", "id", "", "loadResumes", "saveResume", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ResumeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.macau.resumebuilder.data.repository.ResumeRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.macau.resumebuilder.data.model.Resume>> _resumes = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.macau.resumebuilder.data.model.Resume>> resumes = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.macau.resumebuilder.data.model.Resume> _currentResume = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.macau.resumebuilder.data.model.Resume> currentResume = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading = null;
    
    @javax.inject.Inject()
    public ResumeViewModel(@org.jetbrains.annotations.NotNull()
    com.macau.resumebuilder.data.repository.ResumeRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.macau.resumebuilder.data.model.Resume>> getResumes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.macau.resumebuilder.data.model.Resume> getCurrentResume() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return null;
    }
    
    private final void loadResumes() {
    }
    
    public final void loadResumeById(long id) {
    }
    
    public final void saveResume(@org.jetbrains.annotations.NotNull()
    com.macau.resumebuilder.data.model.Resume resume) {
    }
    
    public final void deleteResume(@org.jetbrains.annotations.NotNull()
    com.macau.resumebuilder.data.model.Resume resume) {
    }
    
    public final void createNewResume() {
    }
}