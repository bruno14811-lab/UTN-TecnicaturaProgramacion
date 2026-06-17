
import java.util.Scanner;

public class Ejercicio03 {
   public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        double base = entrada.nextDouble();

        System.out.print("Ingrese la altura: ");
        double altura = entrada.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Área = " + area);
        System.out.println("Perímetro = " + perimetro);
   }     


}   
