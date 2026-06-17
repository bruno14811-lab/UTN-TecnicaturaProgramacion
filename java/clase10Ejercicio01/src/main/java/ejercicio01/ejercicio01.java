
package ejercicio01;
import java.util.Scanner;  
/*
Ejercicio 1: Construir un programa que, dado un número total de

horas, devuelve el número de semanas, días y horas equivalentes.

Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas,

6 días y 16 horas.
 */
public class ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero total de horas: ");
        int totalHoras = entrada.nextInt();
        
        int semanas = totalHoras / (7*24);//Equivale a 168 hs por semana
        int restoHoras = totalHoras % 168;
        
        int dias = restoHoras / 24;
        int horas = restoHoras % 24;
        
        System.out.println("\n" + totalHoras + "Horas equivalentes a: ");
        System.out.println(semanas +" Semanas" );
        System.out.println(dias + " Dias" );
        System.out.println(horas + " Horas");
    }
}

