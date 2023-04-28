package arrays;

public class EjemploManipulacionArrays {

	public static void main(String[] args) {
		
		// Propiedad .length
		
		var arr1 = new int[7];
		
		System.out.println(arr1.length);
		
		// Bucles y arrays
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = i;
		}
		
		for(int elem : arr1) {
			System.out.println(elem);
		}
		
		// También se puede usar var
		for(var elem : arr1) 
			System.out.println(elem);
		
		
		// Clonación de un array
		var arr2 = arr1.clone();
		
		for(var elem : arr2)
			System.out.println(elem);
		
	}

}
