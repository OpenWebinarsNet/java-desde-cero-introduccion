package bucles;

import java.util.Scanner;

public class EjemploMenu {

	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
        int opcion;
		
        do {
            System.out.println("Selecciona la opción correspondiente del menú");
            System.out.println("1. Saludar en español");
            System.out.println("2. Saludar en inglés");
            System.out.println("0. Salir del programa");
            
            opcion = sc.nextInt();
            
            switch(opcion) {
            	case 1: System.out.println("¡Hola Mundo!");
            			break;
            	case 2: System.out.println("Hello World!");
            			break;
            	case 0: break;
            	default: System.out.println("Opción incorrecta, vuelva a seleccionar una opción correcta.");		
            	
            }
           
        } while (opcion != 0);
		System.out.println("Gracias por usar nuestra aplicación");
        sc.close();

	}

}
