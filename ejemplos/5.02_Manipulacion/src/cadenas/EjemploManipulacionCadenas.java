package cadenas;

public class EjemploManipulacionCadenas {

	public static void main(String[] args) {
		
		// Concatenación
		
		String msg = "Hola " + "Mundo";
		System.out.println(msg);
		
		String msg2 = "Hola ";
		msg2 += "a todos";
		System.out.println(msg2);
		
		String msg3 = "Hola ";
		msg3 = msg3.concat("amigos de Openwebinars");
		System.out.println(msg3);
		
		String multi1 = """
				Una cadena multilinea
				no muy grande.
				""";
		String multi2 = """
				Otra cadena multilinea
				no muy grande.
				""";
		
		String msg4 = multi1 + multi2;
		System.out.println(msg4);
		
		String msgPrecio = "El precio del producto es " + 36.5;
		System.out.println(msgPrecio);
		
		// Escape de caracteres
		String msg5 = "Esta cadena tiene un salto \n de línea";
		System.out.println(msg5);
		
		String msg6 = "Fuimos a una función en el teatro \"La Gran Central\"";
		System.out.println(msg6);
		
		String msg7 = "\tMensaje con tabulación";
		System.out.println(msg7);
		
		
		// Formateo de cadenas
		String msg8 = String.format("Hola, me llamo %s y estoy encantado de saludarte",  "Luis Miguel");
		System.out.println(msg8);
		
		String msg9 = String.format("%e", 3.3);
		System.out.println(msg9);
		
		double precio = 12.34;
		int cantidad = 2;
		String descripcion = "libros";
		String mensaje = String.format("Usted compró %d %s a un precio de %.2f euros cada uno.", cantidad, descripcion, precio);
		System.out.println(mensaje);	
	
		
	}

}
