public class CalculadoraHumana {

        public static void main(String[] args) throws Exception {
        jugarCalculadoraHumana();
    }
    
    /**
     * Genera el valor con el que se opera según la operación:
     * suma y resta, dos cifras; multiplicación y división, una cifra.
     * En la división, el valor se sortea hasta que sea exacta.
     */
    static int generarValor(int numero, int operacion) {
        int valor;
        if (operacion == 1 || operacion == 2) {
            valor = CifrasExactas.generarNumeroAleatorio(10, 99);
        } else if (operacion == 3) {
            valor = CifrasExactas.generarNumeroAleatorio(1, 9);
        } else {
            do {
                valor = CifrasExactas.generarNumeroAleatorio(1, 9);
            } while (CifrasExactas.esDivisionValida(numero, valor) == false);
        }
        return valor;
    }

    /**
     * Devuelve el signo de la operación para mostrarlo en pantalla
     */
    static String simboloOperacion(int operacion) {
        switch (operacion) {
            case 1:
                return "+";
            case 2:
                return "-";
            case 3:
                return "x";
            default:
                return ":";
        }
    }

    /**
     * Calcula el tiempo final: segundos tardados más 20 segundos por cada fallo
     */
    static double calcularTiempoFinal(double segundos, int fallos) {
        return segundos + fallos * 20;
    }

    /**
     * Turno de un jugador: resuelve las operaciones y devuelve su tiempo final en segundos
     */
    static double turnoJugador(int jugador) {
        System.out.println();
        System.out.println("--- Turno del jugador " + jugador + " ---");

        int numero = CifrasExactas.generarNumeroAleatorio(1, 100);
        int fallos = 0;

        // Miro el reloj al empezar
        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= Main.cantidadOperaciones; i++) {
            int operacion = CifrasExactas.generarNumeroAleatorio(1, 4);
            int valor = generarValor(numero, operacion);
            int correcto = CifrasExactas.calcularOperacion(numero, valor, operacion);

            System.out.println("Operación " + i + ": " + numero + " " + simboloOperacion(operacion) + " " + valor + " = ?");
            int respuesta = Main.leerEntero("Tu respuesta: ", -100000, 100000);

            if (respuesta == correcto) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto. El resultado era " + correcto + ".");
                fallos++;
            }

            // El resultado correcto es el número de la siguiente operación
            numero = correcto;
        }

        // Miro el reloj al terminar
        long fin = System.currentTimeMillis();
        double segundos = (fin - inicio) / 1000.0;
        double tiempoFinal = calcularTiempoFinal(segundos, fallos);

        System.out.println("Tiempo: " + segundos + " s. Fallos: " + fallos + ". Tiempo final: " + tiempoFinal + " s.");
        return tiempoFinal;
    }

    /**
     * Juega la prueba completa y devuelve el ganador: 1, 2 o 0 si hay empate
     */
    static int jugarCalculadoraHumana() {
        double tiempo1 = turnoJugador(1);
        double tiempo2 = turnoJugador(2);

        System.out.println();
        System.out.println("Jugador 1: " + tiempo1 + " s");
        System.out.println("Jugador 2: " + tiempo2 + " s");

        // Gana quien tarda menos
        if (tiempo1 < tiempo2) {
            System.out.println("¡Gana el jugador 1!");
            return 1;
        } else if (tiempo2 < tiempo1) {
            System.out.println("¡Gana el jugador 2!");
            return 2;
        } else {
            System.out.println("¡Empate!");
            return 0;
        }
    }


}
