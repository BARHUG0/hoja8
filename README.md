# Hoja de Trabajo 8

## Autores

 - Hugo Daniel Barillas Ajín
 - List item

## Descripción

Este repositorio contiene un sistema de atención de pacientes según su momento de ingreso y prioridad del diagnóstico. Se empleó el lenguaje de programación [Java](https://www.java.com/es/), el software de gestión de proyectos [Maven](https://maven.apache.org/) y el software de pruebas [JUnit5](https://junit.org/junit5/).   El programa utilizó dos implementaciones del ADT Priority Queue: la nativa de Java Collections Framework y una diseñada con vectores. El ingreso de los pacientes se realiza mediante un archivo de texto que contiene una lista con una sintáxis específica en desorden. El programa se encarga de ordenar los pacientes ingresados para que el próximo atentido sea el más severo de todos.
 
## UML



## Ejecución 
Compilar el Progama

    javac App.java
Añadir un archivo con el nombre **patientsTest.txt** a la carpeta:

    src\main\resources

 
Seguir la sintáxis "**nombre, diagnóstico, prioridad**" para todo archivo de texto.

    Juan Perez, fractura de pierna, C
    Maria Ramirez, apendicitis, A
    Lorenzo Toledo, chikunguya, E
    Carmen Sarmientos, dolores de parto, B

 Ejecutar el programa
 

    java App.java
   
Esperar la siguiente información en consola:

    Bienvenido al Sistema de Atención de Emergencias UVG
    Seleccionar la implementación de Priority Queue a utilizar:
    1. Vector Heap
    2. Java Collection Framework
  Ingresar "2" con el teclado y presionar Enter. Debería aparecer el siguiente mensaje:
  

    Modo de ejecución:
    1. Test
    2. Usuario
    3. Salir
  Ingresar "1" y presionar enter. Debería aparecer el siguiente mensaje:
  

    Ingrese la opción a ejecutar
    1. IMostrar la prioridad de pacientes
    2. Salir
Ingresar "1" y presionar enter. Debería observar la lista de pacientes ordenada alfabéticamente según la prioridad. El programa corre correctamente.

    Maria Ramirez, apendicitis, A
    Carmen Sarmientos, dolores de parto, B
    Juan Perez, fractura de pierna, C
    Lorenzo Toledo, chikunguya, E




 

