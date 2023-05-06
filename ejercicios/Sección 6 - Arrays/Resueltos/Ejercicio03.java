
public class Ejercicio03 {

    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5 };
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        System.out.println("La suma de los elementos del array es: " + suma);
    }

}