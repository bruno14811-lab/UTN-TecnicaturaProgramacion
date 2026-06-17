
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        /*
        Hacer un programa que calcule e imprima el salario de un empleado, a partir de sus
        horas semanales trajadas y de su salario por horas
         */

        var entrada = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas en la semana: ");
        int horas = Integer.parseInt(entrada.nextLine());//Variable de tipo entero
        System.out.println("Ingrese el monto del valor de la hora: ");
        float salarioH = Float.parseFloat(entrada.nextLine());//Utilizo Float.parseFloat para poder convertir la variable en variable que acepte los decimales

        float salarioTotal = horas * salarioH;
        
        System.out.println("\n");//Salto de linea

        System.out.println("Las horas trabajadas son: " + horas);//Horas trabajadas
        System.out.println("El salario por hora es: " + salarioH);//Valor de la hora
        System.out.println("El salario total es: " + salarioTotal);//Recuento total         
    
    }    
}