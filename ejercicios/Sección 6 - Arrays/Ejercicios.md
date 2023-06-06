
# Ejercicios sobre arrays

## Ejercicios resueltos en vídeo

1. Implementar un programa en Java que nos muestre el mayor elemento de una array de números enteros.

Puedes encontrar el código fuente completo de este ejercicio resuelto en vídeo [aquí](../../ejemplos/6.04_Ejercicio1/)

También lo tienes disponible a continuación:


```java
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

```

2. Implementar un programa en Java que nos limpie un array de elementos repetidos, dejando como resultado un array de elementos únicos.

Por ejemplo, a partir del array

```
{1, 2, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8, 9}
```

debería quedar como resultado

```
{1, 2, 3, 4, 5, 6, 7, 8, 9}
```

Para solucionar este ejercicio vamos a utilizar `copyOf`, que es un método de la clase `Arrays` que nos permite crear una copia de un array. Acepta una nueva longitud para el array que se crea.

```java
Arrays.copyOf(arrayOriginal, nuevaLongitud)
```

> Si hay elementos repetidos, el array resultante será más pequeño que el array original.

Puedes encontrar el código fuente completo de este ejercicio resuelto en vídeo [aquí](../../ejemplos/6.05_Ejercicio02/)

También lo tienes disponible a continuación:


```java
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
```


## Otros ejercicios resueltos

3. Implementa un programa que Java que calcule la suma de elementos de un array de números enteros.

```java
public class Ejercicio03 {

    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5 };
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        System.out.println("La suma de los elementos del array es: " + suma);
    }

}
```

4. Crea un programa en Java que calcule la suma de todos los elementos de una matriz de enteros de tamaño 3x3.

```java
public class Ejercicio04 {

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }

        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }

}

```


## Ejercicios propuestos

5. Modifica el ejercicio 3 para que tanto el tamaño del array como los elementos del mismo se introduzcan a través de consola. Como pista, te diré que posiblemente tengas que pedir primero el nº de elementos del array, y después hacer un bucle de ese número de iteraciones para solicitar todos los elementos.

6. Modifica el ejercicio 1 para obtener en lugar del mayor elemento de un array de enteros el segundo mayor elemento.

7. Crea un programa en Java que encuentre el valor máximo en una matriz de enteros de tamaño NxM, donde N y M son valores que se soliciten por teclado, así como todos los elementos del array.

8. La transposición de una matriz es una operación que consiste en intercambiar las filas y columnas de una matriz. Es decir, si tenemos una matriz original A de tamaño m x n, la matriz transpuesta de A, que se denota como A^T, es una matriz de tamaño n x m en la que las filas de A se convierten en columnas en A^T y las columnas de A se convierten en filas en A^T.

Supongamos que tenemos la siguiente matriz A de tamaño 2 x 3:

| 1  2  3 |
| 4  5  6 |

La matriz transpuesta de A, A^T, es una matriz de tamaño 3 x 2 que se obtiene intercambiando las filas y columnas de A:

| 1  4 |
| 2  5 |
| 3  6 |

Implementa un programa en Java que sea capaz de calcular y mostrar la transposición de un array 2D.

