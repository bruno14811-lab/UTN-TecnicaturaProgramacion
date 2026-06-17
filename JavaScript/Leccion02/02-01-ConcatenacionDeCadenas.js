var nombre = "bruno";
var apellido = "sosa";
var nombreCompleto = nombre + " " + apellido;   // primera concatenacion
console.log(nombreCompleto);
var nombreCompleto2 = "bruno" + " " + "sosa"; // segunda concatenacion
console.log(nombreCompleto2);
var juntos = nombre + 219; // lee de izq a der siguiendo la cadena lee el numero como str
console.log(juntos);
juntos = nombre + 78 + 17;
console.log(juntos); 
juntos = 78 + 17 + nombre; 

nombre += apellido; // tercera concatenacion usando el operador de simplidicacion
console.log(nombre);

let x, y; // se puede cear varias variables dentro de una misma linea
x = 17, y = 21; // se puede hacer asignacion de varias variables dentro de una misma linea
let z = x + y; // se asigna el valor de la operacion
console.log(z);

let _1num = 31 // no utilizar numeros para iniciar el nombre de una variable
let rompiendon = "romper"; // no se puede usar palabras reservadas como nombre de variable

console.log(_1num);
console.log(rompiendon);

// hoy ya no se usa var, se utiliza let y const
let nombre2 = "bruno"; // tipo string
console.log(nombre2);

const apellido2= "sosa"; 
console.log(apellido2);
//apellido2 = "sosa2"; // no se puede reasignar un valor 
console.log(apellido2);