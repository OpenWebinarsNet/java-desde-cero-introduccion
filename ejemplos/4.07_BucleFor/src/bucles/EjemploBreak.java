package bucles;

import java.util.Scanner;

public class EjemploBreak {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.print("Introduce un número entero positivo: ");
		int numero = scanner.nextInt();
		boolean esPrimo = true;

		// El número 1 no es primo, ya que tiene un único divisor
		if (numero < 2) {
			esPrimo = false;
		}

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				esPrimo = false;
				break;
			}
		}

		if (esPrimo) {
			System.out.println(numero + " es un número primo.");
		} else {
			System.out.println(numero + " no es un número primo.");
		}
		scanner.close();
	}

}
