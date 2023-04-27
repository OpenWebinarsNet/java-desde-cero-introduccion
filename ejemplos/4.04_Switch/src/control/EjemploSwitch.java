package control;

public class EjemploSwitch {

	public static void main(String[] args) {

		// Ejemplo de switch como sentencia.

		// Sistema de calificaciones tradicional en España

		int nota = 9;

		switch (nota) {
		case 10:
		case 9:
			System.out.println("Sobresaliente");
			break;
		case 8:
		case 7:
			System.out.println("Notable");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("Insuficiente");
			break;
		default:
			System.out.println("Calificación inválida");
		}

		// Ejemplo de switch como expresión
		String mensaje = switch (nota) {
			case 10, 9 -> "Sobresaliente";
			case 8, 7 -> "Notable";
			case 6 -> "Bien";
			case 5 -> "Suficiente";
			case 4, 3, 2, 1, 0 -> "Insuficiente";
			default -> "Calificación inválida";
		};

		System.out.println(mensaje);

	}

}
