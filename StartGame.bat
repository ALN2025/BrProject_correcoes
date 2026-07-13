@echo off
title BrProject - Start GameServer
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

echo === Iniciando Game Server ===
echo Java: %JAVA%
%JAVA% -Xms1024m -Xmx2048m -Dext.mods.gameserver.data.AbstractLocaleData.BASE_LOCALE_PATH=html -Dsun.java2d.opengl=false -Dsun.java2d.d3d=false -Dsun.java2d.pmoffscreen=false -Dbrproject.safe.graphics=true -cp "libs/*" ext.mods.gameserver.GameServer

echo.
echo === Game Server Finalizado ===
pause
