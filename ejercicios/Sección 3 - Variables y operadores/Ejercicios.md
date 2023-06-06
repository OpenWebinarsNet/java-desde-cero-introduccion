
# Ejercicios sobre variables y operadores

## Ejercicio resuelto en vídeo

1. El precio de final de venta de un ordenador portátil es la suma total de:

- El coste de fabricación
- El margen (en porcentaje) de beneficio de ganancia del vendedor
- Los impuestos (calculados sobre el coste de fabricación más el margen de beneficio).

Si suponemos que la ganancia del vendedor va a ser del 30% de cada ordenador, y que el impuesto aplicable es del 21%, diseñar un programa que calcule el precio final del portátil y lo muestre por pantalla. El precio del coste de fabricación se debe obtener leyéndolo desde el teclado.

Además de mostrar el precio final por consola, debe mostrar si el portátil tiene un precio NORMAL o DE LUJO mediante la siguiente fórmula:

- Precio final <= 600 : NORMAL
- Precio final > 600 : DE LUJO

Puedes encontrar el código fuente completo de este ejercicio resuelto en vídeo [aquí](../../ejemplos/3.10_Ejercicio1/)

También lo tienes disponible a continuación:

```java
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

        System.out.print("Introduce el costo de fabricación del portátil: ");
        double costoFabricacion = sc.nextDouble();

        
        //double margenGanancia = 30 / 100.0; 
        double margenGanancia = 0.3; // 30%
        //double impuestos = 21 / 100.0;
        double impuestos = 0.21; // 21%

        //double costeConGanancia = costoFabricacion + costoFabricacion * margenGanancia;
        //double impuestosAplicados = costeConGanancia * impuestos;
        //double precioFinal = costeConGanancia + impuestosAplicados;
        double precioFinal = costoFabricacion * (1 + margenGanancia) * (1 + impuestos);
        System.out.println("El precio final del portátil es: " + precioFinal);

        String tipoPrecio = (precioFinal <= 600) ? "NORMAL" : "DE LUJO";
        System.out.println("El portátil tiene un precio " + tipoPrecio);
        
        sc.close();
	}

}
```

2. Realiza un programa en Java que calcule la nota media de un alumno en la asignatura de Programación. La nota media se calcula como el promedio de las 3 notas trimestrales. Muestra la nota promedio redondeada y además, muestra un mensaje que indique si el alumno está APROBADO (nota final >= 5) o suspenso (nota final < 5).

Puedes encontrar el código fuente completo de este ejercicio resuelto en vídeo [aquí](../../ejemplos/3.11_Ejercicio2/)

También lo tienes disponible a continuación:


```java
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
```

## Otros ejercicios resueltos

3. Escribir un programa que calcule el area y el perímetro de un rectángulo y la muestre por consola. La `altura` y la `anchura` del mismo la puedes proporcionar como valores iniciales de las variables correspondientes.

```java
public class Ejercicio03 {
    public static void main(String[] args) {
        double altura = 5.0; // Altura del rectángulo
        double anchura = 10.0; // Anchura del rectángulo

        // Cálculo del área del rectángulo
        double area = altura * anchura;

        // Cálculo del perímetro del rectángulo
        double perimetro = 2 * altura + 2 * anchura;

        // Mostramos los resultados por consola
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }
}
```


4. Escribir un programa que calcule el perímetro y el área de un círculo y la muestre por consola. El `radio` del mismo lo puedes proporcionar como un valor inicial de la variable correspondiente.

```java
public class Ejercicio04 {

    public static void main(String[] args) {
        double radio = 5.0; // Radio del círculo

        // Cálculo del perímetro del círculo
        double perimetro = 2 * Math.PI * radio;

        // Cálculo del área del círculo
        double area = Math.PI * radio * radio;

        // Mostramos los resultados por consola
        System.out.println("El perímetro del círculo es: " + perimetro);
        System.out.println("El área del círculo es: " + area);
    }
    
}
```

5. Escribir un programa que, dada una cantidad de euros, nos indique cuál es su valor en dólares americanos. Además de la variable para la cantidad de euros, se debe declarar otra para el cambio (el valor de un dolar en euros) y para el resultado final. Muestra el resultado por consola.

```java
public class Ejercicio05 {
    
    public static void main(String[] args) {
        double euros = 100.0; // Cantidad de euros a convertir
        double valorDolarEnEuros = 0.85; // Valor de 1 dólar en euros
        double dolares = euros / valorDolarEnEuros; // Conversión a dólares

        // Mostramos el resultado por consola
        System.out.println(euros + " euros son " + dolares + " dólares");
    }

}
```

6. Escribe un programa que determine si un número es par o impar usando el operador ternario.

```java
public class Ejercicio06 {
    public static void main(String[] args) {
        int numero = 7; // Número a evaluar

        // Evaluamos si el número es par o impar utilizando el operador ternario
        String resultado = (numero % 2 == 0) ? "par" : "impar";

        // Mostramos el resultado por consola
        System.out.println("El número " + numero + " es " + resultado);
    } 
}
```

7. Escribe un programa que lea dos números enteros por teclado, y realice las operaciones básicas de una calculadora con ellos: suma, resta, multiplicación, división y resto. Debe mostrar todos los resultados por consola.

```java
public class Ejercicio07 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer los datos de entrada por teclado
        var scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese los dos números enteros
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        // Realizamos las operaciones de suma, resta, multiplicación, división y resto
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int resto = numero1 % numero2;

        // Mostramos los resultados por consola
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
        System.out.println("El resto es: " + resto);

        // Cerramos el objeto Scanner
        scanner.close();
    }
}
```

## Ejercicios propuestos (no resueltos)

8. Escribe un programa en Java que calcule la media de 3 números que se hayan leído desde el teclado y la muestre por consola.

9. Escribe un programa en Java que intercambie el valor de dos variables.

10. Escribe un programa en Java que calcule cuál es el espacio recorrido por un objeto, como por ejemplo, una sonda espacial, que se mueve a velocidad constante. Podemos suponer que el objeto ha recorrido un espacio inicial de 150.000 km y se mueve a una velocidad 17 km por segundo.
