package variables;

public class EjemplosConversion {

	public static void main(String[] args) {

		/**
		 * CONVERSIONES AUTOMÁTICAS
		 */

		// Conversiones sin pérdida de información

		int i = 1234567;
		long l = i;

		System.out.println("Conversión de int -> long");
		System.out.println(i);
		System.out.println(l);

		short s = 1234;
		int i2 = s;

		System.out.println("Conversión de short -> int");
		System.out.println(s);
		System.out.println(i2);

		double d = i;

		System.out.println("Conversión de int -> double");
		System.out.println(i);
		System.out.println(d);

		// Conversiones con pérdida de información
		// Podemos obtener una versión redondeada

		// En este caso no hay problemas por la magnitud
		// del número
		float f = l;
		System.out.println("Conversión de long -> float");
		System.out.println(l);
		System.out.println(f);

		// Aquí podemos observar una pérdida de información
		long l2 = 123_456_789_123_456l;
		System.out.println("Conversión de long -> float");
		System.out.println(l2);
		float f2 = l2;
		System.out.printf("%.2f", f2);
		System.out.println();

		// En este caso no la hay por la magnitud del número
		double d2 = l2;
		System.out.println("Conversión de long -> double");
		System.out.println(l2);
		System.out.printf("%.2f", d2);
		System.out.println();

		// Ejemplo visual de pérdida de información
		int big = 1234567890;
		float approx = big;
		System.out.println("Conversión de int -> float");
		System.out.println(big);
		System.out.println(approx);
		System.out.println("Diferencia");
		System.out.println(big - (int) approx); // Conversión explícita

		/**
		 * CONVERSIONES EXPLÍCITAS
		 */

		// En este caso no hay pérdida por la magnitud del número
		int i3 = 1234;
		// short s3 = i3; // Produce un fallo de compilación
		short s3 = (short) i3;
		System.out.println("Conversión de int -> short");
		System.out.println(i3);
		System.out.println(s3);

		// En este caso si hay pérdida de información

		int i4 = 12345678;
		short s4 = (short) i4;
		System.out.println("Conversión de int -> short");
		System.out.println(i4);
		System.out.println(s4);

		double d3 = 123456.789;
		float f3 = (float) d3;
		System.out.println("Conversión de double -> float");
		System.out.println(d3);
		System.out.println(f3);

	}

}
