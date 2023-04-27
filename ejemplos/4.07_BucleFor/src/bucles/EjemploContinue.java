package bucles;

public class EjemploContinue {

	public static void main(String[] args) {
		int suma = 0;
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				continue;
			}
			suma += i;
		}
		System.out.println("La suma de los números del 1 al 10, excepto el 7, es: " + suma);

	}

}
