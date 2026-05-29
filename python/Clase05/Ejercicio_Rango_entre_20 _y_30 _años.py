# EJERCICIO: RANGO ENTRE LAS EDADES 20 Y 30 AÑOS


edad = int(input("ingrese su edad: "))
edadMinima = edad >= 20 and edad < 30
print(edadMinima)
edadMaxima = edad >= 30 and edad <40
print(edadMaxima)

#if edadMinima or edadMaxima:
if (20 <= edad < 30) or (30 <= edad < 40): # Sintaxis simplificada de los operadores and
    print("estas dentro del rango de los 20 a 30 años")
# if edadMinima:
       # print("estas dentro del rango de los 20 años")
    #elif edadMaxima:
        #print("estas dentro del rango de los 30 años")
else:
    print("estas fuera del rango de los 20, 30 años")


