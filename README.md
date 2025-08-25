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

- # 📌 Proyecto: Gestión de Listas Enlazadas en Java

Este proyecto es un programa en **Java** que permite **crear y manipular diferentes tipos de listas enlazadas**.  
El usuario puede trabajar con:

- ✅ **Lista simplemente enlazada** → Cada nodo apunta al siguiente.  
- ✅ **Lista doblemente enlazada** → Cada nodo apunta al anterior y al siguiente.  
- ✅ **Lista circular** → El último nodo se conecta con el primero.

El programa muestra un **menú interactivo** donde puedes:
- Insertar datos.
- Eliminar datos.
- Buscar datos.
- Mostrar todos los elementos.
- Insertar ejemplos de datos automáticamente.

Este proyecto es útil para **aprender estructuras de datos** y practicar **listas enlazadas** en Java.

---

## 🚀 Tecnologías utilizadas
- **Java (JDK 8 o superior)**
- **Scanner** → Para leer datos del usuario.
- **LinkedList** → Clase personalizada para manejar listas.
- **DataTypeExamples** → Inserta datos de prueba automáticamente.

---

## 📂 Estructura del programa

El código principal está en la clase `Main` y funciona en **tres pasos**:

---

### **1️⃣ Selección del tipo de lista**
Al iniciar, el programa te pide elegir qué tipo de lista deseas:

```java
System.out.println("--- Selecciona el tipo de lista ---");
System.out.println("1. Simplemente enlazada");
System.out.println("2. Doblemente enlazada");
System.out.println("3. Circular");
Luego, dependiendo de tu elección, se crea la lista:

java
Copiar
Editar
if (tipo == 1) lista = new LinkedList<>(false, false);
else if (tipo == 2) lista = new LinkedList<>(true, false);
else lista = new LinkedList<>(false, true);
Primer parámetro: true si la lista es doblemente enlazada.

Segundo parámetro: true si la lista es circular.

Si no eliges nada válido → el programa usa lista simplemente enlazada por defecto.

2️⃣ Menú interactivo
Después de elegir la lista, aparece un menú con opciones:

text
Copiar
Editar
--- Menú ---
1. Insertar dato
2. Eliminar dato
3. Buscar dato
4. Mostrar lista
5. Insertar ejemplos de DataTypeExamples
0. Salir
Este menú se repite hasta que elijas la opción 0 (Salir).

3️⃣ Funcionalidades principales
Opción	Funcionalidad	Descripción
1	Insertar dato	Pide un valor y lo agrega al final de la lista.
2	Eliminar dato	Solicita un valor y lo borra si existe.
3	Buscar dato	Verifica si un valor está en la lista.
4	Mostrar lista	Imprime todos los elementos de la lista.
5	Insertar ejemplos	Inserta automáticamente datos predefinidos usando DataTypeExamples.
0	Salir	Termina el programa.

🔄 Cómo funciona el programa internamente
El flujo general de ejecución es el siguiente:

mermaid
Copiar
Editar
flowchart TD
    A[Inicio] --> B[Seleccionar tipo de lista]
    B --> C[Crear LinkedList personalizada]
    C --> D[Mostrar menú principal]
    D -->|1 Insertar| E[Agregar elemento a la lista]
    D -->|2 Eliminar| F[Quitar elemento de la lista]
    D -->|3 Buscar| G[Comprobar si existe el dato]
    D -->|4 Mostrar| H[Imprimir elementos en consola]
    D -->|5 Ejemplos| I[Agregar datos predefinidos]
    D -->|0 Salir| J[Finalizar programa]
    E --> D
    F --> D
    G --> D
    H --> D
    I --> D
Explicación simple:
Primero eliges el tipo de lista → se crea la lista → se muestra el menú → eliges una acción → el programa ejecuta esa acción → vuelve al menú hasta que decidas salir.

📦 Cómo ejecutar el proyecto
Sigue estos pasos para probarlo en tu computadora:

1. Compilar el programa
Abre una terminal en la carpeta del proyecto y escribe:

bash
Copiar
Editar
javac Main.java
2. Ejecutar el programa
Una vez compilado, ejecuta:

bash
Copiar
Editar
java Main
3. Interactuar con el menú
Selecciona el tipo de lista.

Usa las opciones para insertar, eliminar, buscar o mostrar datos.

📌 Notas importantes
La clase LinkedList NO es la misma que la de java.util. Es una implementación personalizada incluida en este proyecto.

La clase DataTypeExamples permite insertar datos de ejemplo automáticamente.

Si no ingresas nada o escribes algo incorrecto, el programa usa por defecto una lista simplemente enlazada.

El menú es interactivo y se repite hasta que elijas 0 (Salir).


- `.gitignore` — regla para ignorar `*.class`.

