@echo off
echo Starting build with Android Studio Gradle...

REM 設置Android Studio路徑和對應的Gradle
set ANDROID_STUDIO=D:\Android Studio
set GRADLE_HOME=%ANDROID_STUDIO%\gradle\gradle-8.4

REM 設置Java環境
if exist "%ANDROID_STUDIO%\jbr" (
    set JAVA_HOME=%ANDROID_STUDIO%\jbr
    echo Using Android Studio JBR: %JAVA_HOME%
) else if exist "C:\Program Files\Java\jdk-17" (
    set JAVA_HOME=C:\Program Files\Java\jdk-17
    echo Using JDK 17: %JAVA_HOME%
) else (
    echo No suitable Java found. Using system Java.
)

REM 設置環境變量
set PATH=%GRADLE_HOME%\bin;%JAVA_HOME%\bin;%PATH%

echo Cleaning previous build...
gradle clean

echo Building app...
gradle :app:assembleDebug --stacktrace

echo Building test...
gradle :app:assembleDebugAndroidTest --stacktrace

echo Running lint...
gradle :app:lintDebug --stacktrace

echo Building release...
gradle :app:assembleRelease --stacktrace

echo Build process completed. 
pause 