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
                    System.out.println("Modo concurso: en construcción.");
                    break;
                case 2:
                    System.out.println("Modo rápido: en construcción.");
                    break;
                case 3:
                    System.out.println("Configuración: en construcción.");
                    break;
                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;
            }
        } while (opcion != 0);
    }

    // ===== FUNCIONES DE INTERFAZ =====

    // Muestra el menú principal por pantalla
    static void mostrarMenuPrincipal() {
        System.out.println();
        System.out.println("===== CIFRAS Y LETRAS =====");
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
}
    

