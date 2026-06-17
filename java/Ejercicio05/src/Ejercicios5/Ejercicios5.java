/*Hacer un programa que calcule e imprima la suma de tres calificaciones.
Pedir las calificaciones al usuario, crear un proyecto nuevo llmaado Ejercicio 5
*/
package Ejercicios5;

import java.util.Scanner;

public class Ejercicios5 { 
    public static void main(String[] args) {
          double calificacion1, calificacion2, calificacion3, suma;
         try (Scanner entrada = new Scanner(System.in)) {

           System.out.print("Ingrese la primera calificación: ");
           calificacion1 = entrada.nextDouble();

           System.out.print("Ingrese la segunda calificación: ");
           calificacion2 = entrada.nextDouble();

           System.out.print("Ingrese la tercera calificación: ");
           calificacion3 = entrada.nextDouble();

           suma = (calificacion1 + calificacion2 + calificacion3);
              double sumaa = (calificacion1 + calificacion2 + calificacion3) /3;
           System.out.println("La suma de las tres calificaciones es: " + suma);
           System.out.println("El promedio de las tres calificaciones es: " + sumaa);
       }
    }
    
}
