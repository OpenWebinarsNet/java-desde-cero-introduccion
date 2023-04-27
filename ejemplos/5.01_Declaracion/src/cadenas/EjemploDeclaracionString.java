package cadenas;

public class EjemploDeclaracionString {

	public static void main(String[] args) {
		
		String saludo = "Hola a todos";
		var despedida = "¡Hasta luego!";
		
		System.out.println(saludo);
		System.out.println(despedida);
		
		String copia = despedida;
		System.out.println(copia);
		
		String multilinea = """
				Hola a todos
					desde varias líneas
				de texto.
				""";
		System.out.println(multilinea);
		

		String str = new String("Hola Mundo");
		System.out.println(str);
		
	}

}
