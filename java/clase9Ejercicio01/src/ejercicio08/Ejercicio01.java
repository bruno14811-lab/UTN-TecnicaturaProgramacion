import java.util.Scanner;

// Determinar si un alumno aprueba o reprueba un curso, sabien que
// aprobara si su promedio de tres calificaciones es mayor o igual a 70
// reprueba caso contrarop. 
public class Ejercicio01 {
    public static void main(String[] args){
      Scanner entrada = new Scanner(System.in);
      
      double nota1, nota2, nota3, promedio;
      
      System.out.println("Digete las 3 calificaciones");
      nota1 = entrada.nextDouble ();
      nota2 = entrada.nextDouble();
      nota3 = entrada.nextDouble();
      
      promedio = (nota1+ nota2 + nota3)/ 3;
      
      if (promedio >= 7)
          System.out.println("El alumno esta aprobado con: " + promedio);
      else{
                System.out.println("El  alumno esta desaprobado con: " + promedio);
                
      }
      
      entrada.close();
      
      
              
        
        
    }
    }
       
