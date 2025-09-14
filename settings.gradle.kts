// Settings file for the Career Planning App
// This file defines the project structure and includes all modules

pluginManagement {
    repositories {
        google()           // Google Maven repository for Android plugins
        mavenCentral()     // Maven Central for general plugins
        gradlePluginPortal() // Gradle Plugin Portal for community plugins
    }
}

// Configure dependency resolution management
dependencyResolutionManagement {
    // Fail on project repositories to ensure centralized dependency management
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    
    repositories {
        google()           // Google Maven repository for Android libraries
        mavenCentral()     // Maven Central for general libraries
        gradlePluginPortal() // For Gradle plugins
    }
}

// Root project name
rootProject.name = "Career Planning App"

// Include all modules in the project
include(":app")                    // Main application module
