
package ejercicio09;
// ejercicio02: en un almacen se hace un 20% dde descuento a los clientes
// cuyacompra supere los $100 ¿cual sera la cantidad que pagara una persona por su compra?

import java.util.Scanner;

public class ejercicio02 {

    private static boolean s;

    public static void main(String[] args) {
        
        try (Scanner teclado = new Scanner(System.in)){
        double compra;
        double descuento;
        double precioFinal;
            
        System.out.print("Digite la cantidad a pagar: ");
        compra = teclado.nextDouble();
        
        if (compra > 100){
            descuento = compra * 0.20;
        }else {
            descuento = 0;
        }
        
        precioFinal = compra - descuento;
                
        System.out.println("El precio a pagar es: "+ precioFinal);
        
        }
    }
}

