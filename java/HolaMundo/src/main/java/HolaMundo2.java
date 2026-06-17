
import java.util.Scanner;

/* NUESTRO PRIMER PROGRAMA HOLA MUNDO
 */
public class HolaMundo2 {

    public static void main(String[] args) {
        /*   System.out.println("Hola mundo desde java");
    
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        // tipo String
        String miVariableCadena = "bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "sigamos creciendo en programacion";
        System.out.println(miVariableCadena);
         */
 /* // var - interferencia de tipo java
        var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //soutv + tab
        // para ejecutar Shift + f6 es la tecla para mayuscula
        // reglas para definir una variable en java
        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo +" "+ usuario;
        System.out.println("union = " + union);
       
        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));
       
        
        
        // Ejercicio: caracteres especiales con java
        var nombre = "natalia";
        System.out.println("nueva linea: \n"+nombre);
        System.out.println("\t\t.:MENU:.");
        System.out.println("Retroseso: \b\b" +nombre);
        System.out.println("Comillas simples:\'"+nombre+"\'");
        System.out.println("comillas dobles: \""+nombre+"\'");*/


        //Clase Scanner
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = "+ usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+ titulo2+" "+usuario2 );*/
        
        
        // ejercicio detalles del libro
        /* Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el nombre del libro: ");
        var nombre = entrada.nextLine();
        System.out.println("Digite el autor del libro: ");
        var autor = entrada.nextLine();
        System.out.println(nombre+" Fue escrito por "+autor );*/
 
 
 
 
        /*byte numEnteroByte = 127;
       System.out.println("numEnteroByte = " + numEnteroByte);
       System.out.println("Valor minimo del byte:"+ Byte.MIN_VALUE);
       System.out.println("Valor maximo del byte:"+ Byte.MAX_VALUE);
       
       short numEnteroShort = 32767;
       System.out.println("numEnteroShort:" + numEnteroShort);
       System.out.println("Valor minimo del short:"+Short.MIN_VALUE);
       System.out.println("Valor maximo del short:"+Short.MAX_VALUE);
       
       int numEnteroInt = 2147483647;
       System.out.println("numEnteroInt =" + numEnteroInt);
       System.out.println("Valor minimo del int:"+ Integer.MIN_VALUE);
       System.out.println("Valor maximo del int:"+ Integer.MAX_VALUE);
       
       long numEnteroLong = 10;
       System.out.println("numEnteroLong =" + numEnteroLong);
       System.out.println("Valor minimo del long:"+ Long.MIN_VALUE);
       System.out.println("Valor maximo del long:"+ Long.MAX_VALUE);*/



        //Ejercicio tipo float
        /*float numFloat = 3.4028235E38F;
       System.out.println("numFloat = " + numFloat);
       System.out.println("El valor minimo de float:"+ Float.MIN_VALUE);
       System.out.println("El valor maximo de floar:"+ Float.MAX_VALUE);
       
       double numDouble = 3.4028235E38D;
       System.out.println("numDouble ="+ numDouble);
       System.out.println("El valor minimo de double:"+ Float.MIN_VALUE);
       System.out.println("El valor maximo de double:"+ Float.MAX_VALUE);*/


        // Inferencia de tipos var y tipos primitivos
        /* var numEntero = 20; // Las literales sin puntos automaticamente son de tipo int
       System.out.println("numEntero = " + numEntero);
       var numFloat = 10.0; //automaticamente con el punto se transforma en tipo double
       System.out.println("numFloat = " + numFloat);
       var numDouble = 10.0;
       System.out.println("numDouble = " + numDouble);*/


        // tipos primitivos
        /* char miVariableChar = 'a';
       System.out.println("miVariableChar = " + miVariableChar);
       
       char varCaracter = '\u0024'; // indicamos a java la asignacion con los codigos unicode
       System.out.println("varCaracter = " + varCaracter);
       char varCaracterDecimal = 36; // Valor decimal del juego de caracteres unicode
       System.out.println("varCaracterDecimal = " + varCaracterDecimal);
       char varCaracterSimbol = '$'; // un caracter especial, podemos copiaar y pegar desde unicode
       System.out.println("varCaracterSimbol = " + varCaracterSimbol);
       
        
       var varCaracter1 = '\u0024'; // indicamos a java la asignacion con los codigos unicode
       System.out.println("varCaracter1 = " + varCaracter1);
       var varCaracterDecimal1 = (char)36; // Valor decimal del juego de caracteres unicode
       System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
       var varCaracterSimbol1= '$'; // un caracter especial, podemos copiaar y pegar desde unicode
       System.out.println("varCaracterSimbol1 = " + varCaracterSimbol1);
       
       int varEnteraChar = '$';
       System.out.println("varEnteraChar = " + varEnteraChar);
       int caracterChar = 'b';
       System.out.println("caracterChar = " + caracterChar);*/


        // tipos primitivos booleanos
        /* var varBool = false;
       System.out.println("varBool = " + varBool);
       
       if (varBool){
           System.out.println("La bandera es verde");
        }
       else{
           System.out.println("La bandera es roja"); 
       }*/
        // algoritmo: es mayor de edad?
        /*var edad = 15;
       var adulto = edad >= 18; // esta es una expresion booleana
       if (adulto){
           System.out.println("Eres mayor de edad");
       }
       else{
           System.out.println("Eres menor de edad");
       }*/


        // conversion de tipos primitivos
        /* var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
         */


        //Pedir un valor
        // var entrada = new Scanner(System.in);
        // System.out.println("Digite su edad:");
        //edad = Integer.parseInt(entrada.nextLine());
        //System.out.println("edad = " + edad);
        // coversion de tipos priitivos en java parte 2
        /*var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var fraseChar = "Programadores".charAt(4);
        System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Digite un caracter ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);*/


        /*int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("solucion de la suma = " + solucion);
        
        solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);
        
        solucion = num1 * num2;
        System.out.println("solucion de la multiplicacion = " + solucion);
        
        solucion = num1 / num2;
        System.out.println("solucion de la division = " + solucion);
        
        var solucion2 = 3.4 / num2;
        System.out.println("solucion2 resultado de la division = " + solucion2);
        
        solucion = num1 % num2; // guarda el residuo entero de la division
        System.out.println("solucion = " + solucion);// 5/4 
        
        if(num1 % 2 == 0)
            System.out.println("Es un numero par");
        else
            System.out.println("Es un numero Impar");*/


         /*int varNum1 = 1, varNum2 = 4;
        var varNum3 = varNum1 + 6 - varNum2;// una operacion
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 += 1; // varNum1 = varNum + 1
        System.out.println("varNum1 = " + varNum1);
        
        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);
        varNum1 *= 5;
        System.out.println("varNum1 = " + varNum1);
        varNum3 /= 4;
        System.out.println("varNum3 = " + varNum3);
        varNum1 %= 6;
        System.out.println("varNum1 = " + varNum1);*/


        // operadores unarios: cambio de signo
        /*var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);
        

        // operador de negacion
        var varC = true;// esta literal por default en java es tipo boolean
        var varD = !varC;// aqui esta invirtiendo el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        

        //operadores unarios de incrementos: preincrementos
        var varE = 9;//se va a modificar su valor
        var varF = ++varE;//simbolo antes de la variable
        //primero se incrementa la variable y despues se usa su valor
        System.out.println("varE= " + varE);//se incremente en la unidad 
        System.out.println("varF = " + varF);// va a sumar uno
        

        //postincremento (el simbolo va despues de la variable)
        var varG = 3;
        var varH = varG++;//primero vamos a ver el valor de la variable y luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        

        //operadores unarios de decrementos
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);// la variable ya esta con decremento
        System.out.println("varJ = " + varJ);
        

        //postdecremento
        var varK = 8;
        var varL = varK--;//primero el valor de la variable, luego que el decremento
        System.out.println("varK = " + varK);//aqui va a decrementar en 1
        System.out.println("varL = " + varL);*/
        
        
        //operadores de igualidad y relacionales
        /*
        var aNum = 5;
        var bNum = 5;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);
        
        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);
        
        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);
        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);
        
        var gVar = aNum >= bNum;//> >= < <= == !=
        System.out.println("gVar = " + gVar);
        
        if(aNum % 2 == 0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es Impar");
        }
        
        var edad = 30;
        var adulto = 18;
        if (edad >= adulto){
            System.out.println("Es mayor de edad ");
        }
        else{
            System.out.println("Es menor de edad");
        }*/


        // operador condicional and
        /*var valorA = 11;
        var valorMinimo = 0;// rango del 0 al 10
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;

        if (respuesta) {
            System.out.println("Esta dentro del rango establecido");
        } else {
            System.out.println("Esta fuera del rango establecido");
        }

        var vacaciones = false;
        var diaLibre = false;
        if (vacaciones || diaLibre) {
            System.out.println("Papa puede asistir al juego de su hijo");
        } else {
            System.out.println("Papa no puede asistir al juego de su hijo");
        }
    
        //operdadores ternario
        var resultadoT = (5 > 4 ) ? "verdadero" : "falso";
        System.out.println("resultadoT = " + resultadoT);
        var numeroT = 7;
        resultadoT = (numeroT % 2 == 0) ? "es par" : "es impar";*/
        
        
                
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);// 6
        System.out.println("y = " + y);//9
        System.out.println("z = " + z);//16
        
        var solucionAritmetica = 4 + 5 * 6 / 3;//4 + ((5 * 6)/ 3)= 30/ 3 = 10 + 4
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        solucionAritmetica = (4 + 5) * 6 / 3;// 4 + 5 = 9 * 6 = 54 / 3 = 18
        System.out.println("solucionAritmetica = " + solucionAritmetica);
    }

}
