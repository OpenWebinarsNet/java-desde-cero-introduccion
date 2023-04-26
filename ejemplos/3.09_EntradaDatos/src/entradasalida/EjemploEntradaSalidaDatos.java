package entradasalida;

import java.util.Scanner;

public class EjemploEntradaSalidaDatos {

	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
		
		// Ejemplo de entrada de datos simple
		
		System.out.print("Introduce un número: ");
		int numero = sc.nextInt();
		
		System.out.print("El número es: ");
		System.out.println(numero);
		
		// Solicitud de datos para un cálculo
		// Area de un rectángulo = base * altura
		
		System.out.print("Introduce la base del rectángulo: ");
		double base = sc.nextDouble();
		
		System.out.print("Introduce la altura del rectángulo: ");
		double altura = sc.nextDouble();
		
		System.out.print("El area del rectángulo es: ");
		System.out.println(base * altura);

		
		sc.close();

	}

}
