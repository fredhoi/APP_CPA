@echo off
echo 開始修復Gradle構建問題...

REM 檢查並設置正確的JDK版本 (項目需要JDK 17)
echo 檢查Java版本...

if exist "%ANDROID_HOME%\jre\bin\java.exe" (
    set JAVA_HOME=%ANDROID_HOME%\jre
    echo 使用Android Studio內置的JRE: %JAVA_HOME%
) else if exist "C:\Program Files\Java\jdk-17" (
    set JAVA_HOME=C:\Program Files\Java\jdk-17
    echo 使用系統安裝的JDK 17: %JAVA_HOME%
) else if exist "D:\Android Studio\jbr" (
    set JAVA_HOME=D:\Android Studio\jbr
    echo 使用Android Studio的JBR: %JAVA_HOME%
) else (
    echo 未找到合適的JDK 17，將嘗試安裝...
    call install-jdk17.bat
)

REM 使用本地Gradle
set GRADLE_HOME=%CD%\gradle-local\gradle-8.11.1
set PATH=%GRADLE_HOME%\bin;%JAVA_HOME%\bin;%PATH%

echo 清除Gradle緩存...
rmdir /s /q %USERPROFILE%\.gradle\caches\transforms-3
rmdir /s /q %USERPROFILE%\.gradle\caches\8.10
rmdir /s /q %USERPROFILE%\.gradle\caches\8.11.1
mkdir %USERPROFILE%\.gradle\caches

echo 更新本地Gradle設置...
copy /y temp\gradle-wrapper.properties gradle\wrapper\gradle-wrapper.properties

echo 使用本地Gradle 8.11.1構建項目...
call gradle :app:clean :app:assembleDebug --stacktrace --info --warning-mode all

if %ERRORLEVEL% NEQ 0 (
    echo 使用本地Gradle失敗，嘗試使用Gradle Wrapper...
    call gradlew :app:clean :app:assembleDebug --stacktrace --info --warning-mode all
)

echo 構建過程完成! 