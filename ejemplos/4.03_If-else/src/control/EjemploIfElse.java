package control;

public class EjemploIfElse {

	public static void main(String[] args) {
		
		// Estructura if-else simple
		
		int nota = 10;
		
		if (nota > 5) {
			System.out.println("¡Enhorabuena! Has aprobado");
		} else {
			System.out.println("Lo siento, seguro que la próxima vez lo consigues");
		}
		
		
		// El bloque else no es obligatorio
		
		float precio = 12.34f;
		float iva = 0.21f;
		
		if (iva > 0) {
			precio += precio*iva;
		}
		
		System.out.println("El precio del producto es: " + precio);
		
		
		// Las condiciones pueden ser más complejas
		
		int edad = 27;
		final int edadMinimaTrabajo = 16;
		final int edadJubilacion = 67;
		
		if (edad >= edadMinimaTrabajo && edad <= edadJubilacion) {
			System.out.println("Puedes trabajar");	
		} else {
			System.out.println("No puedes trabajar");
		}
		
		
		/*
		 * Si el bloque if o else solamente incluyen una sentencia
		 * no son obligatorias las llaves
		 */
		
		if (nota >= 9)
			System.out.println("Enhorabuena, tienes un sobresaliente");
		
		
		// Estructura if-else-if
		int num = 7;

        if(num < 0) {
            System.out.println("El número es negativo.");
        }
        else if(num == 0) {
            System.out.println("El número es cero.");
        }
        else if(num > 0 && num < 10) {
            System.out.println("El número es un dígito positivo.");
        }
        else {
            System.out.println("El número es mayor o igual a 10.");
        }
		
	}

}
