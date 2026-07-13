@echo off
title BrProject - Start All
color 0B
cd /d "%~dp0"

echo === Iniciando Servidores BrProject ===
echo.

start "Login Server" cmd /c "StartLogin.bat"
timeout /t 5 /nobreak >nul

start "Game Server" cmd /c "StartGame.bat"

echo.
echo === Servidores Iniciados ===
echo Login Server e Game Server foram iniciados em janelas separadas.
pause
