@echo off

REM===================================
SET REPOSITORY=.\.git\refs
REM===================================

SET REPOSITORY_HEADS=.\.git\refs\heads
SET REPOSITORY_REMOTES=.\.git\refs\remotes\origin

SET REPOSITORY_HEADS_CMD=dir %REPOSITORY_HEADS% /b
SET REPOSITORY_REMOTES_CMD=dir %REPOSITORY_REMOTES% /b

echo ===========================
echo Select CheckOut Branch
echo 1. Main
echo 2. Alpha
echo 3. beta
echo ===========================
SET /p num=Branch Number:

IF %num% EQU 1 (
    git checkout main
) ELSE IF %num% EQU 2 (
    git checkout alpha
) ELSE IF %num% EQU 3 (
    git checkout beta
)

for /F "tokens=*" %%F in ('%REPOSITORY_HEADS_CMD%') do (
    if not "%%F"=="main" if not "%%F"=="alpha" if not "%%F"=="beta" (
        del /q %REPOSITORY_HEADS%\%%F
    )
)

for /F "delims= tokens=*" %%F in ('%REPOSITORY_REMOTES_CMD%') do (
    if not "%%F"=="main" if not "%%F"=="alpha" if not "%%F"=="beta" (
        del /q %REPOSITORY_REMOTES%\%%F
    )
)

git pull