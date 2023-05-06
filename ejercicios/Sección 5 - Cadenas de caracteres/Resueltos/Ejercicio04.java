import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);

        System.out.println("Introduzca una cadena de caracteres");
        String str = sc.nextLine();

        String minusculas = str.toLowerCase();

        int cantidadVocales = 0;

        for(int i=0; i < minusculas.length(); i++) {
            char c = minusculas.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cantidadVocales++;
            }
        }

        System.out.println("La cantidad de vocales es: " + cantidadVocales);

        sc.close();
    }
}
