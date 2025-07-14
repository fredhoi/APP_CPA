@echo off
echo 啟動優化的構建過程...

REM 設置Android Studio路徑和對應的Gradle
set ANDROID_STUDIO=D:\Android Studio
set GRADLE_HOME=%ANDROID_STUDIO%\gradle\gradle-8.4

REM 設置Java環境
if exist "%ANDROID_STUDIO%\jbr" (
    set JAVA_HOME=%ANDROID_STUDIO%\jbr
    echo 使用Android Studio JBR: %JAVA_HOME%
) else if exist "C:\Program Files\Java\jdk-17" (
    set JAVA_HOME=C:\Program Files\Java\jdk-17
    echo 使用JDK 17: %JAVA_HOME%
) else (
    echo 沒有找到合適的Java。使用系統Java。
)

REM 設置環境變量
set PATH=%GRADLE_HOME%\bin;%JAVA_HOME%\bin;%PATH%
set GRADLE_OPTS=-Dandroid.enableJdkImageTransform=false

echo 清理先前的構建...
gradle clean

echo 構建應用...
gradle build --stacktrace

echo 構建過程完成。
pause 