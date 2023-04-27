package bucles;

import java.util.Scanner;

/*
Ejercicio 4:

Calcula cuál es el resultado de sumar los `n` primeros 
números positivos. Introduce el valor de `n` a través del 
teclado.

 */
public class Ejercicio04 {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.print("Introduce el valor de n: ");
		int n = scanner.nextInt();

		int suma = 0;

		for (int i = 1; i <= n; i++) {
			suma += i;
		}

		System.out.println("La suma de los " + n + " primeros números positivos es " + suma);
		scanner.close();

	}

}
