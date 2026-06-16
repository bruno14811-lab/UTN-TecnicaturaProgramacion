# EJERCICIO 1: CALCULAR LA SUMA "N" PRIMEROS NUMEROS

N = int(input("Digite la cantidad de números a sumarse: "))

suma = 0

for i in range(1, N + 1):
    suma = suma + i

print("La suma es:", suma)