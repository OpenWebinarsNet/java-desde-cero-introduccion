import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Introduce un número entre 1 y 10: ");
            num = sc.nextInt();
        } while (num < 1 || num > 10);

        System.out.println("Tabla de multiplicar del " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        sc.close();
    }
}
