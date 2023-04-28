package arrays;

public class EjemploArrays2D {

	public static void main(String[] args) {

		// Ejemplo de array de 3 filas y 2 columnas 
		int[][] array2d = new int[3][2];
		
		// Inicialización estática
		int[][] array2d2 = {{1,2},{3,4},{5,6}};
		
		// Bucles anidados
		for(int i = 0; i < array2d2.length; i++) {
			for(int j = 0; j < array2d2[0].length; j++) {
				System.out.print(array2d2[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println(" ");
		
		// Si renombramos las variables de control
		// queda más legible
		for(int row = 0; row < array2d2.length; row++) {
			for(int col = 0; col < array2d2[0].length; col++) {
				System.out.print(array2d2[row][col] + " ");
			}
			System.out.println("");	
		}
		
		
		
	}

}
