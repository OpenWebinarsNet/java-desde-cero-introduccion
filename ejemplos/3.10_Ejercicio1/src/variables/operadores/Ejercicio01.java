package variables.operadores;

import java.util.Scanner;

/*
El precio de final de venta de un ordenador portátil es la suma total de:

- El coste de fabricación
- El margen (en porcentaje) de beneficio de ganancia del vendedor
- Los impuestos (calculados sobre el coste de fabricación más el margen de beneficio).

Si suponemos que la ganancia del vendedor va a ser del 30% de cada ordenador, y que el impuesto aplicable es del 21%, diseñar un programa que calcule el precio final del portátil y lo muestre por pantalla. El precio del coste de fabricación se debe obtener leyéndolo desde el teclado.

Además de mostrar el precio final por consola, debe mostrar si el portátil tiene un precio NORMAL o DE LUJO mediante la siguiente fórmula:

- Precio final <= 600 : NORMAL
- Precio final > 600 : DE LUJO
  
*/

public class Ejercicio01 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

        System.out.print("Introduce el costo de fabricación del portátil: ");
        double costoFabricacion = sc.nextDouble();

        
        //double margenGanancia = 30 / 100.0; 
        double margenGanancia = 0.3; // 30%
        //double impuestos = 21 / 100.0;
        double impuestos = 0.21; // 21%

        //double costeConGanancia = costoFabricacion + costoFabricacion * margenGanancia;
        //double impuestosAplicados = costeConGanancia * impuestos;
        //double precioFinal = costeConGanancia + impuestosAplicados;
        double precioFinal = costoFabricacion * (1 + margenGanancia) * (1 + impuestos);
        System.out.println("El precio final del portátil es: " + precioFinal);

        String tipoPrecio = (precioFinal <= 600) ? "NORMAL" : "DE LUJO";
        System.out.println("El portátil tiene un precio " + tipoPrecio);
        
        sc.close();
	}

}

