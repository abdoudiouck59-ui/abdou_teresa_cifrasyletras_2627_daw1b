import java.util.Scanner;

public class CifrasExactas {
    static int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
            
    public static void main(String[] args) throws Exception {

        int[] auxiliares = new int[6];
        for (int i = 0; i < 6; i++) {
            auxiliares[i] = generarNumeroAleatorio(1, 10);
            System.out.println("Número auxiliar    " + auxiliares[i]);
        }
        System.out.println("8 + 3 =" + calcularOperacion(8, 3, 1));
        System.out.println("8 - 3 =" + calcularOperacion(8, 3, 2));
        System.out.println("8 * 3 =" + calcularOperacion(8, 3, 3));
        System.out.println(("8 / 3 =" + calcularOperacion(8, 3, 4)));

        System.out.println("¿Está el " + auxiliares[0] + "? " + esAuxiliar(auxiliares[0], auxiliares));
        System.out.println("¿Está el " + auxiliares[5] + "? " + esAuxiliar(auxiliares[5], auxiliares));
        System.out.println("¿Está el 99? " + esAuxiliar(99, auxiliares));

        int elegido = pedirAuxiliar(auxiliares);
        System.out.println("Has elegido el " + elegido);


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
}
