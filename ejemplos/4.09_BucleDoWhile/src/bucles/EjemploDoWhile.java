package bucles;

import java.util.Scanner;

public class EjemploDoWhile {

	public static void main(String[] args) {

		var sc = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Introduce un número entre 1 y 10: ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 10);

        System.out.println("El número introducido es: " + numero);
        sc.close();
		
	}

}
