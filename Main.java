import java.util.Scanner;
 
/**
 * Cifras y Letras - Proyecto de Programación 1.º DAW
 * Autores: Teresa Saavedra Pérez y Abdou Lahate Diouck
 */
public class Main {
 
    // ===== VARIABLES GLOBALES =====
 
    // Lector de teclado compartido por todo el programa
    static Scanner teclado = new Scanner(System.in);
 
    // Marcador global del concurso
    static int puntosGlobalesJugador1 = 0;
    static int puntosGlobalesJugador2 = 0;
 
    // Marcador de la prueba que se está jugando
    static int puntosPruebaJugador1 = 0;
    static int puntosPruebaJugador2 = 0;
 
    // Configuración por defecto
    static int repeticionesPruebas = 1;
    static int cantidadLetras = 10;
    static int cantidadOperaciones = 5;
 
    // ===== PROGRAMA PRINCIPAL =====
 
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenuPrincipal();
            opcion = leerEntero("Elige una opción: ", 0, 3);
            switch (opcion) {
                case 1:
                    jugarConcurso();
                    break;
                case 2:
                    jugarModoRapido();
                    break;
                case 3:
                    mostrarMenuConfiguracion();
                    break;
                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;
            }
        } while (opcion != 0);
    }
 
    // ===== MODOS DE JUEGO =====
 
    // Modo rápido: el jugador elige una sola prueba y se juega solo esa
    static void jugarModoRapido() {
        System.out.println("=== MODO RÁPIDO ===");
        System.out.println("1. La palabra más larga");
        System.out.println("2. Descifra el código");
        System.out.println("3. La cifra exacta");
        System.out.println("4. La calculadora humana");
 
        int prueba = leerEntero("Elige una prueba: ", 1, 4);
        teclado.nextLine(); // limpia el Intro que queda después del número
 
        switch (prueba) {
            case 1:
                PalabraMasLarga.jugar(cantidadLetras, teclado);
                break;
            case 2:
                DescifraCodigo.jugar(teclado);
                break;
            case 3:
                CifrasExactas.jugarCifraExacta();
                break;
            case 4:
                CalculadoraHumana.jugarCalculadoraHumana();
                break;
        }
    }
 
    // Modo concurso: se juegan las pruebas seguidas y el ganador de cada una
    // suma 1 punto en el marcador global
    static void jugarConcurso() {
   
    puntosGlobalesJugador1 = 0;
    puntosGlobalesJugador2 = 0;
 
        for (int ronda = 1; ronda <= repeticionesPruebas; ronda++) {
            System.out.println();
            System.out.println("===== RONDA " + ronda + " =====");
 
            sumarPuntoGlobal(CifrasExactas.jugarCifraExacta());
 
            teclado.nextLine(); // limpia el Intro antes de leer palabras
            sumarPuntoGlobal(PalabraMasLarga.jugar(cantidadLetras, teclado));
 
            sumarPuntoGlobal(CalculadoraHumana.jugarCalculadoraHumana());
            teclado.nextLine();
            sumarPuntoGlobal(DescifraCodigo.jugar(teclado));
        }
 
        System.out.println();
        System.out.println("===== RESULTADO DEL CONCURSO =====");
        mostrarMarcadorGlobal();
        if (puntosGlobalesJugador1 > puntosGlobalesJugador2) {
            System.out.println("¡El jugador 1 gana el concurso!");
        } else if (puntosGlobalesJugador2 > puntosGlobalesJugador1) {
            System.out.println("¡El jugador 2 gana el concurso!");
        } else {
            System.out.println("¡El concurso termina en empate!");
        }
    }
 
    // Suma 1 punto al ganador de una prueba (0 = empate, nadie suma)
    static void sumarPuntoGlobal(int ganador) {
        if (ganador == 1) {
            puntosGlobalesJugador1++;
        } else if (ganador == 2) {
            puntosGlobalesJugador2++;
        }
        mostrarMarcadorGlobal();
    }
 
    // Muestra el marcador global
    static void mostrarMarcadorGlobal() {
        System.out.println("Marcador global -> Jugador 1: " + puntosGlobalesJugador1
                + " | Jugador 2: " + puntosGlobalesJugador2);
    }
 
    //  FUNCIONES DE INTERFAZ 
 
    // Muestra el menú principal por pantalla
    static void mostrarMenuPrincipal() {
        System.out.println();
        System.out.println(" CIFRAS Y LETRAS ");
        System.out.println("1. Modo concurso");
        System.out.println("2. Modo rápido");
        System.out.println("3. Configuración");
        System.out.println("0. Salir");
    }
 
    // Pide un número entero entre min y max.
    // Si el usuario escribe letras o un número fuera de rango, lo vuelve a pedir.
    static int leerEntero(String mensaje, int min, int max) {
        int numero;
        do {
            System.out.print(mensaje);
            while (!teclado.hasNextInt()) {
                System.out.println("Eso no es un número. Inténtalo de nuevo.");
                teclado.next();
                System.out.print(mensaje);
            }
            numero = teclado.nextInt();
            if (numero < min || numero > max) {
                System.out.println("El número debe estar entre " + min + " y " + max + ".");
            }
        } while (numero < min || numero > max);
        return numero;
    }
 
    
    // MENÚ DE CONFIGURACIÓN 
 
     static void mostrarMenuConfiguracion() {
 
    int opcion;
 
    do {
        System.out.println();
        System.out.println("===== CONFIGURACIÓN =====");
        System.out.println("1. Modificar repeticiones de las pruebas");
        System.out.println("2. Modificar cantidad de letras");
        System.out.println("3. Modificar cantidad de operaciones");
        System.out.println("0. Volver al menú principal");
 
        opcion = leerEntero("Elige una opción: ", 0, 3);
 
        switch (opcion) {
 
            case 1:
                repeticionesPruebas = leerEntero(
                    "Introduce las repeticiones: ", 1, 100);
                break;
 
            case 2:
                cantidadLetras = leerEntero(
                    "Introduce la cantidad de letras: ", 8, 30);
                break;
 
            case 3:
                cantidadOperaciones = leerEntero(
                    "Introduce la cantidad de operaciones: ", 1, 100);
                break;
 
            case 0:
                System.out.println("Volviendo al menú principal...");
                break;
        }
 
    } while (opcion != 0);
     }
    }
 

