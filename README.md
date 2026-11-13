# Cifras y Letras - Proyecto de Programación en Java

## 1. Descripción del proyecto

Este proyecto consiste en desarrollar una versión sencilla del concurso *Cifras y Letras* utilizando Java.

El juego está pensado para dos jugadores que participan por turnos desde un mismo ordenador. Incluye cuatro pruebas relacionadas con los números, las operaciones matemáticas, las palabras y la lógica.

El objetivo es conseguir más puntos que el otro jugador y ganar el concurso.

Con este proyecto practicamos los contenidos aprendidos en clase: variables, condicionales, bucles, métodos, clases, números aleatorios y validación de datos.

## 2. Integrantes del equipo

- Teresa Saavedra Pérez
- Abdou Lahate Diouck

**Curso:** 1.º DAW - Grupo B  
**Centro:** IES Albarregas

## 3. Pruebas del juego

### 3.1. La cifra exacta

El programa genera un número objetivo de tres cifras y seis números aleatorios entre 1 y 10.

Cada jugador intenta acercarse al número objetivo utilizando operaciones matemáticas: suma, resta, multiplicación y división.

Cada jugador puede realizar cinco operaciones. Gana quien consiga el resultado más cercano al número objetivo.

### 3.2. La palabra más larga

El programa genera letras aleatorias, con un mínimo de cuatro vocales y cuatro consonantes.

Cada jugador debe escribir una palabra utilizando las letras disponibles.

El programa comprueba que la palabra se puede formar con esas letras, sin utilizar ninguna más veces de las que aparece.

El otro jugador comprueba si la palabra existe en español y puede consultar un diccionario.

Gana quien consiga la palabra válida más larga. Si ambos jugadores consiguen la misma longitud, hay empate.

### 3.3. La calculadora humana

Los jugadores deben resolver operaciones matemáticas mentalmente.

El programa genera operaciones de suma, resta, multiplicación y división.

Cada jugador introduce sus respuestas y el programa comprueba si son correctas.

También se mide el tiempo empleado. Por cada respuesta incorrecta se añaden 20 segundos de penalización.

Gana el jugador que tenga el menor tiempo final.

### 3.4. Descifra el código (prueba original)

Esta es la cuarta prueba del proyecto.

El programa genera un código secreto de tres cifras diferentes. La primera cifra no puede ser cero.

Cada jugador tiene un máximo de siete intentos para descubrir el código.

Después de cada intento, el programa indica:

- Cuántas cifras introducidas aparecen en el código secreto.
- Cuántas cifras están colocadas en la posición correcta.

El programa comprueba que cada respuesta tenga tres cifras diferentes.

Gana el jugador que descubre el código en menos intentos. Si ninguno lo descubre, hay empate. También hay empate si ambos necesitan el mismo número de intentos.

## 4. Modos de juego

### Modo concurso

Los dos jugadores participan en las cuatro pruebas.

El ganador de cada prueba consigue un punto en el marcador global. En caso de empate, ninguno recibe puntos.

Al terminar todas las pruebas, el programa muestra el marcador y anuncia al ganador del concurso.

### Modo rápido

Permite seleccionar una prueba y jugarla directamente, sin tener que completar el concurso entero.

Las pruebas disponibles son:

1. La palabra más larga.
2. Descifra el código.
3. La cifra exacta.
4. La calculadora humana.

## 5. Configuración del programa

El programa incluye un menú de configuración que permite modificar algunos valores.

| Parámetro | Valor por defecto | Valores permitidos |
|---|---|---|
| Repeticiones de las pruebas | 1 | De 1 a 100 |
| Cantidad de letras | 10 | De 8 a 30 |
| Cantidad de operaciones | 5 | De 1 a 100 |

La cantidad mínima de letras es ocho porque se necesitan al menos cuatro vocales y cuatro consonantes.

El programa valida los valores introducidos para evitar opciones fuera de los límites establecidos.

## 6. Archivos del proyecto

| Archivo | Función |
|---|---|
| `Main.java` | Menú principal, modos de juego, configuración y marcador global. |
| `CifrasExactas.java` | Prueba La cifra exacta. |
| `PalabraMasLarga.java` | Prueba La palabra más larga. |
| `CalculadoraHumana.java` | Prueba La calculadora humana. |
| `DescifraCodigo.java` | Prueba original Descifra el código. |
| `README.md` | Descripción, funcionamiento e instrucciones del proyecto. |

## 7. Cómo ejecutar el programa

Para ejecutar el proyecto es necesario tener Java instalado.

### Desde Visual Studio Code

1. Descargar o clonar el repositorio de GitHub.
2. Abrir la carpeta del proyecto en Visual Studio Code.
3. Abrir el terminal.
4. Compilar los archivos Java.
5. Ejecutar el programa principal.
6. Seleccionar una opción del menú.

### Desde el terminal

Primero compilamos los archivos:

```bash
javac *.java
```

Después ejecutamos el programa principal:

```bash
java Main
```

El menú principal permite elegir entre el modo concurso, el modo rápido, la configuración y la opción de salir.

## 8. Reparto del trabajo

El proyecto se ha realizado en pareja utilizando Git y GitHub para compartir los archivos y organizar las modificaciones.

### Teresa Saavedra Pérez

- Estructura principal del programa.
- Menú principal y marcadores.
- Modos concurso y rápido.
- Prueba La cifra exacta.
- Prueba La calculadora humana.

### Abdou Lahate Diouck

- Prueba La palabra más larga.
- Prueba original Descifra el código.
- Menú de configuración y validación de valores.
- Elaboración del archivo README.

### Trabajo conjunto

- Funciones comunes.
- Propuesta y diseño de la prueba original.
- Integración de las pruebas.
- Comprobación y corrección de errores.


## 9. Estado actual del proyecto

Las cuatro pruebas están programadas e integradas en el menú principal.

Se han realizado pruebas de funcionamiento de diferentes partes del programa, incluyendo el modo rápido, la validación de entradas y la compilación de los archivos Java.

También se ha integrado el sistema de puntuación global en el modo concurso.

Queda pendiente completar la comprobación final del funcionamiento conjunto de todas las pruebas.

## 10. Herramientas utilizadas

- **Java:** lenguaje utilizado para desarrollar el programa.
- **Visual Studio Code:** editor para escribir y ejecutar el código.
- **Git:** herramienta para controlar las versiones.
- **GitHub:** plataforma utilizada para compartir el trabajo entre los integrantes.

---

Proyecto realizado por Teresa Saavedra Pérez y Abdou Lahate Diouck.

**1.º DAW - IES Albarregas**