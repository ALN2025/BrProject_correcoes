@echo off
chcp 65001 >nul
cd /d "%~dp0"

REM Janela com icone L2j (sem CMD preto)
if exist "L2VoiceServer.exe" (
    start "" "%~dp0L2VoiceServer.exe"
    exit /b 0
)

title L2Voice — voice-server (Dev ALN)
echo.
echo  ============================================================
echo   L2Voice voice-server — Dev ALN
echo  ============================================================
echo.
echo  [AVISO] L2VoiceServer.exe ausente — modo CMD legado.
echo  Recompile: ModVozALN\installer\COMPILAR-VOICE-LAUNCHER.bat
echo.

if exist "bin\voice-server.exe" (
    bin\voice-server.exe -udp :17666 -ws :17667 -redis 127.0.0.1:6379 -redis-chan l2jalnvoice:events -multibox-mute=false -no-banner
    pause
    exit /b 0
)

if not exist "voice-server.exe" (
    echo  Falta bin\voice-server.exe nesta pasta.
    pause
    exit /b 1
)

voice-server.exe -udp :17666 -ws :17667 -redis 127.0.0.1:6379 -redis-chan l2jalnvoice:events -multibox-mute=false -no-banner
pause
