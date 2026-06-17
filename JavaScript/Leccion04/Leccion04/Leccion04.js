// Ejercicio 1: Calcula estacion del año 
let mes = 4;
let estacion;
if (mes == 1 || mes == 2 || mes == 12) {
    estacion = "Verano";
}
else if (mes == 3 || mes == 4 || mes == 5) {
    estacion = "Otoño";
}else if (mes == 6 || mes == 7 || mes == 8) {
    estacion = "Invierno";
}else if (mes == 9 || mes == 10 || mes == 11) {
    estacion = "Primavera";
}else {
    estacion = "Mes incorrecto";
}
console.log("El mes corresponde a la estacion: " + estacion);

// Ejercicio 2: Hora del dia
/*
de 6 a 11 nos saluda "good morning"
de 12 a 16 nos saluda "good afternoon"
de 17 a 19 nos saluda "good evening"
de 20 a 23 nos saluda "good night"
trabajaremos con 24 horas
*/
let horaDia = 23;
let mensaje ="";
if (horaDia >= 6 && horaDia <= 11) {
    mensaje = "good morning";
} else if (horaDia >= 12 && horaDia <= 16) {
    mensaje = "good afternoon";
} else if (horaDia >= 17 && horaDia <= 19) {
    mensaje = "good evening";
} else if (horaDia >= 20 && horaDia <= 23) {
    mensaje = "good night";
}
else {
    mensaje = "hora no valida";
}  
console.log(mensaje);



// Estrucura Switch(la sintaxis es igual a java)
switch (mes) {  
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Mes incorrecto";
        break;
}
// ampliando el uso de var let y const
/*
con var puedes reasignar el cualquier momento
este forma parte del ambito global
un error es que se sobreescriba 
*/
var nombre = "Juan";
nombre = "Pedro";
console.log(nombre);

function saludar() {
    var nombre3 = natalia;
    console.log(nombre3);
}
//console.log(nombre3); // aqui no lee el dato en la funcion


if (true){
    var edad = 34;
    console.log(edad); 
}
console.log(edad); // en la funcion funciono correctamente, en la estructura if fallo


/*
let: esta puede ser reasignada en cualquier momento 
la diferencia es que su ambito es de bloque,
solo disponible dentro del un bloque de llaves
o dentr de una funcion
*/
function saludar2() {
    let nombre2 = "bruno";
    console.log(nombre2);
}
//console.log(nombre2);

if(true){
    let edad2 = 33;
    console.log(edad2);
}
//console.log(edad2);
/*
const se utiliza para valores constantes que no pueden ser reasigados
*/

const fechaNacimiento = 2006;
console.log(fechaNacimiento);
//fechaNacimiento = 2003;
//console.log(fechaNacimiento) // solo se ejecuta el consola anterior




// evitar repetir código, 
// DRY: Don't Repeat Yourself
let days = 1
switch (days) {
    case 1:
        console.log("Lunes");
        break;
    case 2:
        console.log("Martes");
        break;
    case 3:
        console.log("Miércoles");   
        break;
    case 4:
        console.log("Jueves");
        break;  
    case 5:
        console.log("Viernes");
        break;
    case 6:
        console.log("Sábado");
        break;
    case 7:
        console.log("Domingo");
        break; 
    default:
        console.log("Error en el número de día");
        break;       
}  


// esta es la opcion mejorada
let days2 = ["Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"];
function getDay(n) {
    if (n < 1 || n > 7){
        throw new Error("out of range");
    }
    return days2[n - 1];
}           
console.log(getDay(5));
// Ejercicio meses del año con switch, debe simplificar y agreagar eficacia con el concepto
// crear una funcion como la de getday para los meses del año
let monthNumber = [
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    ];
    function getMonthName(monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            return "Número de mes inválido, debe estar entre 1 y 12.";
        }
return monthNumber[monthNumber - 1];
}
// Ejemplo de uso
console.log(getMonthName(1)); // Salida: Enero
console.log(getMonthName(5)); // Salida: Mayo
console.log(getMonthName(12)); // Salida: Diciembre
console.log(getMonthName(0)); // Salida: Número de mes inválido, debe estar entre 1 y 12.  