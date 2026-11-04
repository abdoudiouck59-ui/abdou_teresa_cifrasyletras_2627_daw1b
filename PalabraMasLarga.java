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
public static void main(String[] args) {

    String letras = generarLetras(10);

    System.out.println("Letras disponibles: " + letras);

    System.out.println(sePuedeFormar("CASA", "CASA"));
   }
}


