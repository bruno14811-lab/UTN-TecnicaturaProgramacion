
import java.util.Scanner;
/* ejercicio03: leer 2 numeros si son iguales que los multiplique, si el
primero es mayor que el segundo que los reste y si no que
los sume.
 */
public class ejercico03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite dos numeros");
        var num1 = Double.parseDouble(entrada.nextLine());
        var num2 = Double.parseDouble(entrada.nextLine());
        Double resultado = null;
        
        if (num1 == num2) {
            resultado = num1 * num2;
        }else {
            if (num1 > num2){
                resultado = num1 - num2;
            }else{
                resultado = num1 + num2;
            }    
        }  
        System.out.println("El resultado es = " + resultado);     
    }
}