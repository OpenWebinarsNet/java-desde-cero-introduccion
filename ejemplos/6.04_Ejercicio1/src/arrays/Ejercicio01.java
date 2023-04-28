package arrays;

public class Ejercicio01 {

	public static void main(String[] args) {

		// En otra versión podríamos leer los elementos 
		// desde el teclado.
		int[] miArray = {5, 10, 2, 8, 3};
	
		// Tomamos como máximo el elemento en primera posición
        int max = miArray[0];

        // Recorremos el array desde la segunda posición
        for (int i = 1; i < miArray.length; i++) {
        	// Si el elemento actual es mayor
        	// nos quedamos con él como nuevo máximo
            if (miArray[i] > max) {
                max = miArray[i];
            }
        }

        System.out.println("El mayor elemento del array es: " + max);

	}

}
