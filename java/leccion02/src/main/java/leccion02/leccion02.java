public class leccion02 {
    public static void main(String[] args){
       
        var condicion = false;
        if (condicion){
            System.out.println("Condicion Verdadera");//Condicional Simple
        }
        else{
            System.out.println("Condicion Falsa");//Condicional Doble
        }
        
        var numero = 2;
        var numeroTexto = "Numero Desconocido";
        
        if (numero ==1){
            numeroTexto = "Numero Uno";
            }   
        else if (numero == 2){
            numeroTexto = "Numero Dos";
        }
        else if (numero == 3){
            numeroTexto = "Numero Tres";
        }
        else if (numero == 4){
            numeroTexto = "Numero Cuatro";
        }
        else {
            numeroTexto = "Numero no encontrado";
        }
        System.out.println("NumeroTexto = "+ numeroTexto);
    }
}