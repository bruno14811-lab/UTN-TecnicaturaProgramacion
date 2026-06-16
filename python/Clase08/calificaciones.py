# EJERCICIO 4: Supongamos que se tiene un conjunto de calificaciones de un
# grupo ed 10 alumnos. Realizar un algoritmo para calcular la
# calificacion promedio y la calificacion mas baja de to el grupo. (Pseudocodigo)

suma = 0
calificacionBaja = 99999

for i in range(10):
    print(i + 1, ". Digite una calificacion: ")
    calificacion = float(input())

    suma += calificacion

    if calificacion < calificacionBaja:
        calificacionBaja = calificacion

calificacionPromedio = suma / 10

print("La calificacion promedio es:",calificacionPromedio)
print("La calificacion mas baja es:",calificacionBaja)

