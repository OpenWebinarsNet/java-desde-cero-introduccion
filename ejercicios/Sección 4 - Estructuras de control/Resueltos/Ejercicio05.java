import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Introduce la nota numérica del estudiante: ");
        int nota = scanner.nextInt();

        String notaLiteral = switch (nota) {
            case 0, 1, 2, 3, 4 -> "Suspenso";
            case 5 -> "Aprobado";
            case 6 -> "Bien";
            case 7, 8 -> "Notable";
            case 9, 10 -> "Sobresaliente";
            default -> "Nota no válida";
        };

        System.out.println("La nota literal del estudiante es: " + notaLiteral);

        scanner.close();
    }
}
