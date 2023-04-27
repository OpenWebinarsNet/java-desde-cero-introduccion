package cadenas;

import java.util.Scanner;

/*

Un palíndromo es una cadena de caracteres que se lee igual
desde izquierda a derecha que de derecha a izquierda. Pueden
ser simplemente palabras como:

- Ana
- Salas
- Rajar
- ...

O también frases completas:

- Dábale arroz a la zorra el abad
- A luna ese anula
- Allí ves a Sevilla

Hay que tener en cuenta que se desprecian espacios en blanco
o vocales acentuadas.

Implementa un detector de palíndromos en Java
 */
public class Ejercicio01 {

	public static void main(String[] args) {
	
		var sc = new Scanner(System.in);
		
		// Leemos por teclado la palabra o frase
		System.out.println("Introduzca la palabra o frase");
		String entrada = sc.nextLine();
		
		// Pasamos a minúsculas
		String minus = entrada.toLowerCase();
		
		// Limpiamos la cadena 
		
		// Primero de espacios en blanco
		String limpia1 = minus.trim();
		String limpia = "";
		
		// Después, de espacios a mitad de la cadena
		// o de vocales acentuadas
		for(int i = 0; i < limpia1.length(); i++) {
			String sub = limpia1.substring(i, i+1);
			if (!sub.isBlank()) {
				sub = switch(sub) {
					case "á" -> "a";
					case "é" -> "e";
					case "í" -> "i";
					case "ó" -> "o";
					case "ú" -> "u";
					default -> sub;
				};
				limpia += sub;
			}
			 
		}
		
		// En limpia tenemos ya la cadena sin espacios
		// ni vocales acentuadas
		
		// Obtenemos la cadena inversa
		String inversa = "";
		for(int i = limpia.length()-1; i >= 0; i--) {
			inversa += limpia.charAt(i);
		}
		
		// Comprobamos si son iguales.
		if (limpia.equals(inversa)) 
			System.out.println("Es un palíndromo");
		else
			System.out.println("No es un palíndromo");
		
	
		sc.close();

	}

}
