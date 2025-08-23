# Compila todos los archivos .java en el directorio actual y luego ejecuta OSManagementDemo
Write-Host "Compilando archivos Java (target compatibility: Java 8)..."
# Use --release 8 to produce class files compatible with older JVMs
javac --release 8 *.java 2>&1 | ForEach-Object { Write-Host $_ }
if ($LASTEXITCODE -ne 0) {
    Write-Host "La compilación falló (código $LASTEXITCODE)."; exit $LASTEXITCODE
}

Write-Host "Ejecución: OSManagementDemo"
java OSManagementDemo 2>&1 | ForEach-Object { Write-Host $_ }
