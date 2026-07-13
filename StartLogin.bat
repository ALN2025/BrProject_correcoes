@echo off
title BrProject - Start Login
color 0B
cd /d "%~dp0"

REM --- Configurando para usar o Java 25 ---
set JAVA="D:\core jdk 25\bin\java.exe"

REM --- Verificar se o Java existe ---
if not exist "%JAVA%" (
    echo ERRO: Java 25 nao encontrado em %JAVA%
    pause
    exit /b 1
)

echo === Iniciando Login Server ===
echo Java: %JAVA%
%JAVA% -Xms256m -Xmx512m -Dext.mods.gameserver.data.AbstractLocaleData.BASE_LOCALE_PATH=html -Dsun.java2d.opengl=false -Dsun.java2d.d3d=false -Dsun.java2d.pmoffscreen=false -Dbrproject.safe.graphics=true -cp "libs/*" ext.mods.security.LicenseInit

echo.
echo === Login Server Finalizado ===
pause
