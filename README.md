# Proyecto Traductor Lenguaje Natural a Scratch

## Descripción del Proyecto
Este proyecto tiene como objetivo desarrollar un **compilador** que traduzca un **lenguaje de programación simplificado** y accesible, escrito en formato de **instrucciones naturales** (como `avanzar(10);`, `girar(izquierda);`, `esperar(2);`, `detener;`), a **bloques de programación visuales** de **Scratch**, representados en **formato JSON**.

La finalidad de este compilador es facilitar la creación de proyectos en **Scratch** sin necesidad de interactuar directamente con su interfaz gráfica, promoviendo una programación más accesible y comprensible para principiantes y usuarios sin experiencia previa en programación.

El compilador automatiza la conversión de instrucciones a bloques visuales de Scratch, optimizando el proceso de enseñanza y aprendizaje de programación mediante un enfoque simplificado y visual. Este proyecto permite escribir instrucciones en lenguaje natural y obtener bloques de código que se pueden usar en Scratch para construir proyectos interactivos y educativos.

## Información del Proyecto
- **Materia**: Programación de Sistemas de Base II
- **Institución**: Universidad Autónoma de Tamaulipas
- **Semestre**: Noveno semestre, año 2025
- **Maestro**: Muñoz Quintero Dante

## Integrantes del Equipo
- **José Raúl Hernández Sandoval** - [2213332170]
- **Martínez Hernández José Amando** - [2213332179]
- **Bonilla Salinas Miguel Ángel** - [2213332136]
- **Salazar González Jeremy** - [2213332207]
- **Ana Patricia Hernández Lara** - [2213332168]

## Estructura del Proyecto
El proyecto está organizado de la siguiente manera:
- `grammar/` - Contiene la gramática ANTLR necesaria para el traductor.
  - `MiLenguaje.g4` - Definición de la gramática que traduce instrucciones en lenguaje natural a instrucciones de Scratch.
- `src/` - Código fuente.
  - `Main.java` - Clase principal que carga el archivo de entrada, lo parsea y genera el código Scratch.
  - `ScratchGeneratorVisitor.java` - Visitor que convierte el lenguaje natural a bloques Scratch, según las instrucciones del archivo de entrada.
  - `ScratchBlock.java` - Define los bloques de Scratch y los convierte a formato JSON.
- `salida/` - Carpeta donde se guardan los resultados generados.
  - `scratch_output.json` - Salida generada con los bloques de Scratch que pueden ser utilizados en Scratch.

## Requisitos y Dependencias
Para ejecutar este proyecto, se requiere lo siguiente:
- **Java 11 o superior**.
- **ANTLR 4.13.2**: Usado para procesar la gramática y convertir el lenguaje natural a bloques Scratch.
  ```bash
  java -jar antlr-4.13.2-complete.jar
