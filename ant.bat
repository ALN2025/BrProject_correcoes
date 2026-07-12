@echo off
setlocal enabledelayedexpansion

REM Wrapper local para rodar os comandos que voce ja conhece sem precisar de Ant instalado.
REM Use este arquivo no diretorio raiz do BrProject.

cd /d "%~dp0"
set "GRADLE_DIR=%CD%\correcao\build\gradle-jar\src"
set "WRAPPER_JAR=%GRADLE_DIR%\gradle\wrapper\gradle-wrapper.jar"
set "ROOT_WRAPPER_JAR=%CD%\gradle\wrapper\gradle-wrapper.jar"

if not exist "%GRADLE_DIR%\gradlew.bat" (
    echo ERRO: gradlew.bat nao encontrado em "%GRADLE_DIR%"
    exit /b 1
)

if not exist "%WRAPPER_JAR%" (
    if exist "%ROOT_WRAPPER_JAR%" (
        echo Aviso: gradle-wrapper.jar nao encontrado em %GRADLE_DIR%\gradle\wrapper, copiando do wrapper raiz...
        if not exist "%GRADLE_DIR%\gradle\wrapper" mkdir "%GRADLE_DIR%\gradle\wrapper"
        copy /Y "%ROOT_WRAPPER_JAR%" "%WRAPPER_JAR%" >nul
        if errorlevel 1 (
            echo ERRO: falha ao copiar gradle-wrapper.jar
            exit /b 1
        )
    ) else (
        echo ERRO: gradle-wrapper.jar nao encontrado em %ROOT_WRAPPER_JAR%
        exit /b 1
    )
)

if "%~1"=="" goto usage
set "TARGET=%~1"

if /i "%TARGET%"=="compile" (
    pushd "%GRADLE_DIR%"
    call gradlew.bat classes syncBinClasses --console=plain
    set "RESULT=%ERRORLEVEL%"
    popd
    exit /b %RESULT%
)

if /i "%TARGET%"=="jar" (
    pushd "%GRADLE_DIR%"
    call gradlew.bat copyDependencies classes jar --console=plain
    set "RESULT=%ERRORLEVEL%"
    popd
    exit /b %RESULT%
)

if /i "%TARGET%"=="dist-local" (
    pushd "%GRADLE_DIR%"
    call gradlew.bat copyDependencies classes jar --console=plain
    set "RESULT=%ERRORLEVEL%"
    popd
    if not "%RESULT%"=="0" exit /b %RESULT%
    echo.
    echo JAR pronto. Este projeto usa Mount.xml para empacotar a distribuicao final.
    echo Se voce tiver Mount.xml, execute: ant -f Mount.xml dist-local
    exit /b 0
)

if /i "%TARGET%"=="clean" (
    pushd "%GRADLE_DIR%"
    call gradlew.bat clean --console=plain
    set "RESULT=%ERRORLEVEL%"
    popd
    exit /b %RESULT%
)

goto usage

:usage
echo Uso: ant ^<target^>
echo Targets disponiveis: compile, jar, dist-local, clean
exit /b 1
