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
}


