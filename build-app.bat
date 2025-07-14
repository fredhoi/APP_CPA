@echo off
echo Starting build with Android Studio Gradle...

REM 設置Android Studio路徑和對應的Gradle
set ANDROID_STUDIO=D:\Android Studio
set GRADLE_HOME=%ANDROID_STUDIO%\gradle\gradle-8.4

REM 優先使用JDK 17
if exist "C:\Program Files\Java\jdk-17" (
    set JAVA_HOME=C:\Program Files\Java\jdk-17
    echo Using JDK 17: %JAVA_HOME%
) else if exist "%ANDROID_STUDIO%\jbr" (
    set JAVA_HOME=%ANDROID_STUDIO%\jbr
    echo Using Android Studio JBR: %JAVA_HOME%
) else (
    echo No suitable Java found. Using system Java.
)

REM 設置環境變量
set PATH=%GRADLE_HOME%\bin;%JAVA_HOME%\bin;%PATH%

REM 設置Gradle和Java選項
set GRADLE_OPTS=-Dorg.gradle.daemon=false -Dorg.gradle.jvmargs="-Xmx2g -XX:MaxMetaspaceSize=512m"
set JAVA_OPTS=-Djdk.module.illegalAccess=deny

REM JVM額外選項
set JAVA_TOOL_OPTIONS="--add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED"

REM 設置Kotlin JVM目標和禁用JDK模塊轉換
set BUILD_PARAMS=--no-daemon --stacktrace --warning-mode all
set KOTLIN_OPTS=-Pkotlin.jvm.target=17 -Pandroid.disableJdkImageTransform=true

echo Cleaning previous build...
gradle clean %BUILD_PARAMS% %KOTLIN_OPTS%

echo Building app...
gradle :app:assembleDebug %BUILD_PARAMS% %KOTLIN_OPTS%

if %ERRORLEVEL% NEQ 0 (
    echo Build failed with error level %ERRORLEVEL%
    exit /b %ERRORLEVEL%
)

echo Build completed successfully!
echo APK location: app\build\outputs\apk\debug\app-debug.apk 