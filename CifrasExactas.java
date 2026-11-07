import java.util.Scanner;

public class CifrasExactas {
    static int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static void main(String[] args) throws Exception {

        for(int i = 0; i < 10; i++) {
        System.out.println("Mostar número   " + generarNumeroAleatorio(100, 999));
        }
    }
}
