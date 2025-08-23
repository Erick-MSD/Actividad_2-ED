# Actividad_2-ED
Actividad 2 de la Materia de Estructura de Datos

## Ejecución

Instrucciones para compilar y ejecutar el proyecto en Windows (PowerShell):

1. Abrir PowerShell y situarse en la carpeta del proyecto.

2. Ejecutar el script incluido para compilar y correr la demo principal (`OSManagementDemo`):

```powershell
.\run.ps1
```

El script compila todos los archivos `.java` usando `javac --release 8` y luego ejecuta `OSManagementDemo`.

3. Ejecutar las pruebas ligeras (verifican operaciones básicas de `Pila` y `Cola`):

```powershell
# compilar y ejecutar el test harness
javac --release 8 *.java
java StackQueueTests
```

Nota sobre control de versiones:
- El repositorio contiene un archivo `.gitignore` que excluye archivos compilados (`*.class`). Esto evita subir archivos binarios compilados. No es necesario hacer nada adicional para ejecutar el proyecto localmente.

Archivos añadidos por esta entrega (documentación y pruebas):
- `run.ps1` — script PowerShell para compilar y ejecutar la demo.
- `StackQueueTests.java` — pequeño harness de pruebas que verifica las operaciones básicas.
- `.gitignore` — regla para ignorar `*.class`.

