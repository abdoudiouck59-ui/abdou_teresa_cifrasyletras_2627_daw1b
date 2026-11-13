
import java.util.Random;
import java.util.Scanner;

public class DescifraCodigo {

    public static int jugar(Scanner teclado) {
        Random random = new Random();

        String codigo = "" + (random.nextInt(9) + 1);
while (codigo.length() < 3) {
            String cifra = "" + random.nextInt(10);
            if (!codigo.contains(cifra)) {
                codigo += cifra;
            }
        }

        System.out.println("=== DESCIFRA EL CODIGO ===");
        System.out.println("Adivina el codigo de 3 cifras diferentes.");
        System.out.println("Cada jugador tiene 7 intentos.");

        int intentos1 = turno(teclado, codigo, 1);
        int intentos2 = turno(teclado, codigo, 2);

        System.out.println("\n=== RESULTADO FINAL ===");

        if (intentos1 == 0 && intentos2 == 0) {
            System.out.println("Ninguno ha descubierto el codigo.");
        } else if (intentos1 == 0) {
            System.out.println("Gana el jugador 2.");
        } else if (intentos2 == 0) {
            System.out.println("Gana el jugador 1.");
        } else if (intentos1 < intentos2) {
            System.out.println("Gana el jugador 1.");
        } else if (intentos2 < intentos1) {
            System.out.println("Gana el jugador 2.");
        } else {
            System.out.println("Empate.");
        }
         int ganador = 0;

           if (intentos1 == 0 && intentos2 > 0) {
           ganador = 2;
}          else if (intentos2 == 0 && intentos1 > 0) {
           ganador = 1;
}          else if (intentos1 > 0 && intentos2 > 0) {
           if (intentos1 < intentos2) {
           ganador = 1;
    }      else if (intentos2 < intentos1) {
           ganador = 2;
    }
}

return ganador;

    }

    public static int turno(Scanner teclado, String codigo, int jugador) {
        System.out.println("\n--- JUGADOR " + jugador + " ---");

        for (int intento = 1; intento <= 7; intento++) {
           System.out.print("Intento " + intento + ": ");

if (!teclado.hasNextLine()) {
    System.out.println("\nNo hay más datos de entrada.");
    return 0;
}

String respuesta = teclado.nextLine().trim();

            if (!respuesta.matches("[0-9]{3}")
                    || respuesta.charAt(0) == '0'
                    || respuesta.charAt(0) == respuesta.charAt(1)
                    || respuesta.charAt(0) == respuesta.charAt(2)
                    || respuesta.charAt(1) == respuesta.charAt(2)) {
                System.out.println("Introduce 3 cifras diferentes.");
                intento--;
                continue;
            }

            if (respuesta.equals(codigo)) {
                System.out.println("Correcto! Has descubierto el codigo.");
                return intento;
            }

            int correctas = 0;
            int posicionCorrecta = 0;

            for (int i = 0; i < 3; i++) {
                if (codigo.contains("" + respuesta.charAt(i))) {
                    correctas++;
                }
                if (codigo.charAt(i) == respuesta.charAt(i)) {
                    posicionCorrecta++;
                }
            }

            System.out.println("Cifras correctas: " + correctas);
            System.out.println("Posiciones correctas: " + posicionCorrecta);
        }

        System.out.println("No has descubierto el codigo.");
        return 0;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        jugar(teclado);
    }
}
