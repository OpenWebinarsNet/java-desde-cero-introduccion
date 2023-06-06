package arrays;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Inicializamos el array
		int[] miArray = { 1, 2, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8, 9 };
		
		// Lo clonamos para tener el original sin cambios y mostrarlo al final
		int[] original = miArray.clone();


		// Almacenamos la longitud original del array
		int length = miArray.length;
		
		// Recorremos el array desde dos posiciones
		// para comprobar si hay repetidos
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				// Si son iguales, es que hay repetidos
				if (miArray[i] == miArray[j]) {
					// Pasamos el último elemento del array
					// a la posición del repetido
					miArray[j] = miArray[length - 1];
					// Decrementamos ya que al eliminar
					// el repetido, tenemos el último 
					// valor en la posición j
					length--;
					j--;
				}
			}
		}

		int[] resultado = Arrays.copyOf(miArray, length);

		System.out.println("Array original");
		for(var elem : original)
			System.out.print(elem + ", ");
		
		System.out.println();
		System.out.println("Array resultado");
		for(var elem : resultado)
			System.out.print(elem + ", ");
		
		
	}

}
