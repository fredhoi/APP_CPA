// App module build configuration for Career Planning App
// This is the main application module that depends on other feature modules

plugins {
    // Android application plugin
    id("com.android.application")
    
    // Kotlin Android plugin
    id("org.jetbrains.kotlin.android")
    
    // Kotlin KAPT for annotation processing (Room, Hilt)
    id("org.jetbrains.kotlin.kapt")
    
    // Kotlin Parcelize for Parcelable support
    id("org.jetbrains.kotlin.plugin.parcelize")
    
    // Hilt dependency injection
    id("com.google.dagger.hilt.android")
}

android {
    // Namespace for the application - MUST match package name
    namespace = "com.macau.resumebuilder"
    
    // Compile SDK version - Use latest stable version
    compileSdk = 34
    
    defaultConfig {
        // Application ID - unique identifier for the app
        applicationId = "com.macau.resumebuilder"
        
        // Minimum SDK version - Android 7.0 (API 24)
        minSdk = 24
        
        // Target SDK version - Should match compileSdk
        targetSdk = 34
        
        // Version code for app updates
        versionCode = 1
        
        // Version name for users
        versionName = "1.0"
        
        // Test instrumentation runner
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        
        // Vector drawable support
        vectorDrawables {
            useSupportLibrary = true
        }
    }
    
    buildTypes {
        // Debug build configuration
        debug {
            isDebuggable = true
            isMinifyEnabled = false
            applicationIdSuffix = ".debug"
            versionNameSuffix = "-debug"
        }
        
        // Release build configuration
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    
    // Java compilation options
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    
    // Kotlin compilation options
    kotlinOptions {
        jvmTarget = "1.8"
    }
    
    // Build features
    buildFeatures {
        compose = true          // Enable Jetpack Compose
        buildConfig = true      // Enable BuildConfig generation
    }
    
    // Compose compiler options
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.8"
    }
    
    // Packaging options
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            excludes += "/META-INF/gradle/incremental.annotation.processors"
        }
    }
}

dependencies {
    // Core Android libraries
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    
    // AppCompat for theme support
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    
    // Compose BOM - manages all Compose library versions
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.bundles.compose)
    implementation("androidx.compose.material3:material3")
    
    // Navigation
    implementation(libs.androidx.navigation.compose)
    
    // ViewModel
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.androidx.lifecycle.runtime.compose)
    
    // Room database
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    kapt(libs.androidx.room.compiler)
    
    // Hilt dependency injection
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
    implementation(libs.androidx.hilt.navigation.compose)
    
    // PDF generation
    implementation(libs.itext7.core)
    
    // Coroutines
    implementation(libs.kotlinx.coroutines.android)
    
    // Note: Module dependencies removed as modules are empty
    // Add module dependencies back when modules have actual content
    
    // Testing dependencies
    testImplementation(libs.bundles.testing)
    androidTestImplementation(libs.bundles.android.testing)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    
    // Debug dependencies
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
}
