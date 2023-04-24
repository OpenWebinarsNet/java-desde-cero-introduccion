package operadores;

public class EjemploOperadoresAritmeticos {

	public static void main(String[] args) {
		
		// Operadores aritméticos básicos
		
		// Podemos usarlos con cualquier
		// tipo numérico
		System.out.println("OPERADORES ARITMÉTICOS BÁSICOS");

		int i1 = 7;
		int i2 = 5;
		int i = i1 + i2;
		System.out.println(i);
		
		
		float f1 = 123.45f;
		float f2 = 456.34f;
		float f = f1 - f2;
		System.out.println(f);
		
		// No es lo mismo división entera que con decimales
		
		int resultadoDivisionEntera = 3 / 2;
		float resultadoDivisonDecimales = 3.0f / 2.0f;
		System.out.println("Resultado división entera -> " + resultadoDivisionEntera);
		System.out.println("Resultado división con decimales -> " + resultadoDivisonDecimales);
		
		
		int resto = i1 % i2;
		System.out.println(resto);
		
		
		// Operadores aritméticos de asignación
		
		System.out.println("OPERADORES ARITMÉTICOS DE ASIGNACIÓN");
		
		int a = 7;
		a+= 1;
		System.out.println(a);
		
		int b = 9;
		b-= 1;
		System.out.println(b);
		
		int c = 3;
		c*= 2;
		System.out.println(c);
		
		int d = 10;
		d%= 3;
		System.out.println(d);
		
		// Operadores unarios
		
		System.out.println("OPERADORES ARITMÉTICOS UNARIOS");

		int e = 8;
		int eNegativo = -e;
		System.out.println(eNegativo);
		
		int inc = 8;
		inc++;
		System.out.println(inc);
		
		// PREINCREMENTO
		inc = 8;
		int preIncremento = ++inc; //9
		System.out.println(preIncremento);
		
		//POSTINCREMENTO
		inc = 8;
		int postIncremento = inc++; //8
		System.out.println(postIncremento);

		

	}

}
