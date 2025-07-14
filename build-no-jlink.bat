@echo off
echo 開始繞過jlink的構建過程...

REM 設置環境變數跳過jlink
set ANDROID_LINT_NULLNESS_IGNORE=true
set ANDROID_LINT_IGNORE=JLinkError,JvmModules
set JAVA_TOOL_OPTIONS=-Djdk.module.illegalAccess=deny

REM 設置JDK和Gradle
set JAVA_HOME=D:\Android Studio\jbr
set PATH=%JAVA_HOME%\bin;%PATH%
set GRADLE_HOME=%CD%\gradle-local\gradle-8.11.1
set PATH=%GRADLE_HOME%\bin;%PATH%

echo 使用JDK: %JAVA_HOME%
echo 使用Gradle: %GRADLE_HOME%

REM 清除緩存
echo 清理構建緩存...
rmdir /s /q build 2>nul
rmdir /s /q app\build 2>nul
rmdir /s /q %USERPROFILE%\.gradle\caches\transforms-3 2>nul

REM 設置額外參數跳過jlink問題
set GRADLE_OPTS=-Dandroid.useAndroidX=true -Dkotlin.jvm.target=17 -Dorg.gradle.jvmargs=-Xmx2048m

REM 使用特殊參數構建
echo 使用特殊參數構建，繞過jlink問題...
call gradle :app:assembleDebug --warning-mode=none --stacktrace --configure-on-demand -Dorg.gradle.jvmargs=-Xmx4g

if %ERRORLEVEL% EQU 0 (
    echo 構建成功! APK位於: app\build\outputs\apk\debug\app-debug.apk
) else (
    echo 構建失敗，錯誤代碼: %ERRORLEVEL%
)

echo 構建過程完成! 