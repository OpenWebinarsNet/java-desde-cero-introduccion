package bucles;

import java.util.Scanner;

public class EjemploPrimoWhile {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int numero = sc.nextInt();
        boolean esPrimo = true;
        int divisor = 2;
        
        if (numero < 2)
        	esPrimo = false;

        while (divisor <= numero / 2 && esPrimo) {
            if (numero % divisor == 0) {
                esPrimo = false;
            }
            divisor++;
        }

        if (esPrimo) {
            System.out.println(numero + " es un número primo");
        } else {
            System.out.println(numero + " no es un número primo");
        }
        sc.close();
		
	}

}
