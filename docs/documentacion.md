## App 

El App.java ejecuta procesos independientes para calcular la media y la mediana de datos contenidos en un archivo CSV. Primero, lee todas las líneas del archivo Datos.csv, suponiendo que cada línea representa un conjunto de números separados por comas. Luego, utiliza la clase ProcessLauncher para lanzar un proceso de cálculo de media y otro de mediana para cada línea de datos, guardando los resultados en archivos de salida.

## Media


La clase Media.java calcula la media de un conjunto de números proporcionados como argumento de entrada, los cuales deben estar en una cadena separada por comas. Al ejecutarse, el programa toma el primer argumento (args[0]), lo divide en sus valores numéricos y calcula el promedio, imprimiendo el resultado.

## Mediana

La clase Mediana.java calcula la mediana de un conjunto de números proporcionados como argumento de entrada, los cuales deben estar en una cadena separada por comas. Al ejecutarse, el programa toma el primer argumento (args[0]), lo divide en sus valores numéricos y calcula el promedio, imprimiendo el resultado.

## ProcessLauncher

La clase ProcessLauncher.java nos da métodos para lanzar procesos en Java que ejecutan los cálculos de media y mediana usando clases externas (Media y Mediana). Cada uno pasado como argumento. Los métodos initMedia e initMediana configuran los procesos con un ProcessBuilder, redirigen la salida de cada cálculo a un archivo específico y gestionan cualquier error en un archivo de errores centralizado.
