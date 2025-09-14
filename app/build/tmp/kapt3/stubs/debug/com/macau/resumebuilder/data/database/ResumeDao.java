package com.macau.resumebuilder.data.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\fH\'J\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/macau/resumebuilder/data/database/ResumeDao;", "", "deleteResume", "", "resume", "Lcom/macau/resumebuilder/data/database/ResumeEntity;", "(Lcom/macau/resumebuilder/data/database/ResumeEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteResumeById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllResumes", "Lkotlinx/coroutines/flow/Flow;", "", "getResumeById", "insertResume", "updateResume", "app_debug"})
@androidx.room.Dao()
public abstract interface ResumeDao {
    
    @androidx.room.Query(value = "SELECT * FROM resumes ORDER BY updatedAt DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.macau.resumebuilder.data.database.ResumeEntity>> getAllResumes();
    
    @androidx.room.Query(value = "SELECT * FROM resumes WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getResumeById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.macau.resumebuilder.data.database.ResumeEntity> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertResume(@org.jetbrains.annotations.NotNull()
    com.macau.resumebuilder.data.database.ResumeEntity resume, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateResume(@org.jetbrains.annotations.NotNull()
    com.macau.resumebuilder.data.database.ResumeEntity resume, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteResume(@org.jetbrains.annotations.NotNull()
    com.macau.resumebuilder.data.database.ResumeEntity resume, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM resumes WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteResumeById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}