
package ejercicio02;
import java.util.Scanner;
public class ejercicio02 {
    public static void main(String[] args) { 
       /* Ejercicio 2: Hacer un programa que calcule el cuadro de una suma,

el usuario debe ingresar el valor de a y el valor de b.

Formula: (a+b)2=a2+b2+2*a*b

Para esto deberán utilizar la clase Math y un método llamado pow
 */
         var entrada = new Scanner(System.in);
         
         System.out.println("Ingrese el valor de a");
         double a = entrada.nextDouble();
         System.out.println("Ingrese el valor de b");
         double b = entrada.nextDouble();
         
         double resultado = Math.pow(a+b, 2);
         
         System.out.println("El resultado es: " + resultado);
         
         entrada.close();
                  
    }
}   

