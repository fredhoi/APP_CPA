@echo off
echo Setting up environment...
set GRADLE_HOME=%CD%\gradle-local\gradle-8.11.1
set PATH=%GRADLE_HOME%\bin;%PATH%
set KAPT_KOTLIN_JVM_TARGET=17
set JAVA_OPTS=-Dkapt.kotlin.jvm.target=17

echo Building with Gradle 8.11.1...
gradle :app:assembleDebug --info

echo Build completed! 