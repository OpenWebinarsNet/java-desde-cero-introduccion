
# Ejercicios sobre cadenas de caracteres

## Ejercicios resueltos en vídeo

1. Un palíndromo es una cadena de caracteres que se lee igual desde izquierda a derecha que de derecha a izquierda.  Pueden ser simplemente palabras como: 
- Ana, 
- salas, 
- rajar, ... 

O también frases completas:
- Dábale arroz a la zorra el abad
- A luna ese anula
- Allí ves a Sevilla

Hay que tener en cuenta que se desprecian espacios en blanco o vocales acentuadas.

Implementa un detector de palíndromos en Java.

Puedes encontrar el código fuente completo de este ejercicio resuelto en vídeo [aquí](../../ejemplos/5.04_Ejercicio1/)

También lo tienes disponible a continuación:


```java

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
	
		var sc = new Scanner(System.in);
		
		// Leemos por teclado la palabra o frase
		System.out.println("Introduzca la palabra o frase");
		String entrada = sc.nextLine();
		
		// Pasamos a minúsculas
		String minus = entrada.toLowerCase();
		
		// Limpiamos la cadena 
		
		// Primero de espacios en blanco
		String limpia1 = minus.trim();
		String limpia = "";
		
		// Después, de espacios a mitad de la cadena
		// o de vocales acentuadas
		for(int i = 0; i < limpia1.length(); i++) {
			String sub = limpia1.substring(i, i+1);
			if (!sub.isBlank()) {
				sub = switch(sub) {
					case "á" -> "a";
					case "é" -> "e";
					case "í" -> "i";
					case "ó" -> "o";
					case "ú" -> "u";
					default -> sub;
				};
				limpia += sub;
			}
			 
		}
		
		// En limpia tenemos ya la cadena sin espacios
		// ni vocales acentuadas
		
		// Obtenemos la cadena inversa
		String inversa = "";
		for(int i = limpia.length()-1; i >= 0; i--) {
			inversa += limpia.charAt(i);
		}
		
		// Comprobamos si son iguales.
		if (limpia.equals(inversa)) 
			System.out.println("Es un palíndromo");
		else
			System.out.println("No es un palíndromo");
		
	
		sc.close();

	}

}
```


2. Implementa un validador de contraseñas. Ésta se debe leer por teclado y debemos comprobar que cumple determinadas características:
  
- Tiene entre 8 y 20 caracteres.
- Tiene alguna letra mayúscula y alguna letra minúscula.
- Tiene algún carácter raro entre $ % _ *
- Tiene algún número

Puedes encontrar el código fuente completo de este ejercicio resuelto en vídeo [aquí](../../ejemplos/5.05_Ejercicio2/)

También lo tienes disponible a continuación:


```java
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Por defecto, no se cumplen las condiciones
		
		boolean tieneMayusculas = false;
		boolean tieneMinusculas = false;
		boolean tieneDigitos = false;
		boolean tieneCaracterRaro = false;
		boolean tieneLongitud = false;
		
		// Leemos la contraseña
		var sc = new Scanner(System.in);
		System.out.println("Introduce la contraseña a verificar: ");
		String password = sc.nextLine();
		
		// Comprobamos si cumple la lontigud marcada
		
		if (password.length() >= 8 && password.length() <= 20)
			tieneLongitud = true;
		
		// Verificamos la contraseña caracter a caracter
		
		for(int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			
			if (Character.isUpperCase(c))
				tieneMayusculas = true;
			
			if (Character.isLowerCase(c))
				tieneMinusculas = true;
			
			if (Character.isDigit(c))
				tieneDigitos = true;
			
			if (c == '$' || c == '%' || c == '_' || c == '*')
				tieneCaracterRaro = true;
			
		}
			
		
		if (tieneMayusculas && tieneMinusculas 
				&& tieneDigitos && tieneCaracterRaro
				&& tieneLongitud) {
			System.out.println("La contraseña cumple con los requisitos");
		} else {
			System.out.println("La contraseña no cumple con los requisitos");
		}
		
		sc.close();
		
	}

}
```

## Otros ejercicios resueltos

3. Escribir un programa en Java que detecte el primer carácter repetido de una cadena de caracteres.

```java
public class Ejercicio03 {
    
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);

        System.out.println("Introduzca la cadena a verificar");
        String str = sc.nextLine();

        boolean repetido = false;
        char caracterRepetido = ' ';
        int i = 0;
        while (i < str.length() && !repetido) {
            char c = str.charAt(i);
            int j = i+1;
            while (j < str.length() && !repetido) {
                if (c == str.charAt(j)) {
                    repetido = true;
                    caracterRepetido = c;
                }
                else
                    j++;    
            }
            i++;
        }
        
        if (repetido)
            System.out.println("El primer carácter repetido es " + caracterRepetido);
        else
            System.out.println("No hay ningún carácter repetido");

        sc.close();

    }

}
```

4. Escribir un programa que cuente el número de vocales de una cadena de caracteres.

```java
public class Ejercicio04 {
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);

        System.out.println("Introduzca una cadena de caracteres");
        String str = sc.nextLine();

        String minusculas = str.toLowerCase();

        int cantidadVocales = 0;

        for(int i=0; i < minusculas.length(); i++) {
            char c = minusculas.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cantidadVocales++;
            }
        }

        System.out.println("La cantidad de vocales es: " + cantidadVocales);

        sc.close();
    }
}
```

## Ejercicios propuestos

5. Escribir un programa en Java que tome una cadena escrita por el usuario y la escriba en mayúsculas y al revés.

6. Escribir un programa en Java que acepte dos cadenas de caracteres y verifique si son anagramas, es decir, que tienen los mismos caracteres pero en otro orden.

7. Escribir un programa en Java que verifique si una cadena de caracteres es una dirección de email. Para ello debe comprobar, en este orden:

- Que tiene algo de texto o números
- Que tiene un caracter @
- Que tiene algo de texto o números
- Que tiene un punto
- Que termina con algo de texto.

