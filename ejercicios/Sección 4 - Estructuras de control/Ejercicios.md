# Ejercicios sobre estructuras de control

## Ejercicios resueltos en vídeo sobre estructuras de decisión

1. Implementa un programa en Java que dada una fecha, nos indique cuál es la estación del año (en el hemisferio que tú quieras, aunque la solución se dará del hemisferio norte). El día del mes, y el mes del año se deben introducir como números enteros a través del teclado.

Puedes encontrar el código fuente completo de este ejercicio resuelto en vídeo [aquí](../../ejemplos/4.05_Ejercicio1/)

También lo tienes disponible a continuación:


```java
import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Introduce el día (1-31): ");
        int dia = scanner.nextInt();
        System.out.print("Introduce el mes (1-12): ");
        int mes = scanner.nextInt();

        String estacion = "";

        if (mes == 1 || mes == 2 || (mes == 3 && dia <= 20) || (mes == 12 && dia >= 21)) {
            estacion = "invierno";
        } else if (mes == 4 || mes == 5 || (mes == 3 && dia >= 20) || (mes == 6 && dia < 21)) {
            estacion = "primavera";
        } else if (mes == 7 || mes == 8 || (mes == 6 && dia >= 21) || (mes == 9 && dia < 21)) {
            estacion = "verano";
        } else if (mes == 10 || mes == 11 || (mes == 9 && dia >= 21) || (mes == 12 && dia < 21)) {
            estacion = "otoño";
        }


        System.out.println("La estación del año correspondiente a la fecha introducida es: " + estacion);
        scanner.close();
    }
}

```

2. Realiza un programa en Java que, dado un día de la semana como un número entero, nos indique el día como texto. Haz dos versiones, una usando switch como expresión y otra como sentencia.

Puedes encontrar el código fuente completo de este ejercicio resuelto en vídeo [aquí](../../ejemplos/4.06_Ejercicio2/)

También lo tienes disponible a continuación:


Versión 1, con switch como operador o expresión 

```java
import java.util.Scanner;

public class Ejercicio02v1 {
	public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 7: ");
        int dia = scanner.nextInt();

        String diaSemana = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Error: El número introducido no es válido";
        };

        System.out.println("El día correspondiente es: " + diaSemana);
        scanner.close();
    }
}

```

Versión 2, con switch como sentencia 

```java
import java.util.Scanner;

public class Ejercicio02v2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 7: ");
        int dia = scanner.nextInt();

        String diaSemana = "";

        switch (dia) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Error: El número introducido no es válido";
                break;
        }

        System.out.println("El día correspondiente es: " + diaSemana);
        scanner.close();
    }
}

```



## Ejercicios resueltos en vídeo sobre bucles

3. Escribe un programa en Java que acepte por teclado un número entero y nos diga la cantidad de dígitos que tiene. 

Puedes encontrar el código fuente completo de este ejercicio resuelto en vídeo [aquí](../../ejemplos/4.10_Ejercicio3/)

También lo tienes disponible a continuación:



```java
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        int cantidadDigitos = 0;

        while (numero != 0) {
            numero /= 10;
            cantidadDigitos++;
        }

        System.out.println("El número introducido tiene " + cantidadDigitos + " dígitos.");
        scanner.close();
    }

}
```

4. Calcula cuál es el resultado de sumar los `n` primeros números positivos. Introduce el valor de `n` a través del teclado.

Puedes encontrar el código fuente completo de este ejercicio resuelto en vídeo [aquí](../../ejemplos/4.11_Ejercicio4/)

También lo tienes disponible a continuación:


```java
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Introduce el valor de n: ");
        int n = scanner.nextInt();

        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("La suma de los " + n + " primeros números positivos es " + suma);
        scanner.close();
    }

}
```


## Otros ejercicios resueltos

5. Escribe un programa en Java que muestre la nota literal de un estudiante en función de su nota numérica usando `switch` como expresión, no como sentencia.

```java
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Introduce la nota numérica del estudiante: ");
        int nota = scanner.nextInt();

        String notaLiteral = switch (nota) {
            case 0, 1, 2, 3, 4 -> "Suspenso";
            case 5 -> "Aprobado";
            case 6 -> "Bien";
            case 7, 8 -> "Notable";
            case 9, 10 -> "Sobresaliente";
            default -> "Nota no válida";
        };

        System.out.println("La nota literal del estudiante es: " + notaLiteral);

        scanner.close();
    }
}

```

6. Escribe un programa en Java que acepte por teclado un número entero entre 1 y 10 y muestre su tabla de multiplicar.

```java
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Introduce un número entre 1 y 10: ");
            num = sc.nextInt();
        } while (num < 1 || num > 10);

        System.out.println("Tabla de multiplicar del " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        sc.close();
    }
}
```

7. Escribe un programa en Java que acepte por teclado dos números enteros y calcule su máximo común divisor usando el algoritmo de Euclides. Dicho algoritmo tiene los siguientes pasos:

    a) Se divide el número mayor (`a`) entre el menor (`b`).
    b) Si la división es exacta (resto igual a 0), el divisor es el m.c.d.
    c) Si la división no es exacta, dividimos el divisor entre el resto obtenido y continuamos de esta forma hasta obtener una división exacta. El m.c.d. es el último divisor.


```java

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es " + a);
        sc.close();
    }
}

```

8. Escribe un programa que acepte por teclado una cadena y muestre la cadena inversa.

```java
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();

        String cadenaInvertida = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }

        System.out.println("Cadena invertida: " + cadenaInvertida);
        sc.close();
    }
}

```

## Ejercicios propuestos (no resueltos)

9. Escribe un programa en Java que compruebe si un carácter es una vocal o no.

10. Escribe un programa en Java que comprueba si un año es bisiesto o no. Recuerda que los años bisiestos son aquellos que son divisibles entre 4 pero que no son divisibles entre 100, o que son divisibles entre 400.

11. Escribe un programa en Java que encuentre cuál es el mayor de 3 números usando sentencias if-else.

12. Escribe un programa en Java que pinte una pirámide con asteriscos. El número de pisos debe introducido a través del teclado.

13. Escribe un programa en Java que permita calcular el n-ésimo término de la sucesión de Fibonacci. En dicha sucesión se da que:

- f(0) = 0;
- f(1) = 1;
- f(n) = f(n-1) + f(n-2), con n>=2.

14. Implementa un programa en Java que determine si un número introducido por teclado es primo o no. Recuerda que:

- Un número es primo cuando sus únicos divisores son 1 y él mismo.
- Para un número primo `p`, hay que buscar divisores que sean menores o iguales que `p/2`.

15. Aunque no lo parezca, siguen existiendo locutorios para realizar llamadas telefónicas internacionales. El coste cuando se realiza una llamada es el siguiente:

- Como base, se cobran 0.50€ si el otro usuario coge el teléfono.
- Los primeros 3 minutos cuestan 0.75€ por minuto.
- Los siguientes 4 minutos, cuestan 0.65€ por minuto.
- A partir del 8º minuto, cuestan 0.50€ por minuto.
- Si la llamada se realiza por la noche (22:00 - 7:59), tiene un recargo de un 5% sobre el precio.
- Si la llamada se realiza en domingo, tiene un recargo del 3%

Implementar un programa en Java que pida por teclado todos los datos necesarios e implemente el algoritmo de cálculo del precio final de una llamada.
