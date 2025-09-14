package com.macau.resumebuilder.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00100\u000fJ\u0018\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/macau/resumebuilder/data/repository/ResumeRepository;", "", "resumeDao", "Lcom/macau/resumebuilder/data/database/ResumeDao;", "(Lcom/macau/resumebuilder/data/database/ResumeDao;)V", "deleteResume", "", "resume", "Lcom/macau/resumebuilder/data/model/Resume;", "(Lcom/macau/resumebuilder/data/model/Resume;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteResumeById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllResumes", "Lkotlinx/coroutines/flow/Flow;", "", "getResumeById", "insertResume", "updateResume", "app_debug"})
public final class ResumeRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.macau.resumebuilder.data.database.ResumeDao resumeDao = null;
    
    @javax.inject.Inject()
    public ResumeRepository(@org.jetbrains.annotations.NotNull()
    com.macau.resumebuilder.data.database.ResumeDao resumeDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.macau.resumebuilder.data.model.Resume>> getAllResumes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getResumeById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.macau.resumebuilder.data.model.Resume> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertResume(@org.jetbrains.annotations.NotNull()
    com.macau.resumebuilder.data.model.Resume resume, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateResume(@org.jetbrains.annotations.NotNull()
    com.macau.resumebuilder.data.model.Resume resume, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteResume(@org.jetbrains.annotations.NotNull()
    com.macau.resumebuilder.data.model.Resume resume, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteResumeById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}