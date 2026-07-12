@echo off
setlocal enabledelayedexpansion

REM Use este script no diretório raiz do projeto BrProject.
REM Ele compila o projeto e copia o JAR final para libs\server.jar.

cd /d "%~dp0"
echo [1/3] Verificando arquivos de build...
if not exist "correcao\build\gradle-jar\src\gradlew.bat" (
    echo ERRO: gradlew.bat nao encontrado em correcao\build\gradle-jar\src
    exit /b 1
)

set "BUILD_ROOT=%CD%\correcao\build\gradle-jar\src"
set "OUTPUT_JAR=%BUILD_ROOT%\libs\server.jar"
set "TARGET_LIBS=%CD%\libs"

pushd "%BUILD_ROOT%"
echo [2/3] Executando build Gradle...
call gradlew.bat jar --console=plain
set "BUILD_RESULT=%ERRORLEVEL%"
popd

if not "%BUILD_RESULT%"=="0" (
    echo ERRO: falha no build. Verifique a saida acima.
    exit /b %BUILD_RESULT%
)

if not exist "%OUTPUT_JAR%" (
    echo ERRO: build concluido, mas nao foi possivel encontrar %OUTPUT_JAR%
    exit /b 1
)

if not exist "%TARGET_LIBS%" mkdir "%TARGET_LIBS%"

echo [3/3] Copiando server.jar para %TARGET_LIBS%\server.jar...
copy /Y "%OUTPUT_JAR%" "%TARGET_LIBS%\server.jar" >nul
if errorlevel 1 (
    echo ERRO: falha ao copiar server.jar para %TARGET_LIBS%\server.jar
    exit /b 1
)

echo Build concluido com sucesso.
echo Resultado final: %TARGET_LIBS%\server.jar
exit /b 0
