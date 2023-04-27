package bucles;

import java.util.Scanner;

/*
Ejercicio 3:
Escribe un programa en Java que acepte por teclado un 
número entero y nos diga la cantidad de dígitos que tiene.
 */
public class Ejercicio03 {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int numero = scanner.nextInt();

		int cantidadDigitos = 0;

		while (numero != 0) {
			numero /= 10;
			cantidadDigitos++;
		}

		System.out.println("El número introducido tiene " + cantidadDigitos + " dígitos.");
		scanner.close();
	}

}
