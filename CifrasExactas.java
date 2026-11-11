import java.util.Scanner;

public class CifrasExactas {
    static int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

   

    public static void main(String[] args) throws Exception {
        jugarCifraExacta();

        // Pruebas antiguas de las funciones (ya comprobadas)

        // int[] auxiliares = new int[6];
        // for (int i = 0; i < 6; i++) {
        // auxiliares[i] = generarNumeroAleatorio(1, 10);
        // System.out.println("Número auxiliar " + auxiliares[i]);
    //}
    // System.out.println("8 + 3 =" + calcularOperacion(8, 3, 1));
    // System.out.println("8 - 3 =" + calcularOperacion(8, 3, 2));
    // System.out.println("8 * 3 =" + calcularOperacion(8, 3, 3));
    // System.out.println(("8 / 3 =" + calcularOperacion(8, 3, 4)));

    // System.out.println("¿Está el " + auxiliares[0] + "? " +
    // esAuxiliar(auxiliares[0], auxiliares));
    // System.out.println("¿Está el " + auxiliares[5] + "? " +
    // esAuxiliar(auxiliares[5], auxiliares));
    // System.out.println("¿Está el 99? " + esAuxiliar(99, auxiliares));

    // int elegido = pedirAuxiliar(auxiliares);
    // System.out.println("Has elegido el " + elegido);

    // System.out.println("8 / 4 ¿vale? " + esDivisionValida(8, 4));
    // System.out.println("8 / 3 ¿vale? " + esDivisionValida(8, 3));
    // System.out.println("8 / 0 ¿vale? " + esDivisionValida(8, 0));

    }

    static int calcularOperacion(int a, int b, int operacion) {
        switch (operacion) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                return a / b;
            default:
                return 0;

        }
    }

    static boolean esAuxiliar(int numero, int[] auxiliares) {
        for (int i = 0; i < 6; i++) {
            if (auxiliares[i] == numero) {

                return true;
            }
        }
        return false;
    }

    static int pedirAuxiliar(int[] auxiliares) {
        int numero;

        do {
            numero = Main.leerEntero("Elige un número auxiliar: ", 1, 10);
            if (esAuxiliar(numero, auxiliares) == false) {
                System.out.println("Ese número no está entre los auxiliares. Elige otro.");
            }
        } while (esAuxiliar(numero, auxiliares) == false);

        return numero;
    }

    static boolean esDivisionValida(int a, int b) {
        return b != 0 && a % b == 0;
    }

    /**
     * Muestra el número objetivo y los seis números auxiliares
     */
    static void mostrarNumeros(int objetivo, int[] auxiliares) {
        System.out.println("Número objetivo: " + objetivo);
        System.out.print("Números auxiliares: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(auxiliares[i] + " ");
        }
        System.out.println();
    }

    /**
     * Turno de un jugador: hace sus operaciones y devuelve el resultado final
     */
    static int turnoJugador(int jugador, int objetivo, int[] auxiliares) {
        System.out.println();
        System.out.println("--- Turno del jugador " + jugador + " ---");
        mostrarNumeros(objetivo, auxiliares);

        // El primer número sale de los auxiliares
        int resultado = pedirAuxiliar(auxiliares);

        // Cada operación: el resultado anterior con otro auxiliar
        for (int i = 1; i <= Main.cantidadOperaciones; i++) {
            System.out.println("Operación " + i + ". Llevas: " + resultado);
            int segundo = pedirAuxiliar(auxiliares);

            // Pedir la operación; si es una división no exacta, se vuelve a pedir
            int operacion;
            do {
                operacion = Main.leerEntero("1. Sumar  2. Restar  3. Multiplicar  4. Dividir: ", 1, 4);
                if (operacion == 4 && esDivisionValida(resultado, segundo) == false) {
                    System.out.println("Esa división no es exacta. Elige otra operación.");
                }
            } while (operacion == 4 && esDivisionValida(resultado, segundo) == false);

            resultado = calcularOperacion(resultado, segundo, operacion);
            System.out.println("Resultado: " + resultado);
        }
        return resultado;
    }

    /**
     * Juega la prueba completa y devuelve el ganador: 1, 2 o 0 si hay empate
     */
    static int jugarCifraExacta() {
        // Sortear el objetivo y los seis auxiliares
        int objetivo = generarNumeroAleatorio(100, 999);
        int[] auxiliares = new int[6];
        for (int i = 0; i < 6; i++) {
            auxiliares[i] = generarNumeroAleatorio(1, 10);
        }

        // Juega cada jugador con los mismos números
        int resultado1 = turnoJugador(1, objetivo, auxiliares);
        int resultado2 = turnoJugador(2, objetivo, auxiliares);

        // Distancia de cada uno al objetivo (Math.abs quita el signo menos)
        int diferencia1 = Math.abs(objetivo - resultado1);
        int diferencia2 = Math.abs(objetivo - resultado2);

        System.out.println();
        System.out.println("Objetivo: " + objetivo);
        System.out.println("Jugador 1: " + resultado1 + " (diferencia " + diferencia1 + ")");
        System.out.println("Jugador 2: " + resultado2 + " (diferencia " + diferencia2 + ")");

        // Gana quien se queda más cerca
        if (diferencia1 < diferencia2) {
            System.out.println("¡Gana el jugador 1!");
            return 1;
        } else if (diferencia2 < diferencia1) {
            System.out.println("¡Gana el jugador 2!");
            return 2;
        } else {
            System.out.println("¡Empate!");
            return 0;
        }
    }
}
