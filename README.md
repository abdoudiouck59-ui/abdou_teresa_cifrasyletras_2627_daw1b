# Cifras y Letras - Proyecto de Programación en Java

## 1. Descripción del proyecto

Este proyecto consiste en crear una versión sencilla del concurso Cifras y Letras utilizando Java.

El juego está pensado para dos jugadores que participan por turnos desde un mismo ordenador. Los jugadores tienen que superar diferentes pruebas relacionadas con los números, las operaciones matemáticas y las palabras.

El objetivo es conseguir más puntos que el otro jugador y ganar el concurso.

Con este proyecto practicamos lo que hemos aprendido en clase: variables, condicionales, bucles, funciones y validación de datos.

## 2. Integrantes del equipo

- Teresa Saavedra Pérez
- Abdou Lahate Diouck

**Curso:** 1.º DAW - Grupo B

**Centro:** IES Albarregas

## 3. Pruebas del juego

El proyecto tiene las siguientes pruebas:

### 3.1. La cifra exacta

El programa genera un número objetivo de tres cifras y seis números aleatorios entre 1 y 10.

Cada jugador tiene que intentar acercarse al número objetivo utilizando sumas, restas, multiplicaciones y divisiones.

Cada jugador puede realizar cinco operaciones. Gana quien consiga el resultado más cercano al número objetivo.

### 3.2. La palabra más larga

El programa genera letras aleatorias, con un mínimo de cuatro vocales y cuatro consonantes.

Cada jugador tiene que escribir una palabra utilizando las letras disponibles.

El programa comprueba que la palabra se puede formar con esas letras, sin repetir ninguna más veces de las que aparece.

El otro jugador comprueba si la palabra existe en español y puede utilizar un diccionario.

Gana el jugador que consiga la palabra válida más larga. Si las dos palabras tienen la misma longitud y son válidas, hay empate.

### 3.3. La calculadora humana

En esta prueba, los jugadores tienen que resolver operaciones matemáticas mentalmente.

El programa genera operaciones de suma, resta, multiplicación y división.

Cada jugador introduce sus respuestas y el programa comprueba si son correctas.

También se mide el tiempo que tarda cada jugador. Por cada respuesta incorrecta se añaden 20 segundos de penalización.

Gana el jugador que tenga el menor tiempo final.

### 3.4. Prueba original

También tenemos que crear una prueba nueva relacionada con Cifras y Letras.

Primero debemos presentar nuestra idea al profesor y recibir su aprobación antes de programarla.

## 4. Modos de juego

El programa tendrá dos modos de juego:

### Modo concurso

Los dos jugadores participan en todas las pruebas.

El ganador de cada prueba consigue un punto en el marcador global. Si hay empate, ninguno consigue ese punto.

Al finalizar todas las pruebas, gana el jugador que tenga más puntos.

### Modo rápido

Permite elegir una sola prueba y jugarla directamente.

El ganador será el jugador que consiga el mejor resultado en esa prueba.

## 5. Configuración del programa

El programa tiene un menú de configuración que permite cambiar algunos valores antes de jugar.

| Parámetro | Valor por defecto |
|---|---|
| Repeticiones de las pruebas | 1 |
| Cantidad de letras | 10 |
| Cantidad de operaciones | 5 |

La cantidad de letras debe ser como mínimo 8, porque siempre se necesitan al menos cuatro vocales y cuatro consonantes.

El programa comprueba los valores introducidos para evitar errores.

## 6. Archivos del proyecto

Los archivos principales del proyecto son:

| Archivo | Función |
|---|---|
| `Main.java` | Menú principal, configuración y marcadores. |
| `CifrasExactas.java` | Prueba La cifra exacta. |
| `PalabraMasLarga.java` | Prueba La palabra más larga. |
| `CalculadoraHumana.java` | Prueba La calculadora humana. |
| `README.md` | Información e instrucciones del proyecto. |

## 7. Cómo ejecutar el programa

Para ejecutar el proyecto necesitamos tener Java instalado.

**Desde Visual Studio Code:**

1. Descargar el proyecto desde GitHub.
2. Abrir la carpeta del proyecto en Visual Studio Code.
3. Abrir el archivo `Main.java`.
4. Pulsar Run para iniciar el programa.
5. Elegir una opción del menú principal.

También podemos ejecutar las pruebas por separado desde sus archivos Java, cuando tienen un método `main`.

**Desde la terminal:**

Primero compilamos los archivos Java:

`javac *.java`

Después ejecutamos el programa principal:

`java Main`

Para compilar correctamente, todos los archivos deben estar completos y sin errores.

## 8. Reparto del trabajo

El proyecto se realiza en pareja y utilizamos GitHub para compartir los archivos y guardar los cambios.

### Teresa Saavedra Pérez

- Estructura principal del programa.
- Menú principal y marcadores.
- Modos concurso y rápido.
- Prueba La cifra exacta.
- Prueba La calculadora humana.

### Abdou Lahate Diouck

- Prueba La palabra más larga.
- Menú de configuración y validación de sus valores.
- Archivo README.

### Trabajo conjunto

- Funciones comunes.
- Diseño de la prueba original.
- Integración de las pruebas.
- Comprobación y corrección de errores.
- Preparación del PowerPoint final.

## 9. Estado actual del proyecto

El proyecto todavía está en desarrollo.

La prueba La palabra más larga ya se ha probado por separado. Funciona la generación de letras, la comprobación de palabras y la comparación de resultados.

El menú de configuración también se ha probado y permite cambiar la cantidad de letras.

Todavía tenemos que terminar de integrar las pruebas con el menú principal y comprobar que los marcadores funcionan correctamente.

También queda pendiente la prueba original, que debemos consultar primero con el profesor.

## 10. Herramientas utilizadas

- **Java:** para programar el juego.
- **Visual Studio Code:** para escribir y ejecutar el código.
- **Git:** para guardar las versiones del proyecto.
- **GitHub:** para compartir el trabajo entre los dos integrantes.

---

Proyecto realizado por Teresa Saavedra Pérez y Abdou Lahate Diouck.

1.º DAW - IES Albarregas.