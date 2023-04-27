package cadenas;

public class EjemploMetodosString {

	public static void main(String[] args) {

		// length
		String str = "En un lugar de La Mancha...";
		int longitud = str.length();
		System.out.println("Longitud de la cadena: " + longitud);
	
		// chatAt
		char c = str.charAt(1); // n
		
		// subString
		String sub = str.substring(15, 24);
		System.out.println(sub);
		
		// toUpperCase, toLowerCase
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		// equals, equalsIgnoreCase
		if (sub.equals("LA MANCHA"))
			System.out.println("Son iguales");
		else
			System.out.println("No son iguales");

		if (sub.equalsIgnoreCase("LA MANCHA"))
			System.out.println("Son iguales");
		else
			System.out.println("No son iguales");

		// startsWith, endsWith
		if (str.startsWith("En un lugar"))
			System.out.println("¡Correcto! Comienzan igual");
		
		
		if (str.endsWith("..."))
			System.out.println("¡Correcto! Tienen el mismo fin");
		
		// contains
		if (str.contains("La Mancha"))
			System.out.println("Está contenida");
		
		int posN = str.indexOf('n'); // 1, la cadena empieza en 0
		int lastPosN = str.lastIndexOf("n"); // 20
		
		System.out.println("La primera ocurrencia de \"n\" está en la posición " + posN);
		System.out.println("La última ocurrencia de \"n\" está en la posición " + lastPosN);
		
		
		// replace, replaceAll
		System.out.println(str.replace('a', 'o'));
		System.out.println(str.replace("La Mancha", "España"));
		
		// join
		String lang = String.join(", ", "Java", "C", "Python", "Go");
		System.out.println(lang);
		
		// trim
		String withSpaces = "      " + str + "    ";
		System.out.println(withSpaces);
		System.out.println("Longitud: " + withSpaces.length());
		System.out.println(withSpaces.trim());
		System.out.println("Longitud: " + withSpaces.trim().length());
		
		// stripIndent
		String multilinea = "\tqwert\n\tasdfg     \n\tzxcvb   ";
		System.out.println(multilinea.stripIndent());
		
		// formatted
		float precio = 12.34f;
		System.out.println("El precio del producto es %.2f".formatted(precio));
		
		
		// repeat
		System.out.println("*".repeat(20));
		
		
		// isBlank, isEmpty
		String vacia1 = "     \t     ";
		String vacia2 = "";
		
		if (vacia1.isBlank())
			System.out.println("Está en blanco");
		
		if (vacia2.isEmpty())
			System.out.println("Está totalmente vacía");
		
		
		
	}

}
