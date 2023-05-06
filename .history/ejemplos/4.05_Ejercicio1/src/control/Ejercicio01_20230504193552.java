package control;

import java.util.Scanner;

/*
Implementa un programa en Java que dada una fecha, 
nos indique cuál es la estación del año (en el hemisferio 
que tú quieras, aunque la solución se dará del hemisferio norte).
El día del mes, y el mes del año se deben introducir como 
números enteros a través del teclado.
 */

public class Ejercicio01 {

	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
        System.out.print("Introduce el día (1-31): ");
        int dia = scanner.nextInt();
        System.out.print("Introduce el mes (1-12): ");
        int mes = scanner.nextInt();

        String estacion = "";

        if (mes == 1 || mes == 2 || (mes == 3 && dia <= 20) || (mes == 12 && dia >= 21)) {
            estacion = "invierno";
        } else if (mes == 4 || mes == 5 || (mes == 3 && dia >= 20) || (mes == 6 && dia < 21)) {
            estacion = "primavera";
        } else if (mes == 7 || mes == 8 || (mes == 6 && dia >= 21) || (mes == 9 && dia < 21)) {
            estacion = "verano";
        } else if (mes == 10 || mes == 11 || (mes == 9 && dia >= 21) || (mes == 12 && dia < 21)) {
            estacion = "otoño";
        }

        System.out.println("La estación del año correspondiente a la fecha introducida es: " + estacion);
        scanner.close();
	}

}
