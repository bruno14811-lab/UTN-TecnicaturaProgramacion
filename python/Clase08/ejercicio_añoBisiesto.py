# diseñar un programa que ingresando un año, nos devuelva por consola
# si es un año bisiesto o no, repetir la accion
# hasta que el usuario lo decida
opcion = 0
while opcion != 1:
    print("Comprobamos que año es bisiesto")
    num = int(input("Ingrese el año: "))
    if ((num % 4 == 0) and (num % 100 != 0) or num % 400 == 0):
        print("El año es bisiesto")
    else:
        print("El año no es bisiesto")

    opcion = int(input("Para salir digite 1: "))
