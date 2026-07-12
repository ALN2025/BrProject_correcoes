@echo off
cd /d "%~dp0"
echo Este script foi movido para Brproject_Distribution\dev-console\StartLogin_SemDashboard.bat
if exist "%~dp0StartLogin_SemDashboard.vbs" (
    wscript "%~dp0StartLogin_SemDashboard.vbs"
) else if exist "%~dp0Brproject_Distribution\dev-console\StartLogin_SemDashboard.vbs" (
    wscript "%~dp0Brproject_Distribution\dev-console\StartLogin_SemDashboard.vbs"
) else if exist "%~dp0Brproject_Distribution\dev-console\StartLogin_SemDashboard.bat" (
    cd /d "%~dp0Brproject_Distribution\dev-console"
    call StartLogin_SemDashboard.bat
) else (
    echo ERRO: arquivo nao encontrado: Brproject_Distribution\dev-console\StartLogin_SemDashboard.bat
    pause
)
