@echo off
echo Downloading Gradle 8.11.1...

powershell -Command "Invoke-WebRequest -Uri https://services.gradle.org/distributions/gradle-8.11.1-bin.zip -OutFile gradle-8.11.1-bin.zip"

echo Extracting Gradle...
mkdir gradle-local
powershell -Command "Expand-Archive -Path gradle-8.11.1-bin.zip -DestinationPath gradle-local -Force"

echo Setting up environment...
set GRADLE_HOME=%CD%\gradle-local\gradle-8.11.1
set PATH=%GRADLE_HOME%\bin;%PATH%

echo Testing Gradle installation...
gradle -v

echo Done! 