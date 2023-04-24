package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
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
