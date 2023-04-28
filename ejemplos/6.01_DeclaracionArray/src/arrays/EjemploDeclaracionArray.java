package arrays;

public class EjemploDeclaracionArray {

	public static void main(String[] args) {
		
		/*
			Declaración de varios arrays
		*/
		
		// Indicando el tipo de dato
		int[] arr1 = new int[10];
		
		// Con inferencia de tipo;
		var arr2 = new double[5];

		/*
			Declaración e inicialización de varios array
		 */
		
		// Indicando el tipo de dato

		String[] arr3 = new String[] {"Hola", "Mundo"};
		
		// De forma abreviada
		String[] arr4 = {"Hola", "Mundo"};

		// Usando var
		var arr5 = new int[]{1, 2, 3, 4, 5};
		
		
		/*
		 	Operador []
		 */
		arr1[0] = 1234;
		
		System.out.println(arr1[0]);
		
		/*
			Declaración e inicialización por separado.
		 */
		String[] arr6 = new String[5];
		arr6[0] = "Hola";
		arr6[1] = "Mundo";
		arr6[2] = "en";
		arr6[3] = "Java";
		arr6[4] = "!";

		

	}

}
