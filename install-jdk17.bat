@echo off
echo Setting up JDK 17 environment...

REM 創建下載目錄
if not exist "downloads" mkdir downloads
cd downloads

echo Downloading Amazon Corretto JDK 17...
REM 下載Amazon Corretto JDK 17 (免費OpenJDK實現)
powershell -Command "Invoke-WebRequest -Uri https://corretto.aws/downloads/latest/amazon-corretto-17-x64-windows-jdk.msi -OutFile amazon-corretto-17.msi"

echo Installing JDK 17...
REM 靜默安裝JDK
msiexec /i amazon-corretto-17.msi /quiet

echo Setting environment variables...
REM 設置JAVA_HOME環境變量
setx JAVA_HOME "C:\Program Files\Amazon Corretto\jdk17.0.10_8" /M
setx PATH "%PATH%;%JAVA_HOME%\bin" /M

echo Installation complete. Please restart your command prompt to apply changes.
cd ..

echo Verifying installation...
call java -version

echo Done! Now you can run build-app.bat to compile your project with JDK 17. 