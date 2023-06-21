package palindromo;

import java.text.Normalizer;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra o frase:");
        String palabra = scanner.nextLine().toLowerCase();
        palabra = normalizarTexto(palabra);
        palabra = palabra.replaceAll("\\s+","");
        boolean esPalindromo = true;
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
                esPalindromo = false;
                break;
            }
        }
        if (esPalindromo) {
            System.out.println("La palabra/frase es un palíndromo");
        } else {
            System.out.println("La palabra/frase no es un palíndromo");
        }
    }

    public static String normalizarTexto(String texto) {
        String textoNormalizado = Normalizer.normalize(texto, Normalizer.Form.NFD);
        textoNormalizado = textoNormalizado.replaceAll("[áéíóú]", "a");
        return textoNormalizado;
    }
}
//import java.util.Scanner;
//
//public class Palindromo {
//    
//    public static boolean esPalindromo(String cadena) {
//    // Convertir la cadena a minúsculas y quitar acentos y espacios
//    cadena = cadena.toLowerCase().replaceAll("[áéíóú]", "a").replaceAll("\\s", "");
//
//    // Comparar la cadena con su inversa
//    return cadena.equals(new StringBuilder(cadena).reverse().toString());
//}
//    public static void main(String[] args) {
//           Scanner scanner = new Scanner(System.in);
//    System.out.println("Ingresa una palabra o frase para verificar si es un palíndromo:");
//    String cadena = scanner.nextLine();
//
//    if (esPalindromo(cadena)) {
//        System.out.println("La cadena \"" + cadena + "\" es un palíndromo.");
//    } else {
//        System.out.println("La cadena \"" + cadena + "\" no es un palíndromo.");
//    }
//    }
//}