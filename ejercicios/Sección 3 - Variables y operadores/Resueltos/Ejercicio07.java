import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer los datos de entrada por teclado
        var scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese los dos números enteros
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        // Realizamos las operaciones de suma, resta, multiplicación, división y resto
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int resto = numero1 % numero2;

        // Mostramos los resultados por consola
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
        System.out.println("El resto es: " + resto);

        // Cerramos el objeto Scanner
        scanner.close();
    }
}
