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

    }
}
