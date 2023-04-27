package bucles;

public class EjemploBucleFor {

	public static void main(String[] args) {
		
		// Imprimir los 5 primeros números enteros,
		// comenzando en el 1.
		System.out.println("Números del 1 al 5");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("");
		
		// Si intentamos acceder a la variable i
		// tenemos error
		//i = 7;
		
		// Si el cuerpo del bucle incluye una única 
		// sentencia, podemos ahorrarnos las llaves.
		System.out.println("Números del 1 al 5");
		for(int i = 1; i <= 5; i++)
			System.out.println(i);
		System.out.println("");

		
		// Cuenta atrás desde 10 hasta 0
		System.out.println("Cuenta atrás desde 10 hasta 0");
		for(int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println("");
		
		// Imprimir los números pares entre 0
		// y 100.
		System.out.println("Números pares entre 0 y 100");
		for(int i = 0; i <= 100; i+=2)
			System.out.println(i);
		System.out.println("");
		
		
		// Sumatorio de los 100 primeros números
		System.out.println("Sumatorio de los 100 primeros números enteros");
		// La variable acumuladora se declara fuera del bucle
		// Se inicializa a 0, que es la identidad para la suma
		int resultado = 0;
		for(int i = 1; i <= 100; i++) {
			resultado += i;
		}
		System.out.println("El resultado es " + resultado);
		
		
		// Bucle infinito
		for(int i = 1; i > 0; i++) 
			System.out.println(i);
		
		// Break no saca del bucle.
		
		
	}

}
