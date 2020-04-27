@echo off
set PATH_TO_FX="C:\Program Files\JavaFX\javafx-sdk-14.0.1\lib"
start javaw --module-path %PATH_TO_FX% --add-modules=javafx.controls,javafx.fxml -jar "%~dp0projectzoultron.jar"
exit