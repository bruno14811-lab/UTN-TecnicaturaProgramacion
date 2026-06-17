import java.util.Scanner;
/*
Ejercicio 3: La calificacion final de un estudiante de informática
se calcula con base a las calificaciones de cuatro aspectos de su
rendimiento académico: participación, primer examen parcial, segundo
examen parcial y examen final. Sabiendo que las calificaciones anteriores
entran a la calificación final con ponderaciones de 10%, 25%, 25%
y 40%, Hacer un programa que calcule e imprima la calificación final
obtenida por un estudiante. 
Que el usuario digite las calificaciones de estos 4 datos y así podremos tener,
la calificación final.

*/

public class ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ponderaciones:");
        System.out.println("  - Participación: 10%");
        System.out.println("  - 1er Examen Parcial: 25%");
        System.out.println("  - 2do Examen Parcial: 25%");
        System.out.println("  - Examen Final: 40%");
        System.out.println();
        
        System.out.println("Ingrese la calificacion de Participacion: ");
        double part = entrada.nextDouble();
        System.out.println("Ingrese la calificacion de Primer examen parcial");
        double primer = entrada.nextDouble();
        System.out.println("Ingrese la calificacion del Segundo examen parcial");
        double segundo = entrada.nextDouble();
        System.out.println("Ingrese la calificacion del Examen final");
        double exFinal = entrada.nextDouble();
        
        double calificacionFinal = (part * 0.10) + (primer * 0.25) + (segundo * 0.25) + (exFinal * 0.40);
        
        System.out.println();
        System.out.println("Calificacion Final: "+calificacionFinal);
    }
}

    

