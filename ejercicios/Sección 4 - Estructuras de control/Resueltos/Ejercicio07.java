
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es " + a);
        sc.close();
    }
}
