package operadores;

public class EjemploOtrosOperadoresBits {

	public static void main(String[] args) {
		
		/**
		 * OPERADORES A NIVEL DE BITS
		 */
		
		// Desplazar hacia la izquierda, añadiendo 2 ceros
		
		int x1 = 10; // 00001010
		int y1 = x1 << 2;
		
		System.out.println("Desplazamiento a la izquierda");
		
		System.out.print(x1); 
		System.out.print(" - ");
		System.out.println(Integer.toBinaryString(x1));
		
		System.out.print(y1); // 40 - 00101000
		System.out.print(" - ");
		System.out.println(Integer.toBinaryString(y1));
		
		// Desplazar hacia la derecha los 2 últimos bits

		
		int x2 = 40; // 00101000
		int y2 = x2 >> 2; 

		System.out.println("Desplazamiento a la derecha");

		System.out.print(x2); 
		System.out.print(" - ");
		System.out.println(Integer.toBinaryString(x2));
		
		System.out.print(y2); // 10 - 00001010
		System.out.print(" - ");
		System.out.println(Integer.toBinaryString(y2));

		
		int x3 = -40; 
		int y3 = x3 >>> 2;
				
		System.out.println("Desplazamiento a la derecha sin signo");

		System.out.print(x3); 
		System.out.print(" - ");
		System.out.println(Integer.toBinaryString(x3));
		
		System.out.print(y3); 
		System.out.print(" - ");
		System.out.println(Integer.toBinaryString(y3));
		
		// Operadores lógicos bit a bit
		
		// AND bit a bit
		
		int x4 = 10; // 00001010
		int y4 = 20; // 00010100
		int res4 = x4 & y4;
		
		System.out.println("AND bit a bit");
		System.out.print(x4); 
		System.out.print(" - ");
		System.out.println(Integer.toBinaryString(x4));
		
		System.out.print(y4); 
		System.out.print(" - ");
		System.out.println(Integer.toBinaryString(y4));
		
		System.out.print(res4); 
		System.out.print(" - ");
		System.out.println(Integer.toBinaryString(res4));

		// OR bit a bit
		int x5 = 10; // 00001010
		int y5 = 20; // 00010100
		int res5 = x5 | y5;
		
		System.out.println("OR bit a bit");
		System.out.print(x5); 
		System.out.print(" - ");
		System.out.println(Integer.toBinaryString(x5));
		
		System.out.print(y5); 
		System.out.print(" - ");
		System.out.println(Integer.toBinaryString(y5));
		
		System.out.print(res5); 
		System.out.print(" - ");
		System.out.println(Integer.toBinaryString(res5));
		
		// NOT bit a bit
		int x6 = 10;  // 000...00001010
		int y6 = ~x6; // 111...11110101
		
		System.out.println("NOT bit a bit");
		System.out.print(x6); 
		System.out.print(" - ");
		System.out.println(Integer.toBinaryString(x6));
		
		System.out.print(y6); 
		System.out.print(" - ");
		System.out.println(Integer.toBinaryString(y6));

		// XOR bit a bit
		int x7 = 10; // 00001010
		int y7 = 20; // 00010100
		int res7 = x7 ^ y7;
		
		System.out.println("XOR bit a bit");
		System.out.print(x7); 
		System.out.print(" - ");
		System.out.println(Integer.toBinaryString(x7));
		
		System.out.print(y7); 
		System.out.print(" - ");
		System.out.println(Integer.toBinaryString(y7));
		
		System.out.print(res7); 
		System.out.print(" - ");
		System.out.println(Integer.toBinaryString(res7));


	}

}
