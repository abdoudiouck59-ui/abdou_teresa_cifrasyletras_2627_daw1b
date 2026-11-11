public class PalabraMasLarga {
    
    // Generar las letras aleatorias
    public static String generarLetras(int cantidad) {

        String vocales = "AEIOU";
        String consonantes = "BCDFGHJKLMNÑPQRSTVWXYZ";
        String todas = vocales + consonantes;

        if (cantidad < 8) {
            return "";
        }

        String letras = "";

        // Generar 4 vocales
        for (int i = 0; i < 4; i++) {
            int posicion = (int)(Math.random() * vocales.length());
            letras = letras + vocales.charAt(posicion);
        }

        // Generar 4 consonantes
        for (int i = 0; i < 4; i++) {
            int posicion = (int)(Math.random() * consonantes.length());
            letras = letras + consonantes.charAt(posicion);
        }

        // Generar las letras restantes
        for (int i = 8; i < cantidad; i++) {
            int posicion = (int)(Math.random() * todas.length());
            letras = letras + todas.charAt(posicion);
        }

        // Mezclar las letras
        char[] mezcla = letras.toCharArray();

        for (int i = 0; i < mezcla.length; i++) {
            int posicion = (int)(Math.random() * mezcla.length);

            char temporal = mezcla[i];
            mezcla[i] = mezcla[posicion];
            mezcla[posicion] = temporal;
        }

        return new String(mezcla);
    }

 
// Comprobar si se puede formar una palabra con las letras
    public static boolean sePuedeFormar(String letras, String palabra) {

        letras = letras.toUpperCase();
        palabra = palabra.toUpperCase();

        for (int i = 0; i < palabra.length(); i++) {

            char letra = palabra.charAt(i);
            int posicion = letras.indexOf(letra);

            if (posicion == -1) {
                return false;
            }

            letras = letras.substring(0, posicion)
                    + letras.substring(posicion + 1);
        }

        return true;
    }
    
public static int jugar(int cantidad, java.util.Scanner teclado) {

        if (cantidad < 8) {
        System.out.println("Error: se necesitan al menos 8 letras.");
        return 0;
    }
    String letras = generarLetras(cantidad);

    System.out.println();
    System.out.println("===== LA PALABRA MÁS LARGA =====");
    System.out.println("Letras disponibles: " + letras);

    // Turno del jugador 1
    System.out.println();
    System.out.println("Turno del jugador 1:");
    System.out.print("Introduce tu palabra: ");
    String palabra1 = teclado.nextLine().trim();

    boolean valida1 = false;

    if (palabra1.length() > 0 && sePuedeFormar(letras, palabra1)) {
        String respuesta;

do {
    System.out.println("¿El jugador contrario acepta la palabra? (S/N)");
   respuesta = teclado.nextLine().trim();

    if (!respuesta.equalsIgnoreCase("S")
            && !respuesta.equalsIgnoreCase("N")) {
        System.out.println("Respuesta incorrecta. Escribe S o N.");
    }

} while (!respuesta.equalsIgnoreCase("S")
        && !respuesta.equalsIgnoreCase("N"));

if (respuesta.equalsIgnoreCase("S")) {
    valida1 = true;
}
    } else {
        System.out.println("La palabra no se puede formar con las letras.");
    }

    // Turno del jugador 2
    System.out.println();
    System.out.println("Turno del jugador 2:");
    System.out.print("Introduce tu palabra: ");
    String palabra2 = teclado.nextLine().trim();

    boolean valida2 = false;

   if (palabra2.length() > 0 && sePuedeFormar(letras, palabra2)) {

    String respuesta;

    do {
        System.out.println("¿El jugador contrario acepta la palabra? (S/N)");
        respuesta = teclado.nextLine().trim();

        if (!respuesta.equalsIgnoreCase("S")
                && !respuesta.equalsIgnoreCase("N")) {
            System.out.println("Respuesta incorrecta. Escribe S o N.");
        }

    } while (!respuesta.equalsIgnoreCase("S")
            && !respuesta.equalsIgnoreCase("N"));

    if (respuesta.equalsIgnoreCase("S")) {
        valida2 = true;
    }

} else {
    System.out.println("La palabra no se puede formar con las letras.");
}

    // Comparar resultados
   
    // Comparar resultados
    System.out.println();
    System.out.println("===== RESULTADOS =====");

    if (valida1 && !valida2) {
        System.out.println("¡Gana el jugador 1!");
        return 1;
    } else if (!valida1 && valida2) {
        System.out.println("¡Gana el jugador 2!");
        return 2;
    } else if (!valida1 && !valida2) {
        System.out.println("Ningún jugador ha conseguido una palabra válida.");
        return 0;
    } else if (palabra1.length() > palabra2.length()) {
        System.out.println("¡Gana el jugador 1!");
        return 1;
    } else if (palabra2.length() > palabra1.length()) {
        System.out.println("¡Gana el jugador 2!");
        return 2;
    } else {
        System.out.println("¡Empate!");
        return 0;
    }
}

public static void main(String[] args) {

    java.util.Scanner teclado = new java.util.Scanner(System.in);

    jugar(12, teclado);
}
}
