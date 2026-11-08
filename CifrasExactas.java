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
            System.out.println("8 + 3 =" + calcularOperacion(8,3,1));
            System.out.println("8 - 3 =" + calcularOperacion(8, 3, 2));
            System.out.println("8 * 3 =" + calcularOperacion(8, 3, 3));
            System.out.println(("8 / 3 =" + calcularOperacion(8, 3, 4)));
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
                return  a / b;
            default: 
                return 0;
               
        }
    }

}
