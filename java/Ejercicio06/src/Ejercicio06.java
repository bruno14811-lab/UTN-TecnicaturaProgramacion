import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float guillermo, luis, juan, total;

        System.out.print("Ingrese el dinero de Guillermo: ");
        guillermo = sc.nextFloat();

        luis = guillermo / 2;

        juan = (guillermo + luis) / 2;

        total = guillermo + luis + juan;

        System.out.println("Dinero de Guillermo: " + guillermo);
        System.out.println("Dinero de Luis: " + luis);
        System.out.println("Dinero de Juan: " + juan);

        System.out.println("El total de dinero entre los tres es: " + total);
    }
}