package cadenas;

import java.util.Scanner;

/*
 * Implementa un validador de contraseñas. Ésta se debe leer por
 * teclado y debemos comprobar que cumple determinadas
 * características:
 * 
 * - Tiene entre 8 y 20 caracteres.
 * - Tiene alguna letra mayúscula y alguna letra minúscula.
 * - Tiene algún carácter raro entre $ % _ *
 * - Tiene algún número
 * 
 */

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
