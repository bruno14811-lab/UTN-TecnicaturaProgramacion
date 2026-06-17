// tipos de datos javaScript
/*
la sintaxis en lo que es comentarios
es muy similar a la de java
realmente diriamos que es identica
*/
var nombre = "bruno"; // tipo string
console.log(typeof nombre);
nombre = "7";
console.log(typeof nombre);
nombre = 12.3;
console.log(typeof nombre);
var numero = 3000; // tipo numerico
console.log(numero);

var objeto= {
    nombre: "bruno",
    apellido: "sosa",
    telefono: "22222222"        
} // tipo objeto
console.log(typeof objeto);

//tipo de dato boolean
var bandera = true;
console.log(bandera);
// tipo de dato function
function miFuncion(){
    console.log(typeof miFuncion);
}

// tipo de dato symbol
var simbolo = Symbol("mi simbolo");
console.log(typeof simbolo);    

// tipo de dato clase
class Persona{ 
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(typeof Persona);

// tipo de dato undefined
var x;
console.log(typeof x);

x = undefined; // undefined es un valor asignable, pero no es recomendable asignarlo, es mejor dejar la variable sin inicializar
console.log(typeof x);

//null: significa ausencia de valor, es un valor asignable
var y = null; // null no es un tipo de dato, perosu origen es object
console.log(typeof y); // devuelve object, pero no es un objeto, es un valor especial que representa la ausencia de valor

// tipo de dato array y empty string
var autos = ["Citroen", "audi", "BMW","Ford"]; // tipo array, es un objeto
console.log(typeof autos);// preguntamos que tipo de dato es:

var z = "";
console.log(z) // esto se refiere a un string vacio, es un tipo de dato string, pero no tiene valor, es un valor especial que representa la ausencia de valor en un stringue es una cadena vacia
console.log(typeof z); 

