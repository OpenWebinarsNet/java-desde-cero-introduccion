package variables.operadores;

import java.util.Scanner;

/* 
Realiza un programa en Java que calcule la nota media de un 
alumno en la asignatura de Programación. 
La nota media se calcula como el promedio de las 3 notas 
trimestrales. Muestra la nota promedio redondeada y además, 
muestra un mensaje que indique si el alumno está APROBADO 
(nota final >= 5) o suspenso (nota final < 5).

*/
public class Ejercicio02 {

	public static void main(String[] args) {

		var sc = new Scanner(System.in); // Los decimales con ,
		//var sc = new Scanner(System.in).useLocale(Locale.US); // Los decimales con .

		System.out.print("Introduce la nota del primer trimestre: ");
		double nota1 = sc.nextDouble();

		System.out.print("Introduce la nota del segundo trimestre: ");
		double nota2 = sc.nextDouble();

		System.out.print("Introduce la nota del tercer trimestre: ");
		double nota3 = sc.nextDouble();

		double notaMedia = (nota1 + nota2 + nota3) / 3;
		double notaRedondeada = Math.round(notaMedia);
		System.out.println("La nota media del alumno sin redondear es: " + notaMedia);
		System.out.println("La nota media del alumno es: " + notaRedondeada);

		String estado = (notaRedondeada >= 5) ? "APROBADO" : "SUSPENSO";
		System.out.println("El alumno está " + estado);
		
		sc.close();

	}

}
