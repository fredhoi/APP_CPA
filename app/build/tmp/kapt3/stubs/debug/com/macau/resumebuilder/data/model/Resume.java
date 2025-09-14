package com.macau.resumebuilder.data.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u00c6\u0003J\t\u0010*\u001a\u00020\fH\u00c6\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u00c6\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u00c6\u0003J\t\u0010-\u001a\u00020\u0012H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\u0085\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003H\u00c6\u0001J\t\u00100\u001a\u000201H\u00d6\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u00d6\u0003J\u0006\u00106\u001a\u00020\u0012J\t\u00107\u001a\u000201H\u00d6\u0001J\u0006\u00108\u001a\u000203J\t\u00109\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u000201H\u00d6\u0001R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001c\u00a8\u0006?"}, d2 = {"Lcom/macau/resumebuilder/data/model/Resume;", "Landroid/os/Parcelable;", "id", "", "basicInfo", "Lcom/macau/resumebuilder/data/model/BasicInfo;", "education", "", "Lcom/macau/resumebuilder/data/model/Education;", "experience", "Lcom/macau/resumebuilder/data/model/Experience;", "skills", "Lcom/macau/resumebuilder/data/model/Skills;", "awards", "Lcom/macau/resumebuilder/data/model/Award;", "activities", "Lcom/macau/resumebuilder/data/model/Activity;", "templateId", "", "createdAt", "updatedAt", "(JLcom/macau/resumebuilder/data/model/BasicInfo;Ljava/util/List;Ljava/util/List;Lcom/macau/resumebuilder/data/model/Skills;Ljava/util/List;Ljava/util/List;Ljava/lang/String;JJ)V", "getActivities", "()Ljava/util/List;", "getAwards", "getBasicInfo", "()Lcom/macau/resumebuilder/data/model/BasicInfo;", "getCreatedAt", "()J", "getEducation", "getExperience", "getId", "getSkills", "()Lcom/macau/resumebuilder/data/model/Skills;", "getTemplateId", "()Ljava/lang/String;", "getUpdatedAt", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "getResumeTitle", "hashCode", "isValid", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@kotlinx.parcelize.Parcelize()
public final class Resume implements android.os.Parcelable {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final com.macau.resumebuilder.data.model.BasicInfo basicInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.macau.resumebuilder.data.model.Education> education = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.macau.resumebuilder.data.model.Experience> experience = null;
    @org.jetbrains.annotations.NotNull()
    private final com.macau.resumebuilder.data.model.Skills skills = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.macau.resumebuilder.data.model.Award> awards = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.macau.resumebuilder.data.model.Activity> activities = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String templateId = null;
    private final long createdAt = 0L;
    private final long updatedAt = 0L;
    
    public Resume(long id, @org.jetbrains.annotations.NotNull()
    com.macau.resumebuilder.data.model.BasicInfo basicInfo, @org.jetbrains.annotations.NotNull()
    java.util.List<com.macau.resumebuilder.data.model.Education> education, @org.jetbrains.annotations.NotNull()
    java.util.List<com.macau.resumebuilder.data.model.Experience> experience, @org.jetbrains.annotations.NotNull()
    com.macau.resumebuilder.data.model.Skills skills, @org.jetbrains.annotations.NotNull()
    java.util.List<com.macau.resumebuilder.data.model.Award> awards, @org.jetbrains.annotations.NotNull()
    java.util.List<com.macau.resumebuilder.data.model.Activity> activities, @org.jetbrains.annotations.NotNull()
    java.lang.String templateId, long createdAt, long updatedAt) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.macau.resumebuilder.data.model.BasicInfo getBasicInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.macau.resumebuilder.data.model.Education> getEducation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.macau.resumebuilder.data.model.Experience> getExperience() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.macau.resumebuilder.data.model.Skills getSkills() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.macau.resumebuilder.data.model.Award> getAwards() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.macau.resumebuilder.data.model.Activity> getActivities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTemplateId() {
        return null;
    }
    
    public final long getCreatedAt() {
        return 0L;
    }
    
    public final long getUpdatedAt() {
        return 0L;
    }
    
    public final boolean isValid() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResumeTitle() {
        return null;
    }
    
    public Resume() {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long component10() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.macau.resumebuilder.data.model.BasicInfo component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.macau.resumebuilder.data.model.Education> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.macau.resumebuilder.data.model.Experience> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.macau.resumebuilder.data.model.Skills component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.macau.resumebuilder.data.model.Award> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.macau.resumebuilder.data.model.Activity> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    public final long component9() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.macau.resumebuilder.data.model.Resume copy(long id, @org.jetbrains.annotations.NotNull()
    com.macau.resumebuilder.data.model.BasicInfo basicInfo, @org.jetbrains.annotations.NotNull()
    java.util.List<com.macau.resumebuilder.data.model.Education> education, @org.jetbrains.annotations.NotNull()
    java.util.List<com.macau.resumebuilder.data.model.Experience> experience, @org.jetbrains.annotations.NotNull()
    com.macau.resumebuilder.data.model.Skills skills, @org.jetbrains.annotations.NotNull()
    java.util.List<com.macau.resumebuilder.data.model.Award> awards, @org.jetbrains.annotations.NotNull()
    java.util.List<com.macau.resumebuilder.data.model.Activity> activities, @org.jetbrains.annotations.NotNull()
    java.lang.String templateId, long createdAt, long updatedAt) {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
}