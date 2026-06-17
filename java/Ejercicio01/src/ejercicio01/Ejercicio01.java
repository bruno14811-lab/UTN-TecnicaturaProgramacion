import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        
        // primer mensaje
        try (Scanner sc = new Scanner(System.in)) {
            // primer mensaje
            System.out.println("Ingrese los siguientes datos del libro");
            
            
            // Digitamos el nombre del libro
            System.out.print("Digite el nombre del libro: ");
            String nombre = sc.nextLine();
            
            //Digitamos el ID del libro
            System.out.print("Digite el ID del libro: ");
            int id = sc.nextInt();
            
            // Digitamos el precio del libro
            System.out.print("Digite el precio del libro: ");
            double precio = sc.nextDouble();
            
            // Indicamos si el envío es gratuito (True/False)
            System.out.print("Indicar si el envío es gratuito (true/false): ");
            boolean envioGratuito = sc.nextBoolean();
            
            // 6. Mostramos todos los datos ingresados
            
            System.out.println("Nombre: "          + nombre);
            System.out.println("ID: "              + id);
            System.out.println("Precio: "          + precio);
            System.out.println("Envío Gratuito?: " + envioGratuito);
        }
    }
}
