package operadores;

public class EjemploOperadoresLogicos {

	public static void main(String[] args) {
		
		/**
		 * OPERADORES DE COMPARACIÓN
		 */
		
		// Mayor
		
		int a1 = 7;
		int b1 = 6;
		
		boolean r1 = a1 > b1;
		
		System.out.print("a1 > b1 ");
		System.out.println(r1);
		
		
		// Mayor o igual
		
		int a2 = 7;
		int b2 = 7;
		
		boolean r2 = a2 >= b2;
		
		System.out.print("a2 >= b2 ");
		System.out.println(r2);
		
		
		// Menor
		
		int a3 = 3;
		int b3 = 5;
		
		boolean r3 = a3 < b3;
		
		System.out.print("a3 < b3 ");
		System.out.println(r3);
		
		
		// Menor o igual
		
		int a4 = 3;
		int b4 = 3;
		
		boolean r4 = a4 <= b4;
		
		System.out.print("a4 <= b5 ");
		System.out.println(r4);

		
		// Igual
		
		int a5 = 3;
		int b5 = 3;
		
		boolean r5 = a5 == b5;
		
		System.out.print("a5 == b5 ");
		System.out.println(r5);
		
		// Distinto
		int a6 = 3;
		int b6 = 5;
		
		boolean r6 = a6 != b6;
		
		System.out.print("a6 != b6 ");
		System.out.println(r6);
		
		/**
		 * OPERADORES LÓGICOS
		 */
		
		// Por partes
		
		int x1 = 5;
		
		boolean c1 = x1 > 0;
		boolean c2 = x1 < 10;
		boolean c = c1 && c2;
		
		System.out.print("c1: x1 > 0, c2: x1 < 10. c = c1 && c2 ");
		System.out.println(c);

		
		// En una única expresión
		c = x1 > 0 && x1 < 10;
		System.out.print("x1 > 0 && x1 < 10 ");
		System.out.println(c);

		
		// OR
		int x2 = 5;
		c1 = x2 <= 5;
		c2 = x2 > 100;
		c = c1 || c2;
		
		System.out.print("c1: x1 <= 5, c2: x1 > 100. c = c1 || c2 ");
		System.out.println(c);
		
		// En una única expresión
		c = x2 <= 5 || x2 > 100;
		System.out.print("x2 <= 5 || x2 > 100 ");
		System.out.println(c);
		
		// Negación
		boolean v = true;
		boolean f = !v;
		System.out.print("!v ");
		System.out.println(f);
		

	}

}
