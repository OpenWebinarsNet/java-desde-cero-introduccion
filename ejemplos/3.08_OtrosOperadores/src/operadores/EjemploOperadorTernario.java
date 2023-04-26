package operadores;

public class EjemploOperadorTernario {

	public static void main(String[] args) {
		
		final int TEMPERATURA_ALTA = 30;
		
		int temperatura = 32;
		
		var tipoTemperatura = (temperatura > TEMPERATURA_ALTA) ? "La temperatura es alta" : "La temperatura es normal";
		
		System.out.println(tipoTemperatura);
		
	}

}
