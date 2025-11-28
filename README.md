# Proyecto Traductor Lenguaje Natural a Scratch

## Descripción del Proyecto
Este proyecto tiene como objetivo crear un traductor de lenguaje natural a bloques de programación en Scratch. La idea es permitir a cualquier persona escribir instrucciones en un lenguaje más sencillo y en español, como si hablara de forma natural, para que el sistema las traduzca automáticamente a bloques Scratch. Esto se logra utilizando una gramática definida en ANTLR, que genera bloques Scratch en formato JSON compatibles con el editor de Scratch.

El traductor está compuesto por varias clases Java que permiten cargar el archivo de entrada, procesarlo utilizando ANTLR, y generar el código correspondiente en Scratch, que luego puede ser utilizado en un proyecto de Scratch.

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
Para ejecutar este proyecto, necesitas:
- **Java 11 o superior**.
- **ANTLR 4.13.2**: Se usa para procesar la gramática y convertir el lenguaje natural a bloques Scratch.
  ```bash
  java -jar antlr-4.13.2-complete.jar
