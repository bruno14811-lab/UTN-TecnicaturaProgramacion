// Ejercicio para encontrar numeros pares
let parInpar = 0;
if (parInpar % 2 == 0) {
    console.log("El número es par");
}else {
    console.log("El número es impar");
}

// Ejercicio mayor de edad
let edad = 20, adulto = 18;
if (edad >= adulto) {
    console.log("Es mayor de edad");
}
else {
    console.log("Es menor de edad");
}

// Ejercicio: dentro de un rango
let dentroRango = 5; // aqui vamos a ir cambiando el valor
let valMin = 0, valMax = 10;

if (dentroRango >= valMin && dentroRango <= valMax) {
    console.log("El valor está dentro del rango");
} else {
    console.log("El valor no está dentro del rango");
}

// Ejercicio: Si el padre puede asistir al juego de su hijo
let vacaciones = true, diaDeDescanso = false;

if (vacaciones || diaDeDescanso) {
    console.log("El padre puede asistir al juego de su hijo");
} else {
    console.log("El padre no puede asistir al juego de su hijo");
}
// Ejercicio: Operadores ternarios
let resultado2 = 1 > 2  ? "verdadero" : "falso";
console.log(resultado2) // Devuelve "falso" porque 1 no es mayor que 2.
let numero = 9;
resultado2 = numero % 2 === 0 ? "Es un numero par" : "Es un numero impar";
console.log(resultado2) // Devuelve "impar" porque 9 no es divisible por 2.

// EJERCICIO: convertir un string a numero
let miNumero = "21"; // es una cadena
console.log(typeof miNumero);
let edad2 = Number(miNumero); //esta es una funcion
console.log(typeof edad2);
//funcion isNan
if (isNaN(edad2 >= 18)) { // no es un numeor = is not a number(devuelve un booleano)
    console.log("Puedes votar");
} 
else {
    if(edad2 >=18){
        console.log("puedes votar");
    }
    else{
        console.log("Muy joven para votar");
    }
}    
//operador ternario
let resultado3 = edad2 >= 18 ? "Puedes votar" : "Muy joven para votar";
console.log(resultado3);


