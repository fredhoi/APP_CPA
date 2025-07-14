@echo off
echo Starting build process...

REM 使用Android Studio中的Gradle
set ANDROID_STUDIO_PATH=D:\Android Studio
set GRADLE_PATH=%ANDROID_STUDIO_PATH%\gradle

REM 如果Android Studio路徑存在，使用其中的gradle
if exist "%GRADLE_PATH%" (
    echo Using Android Studio Gradle at: %GRADLE_PATH%
    set PATH=%GRADLE_PATH%\bin;%PATH%
    
    REM 直接使用gradle命令構建
    echo Building with Gradle...
    gradle clean :app:assembleDebug --stacktrace
) else (
    echo Android Studio path not found. Using gradlew...
    
    REM 使用gradle wrapper構建
    echo Building with Gradle wrapper...
    call .\gradlew clean :app:assembleDebug --stacktrace
)

echo Build process completed. 