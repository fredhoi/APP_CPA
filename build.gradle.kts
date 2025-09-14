// Top-level build file where you can add configuration options common to all sub-projects/modules.
// This file uses the Kotlin DSL (.kts) for better type safety and IDE support

plugins {
    // Android Gradle Plugin - MUST be compatible with Kotlin version
    id("com.android.application") version "8.13.0" apply false
    id("com.android.library") version "8.13.0" apply false
    
    // Kotlin Android plugin - MUST match the Kotlin version in libs.versions.toml
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    
    // Kotlin KAPT plugin for annotation processing
    id("org.jetbrains.kotlin.kapt") version "1.9.22" apply false
    
    // Kotlin Parcelize plugin for Parcelable support
    id("org.jetbrains.kotlin.plugin.parcelize") version "1.9.22" apply false
    
    // Hilt dependency injection plugin
    id("com.google.dagger.hilt.android") version "2.50" apply false
}

// Note: Repository configuration is handled in settings.gradle.kts
// to ensure centralized dependency management

// Clean task to remove build directories
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
