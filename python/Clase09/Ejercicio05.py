# Ejercicio 5: calcular el factorial de un numero dmayor o igual a 0.

num = int(input("Digite un número: "))

while num < 0:
    print("El número debe ser mayor o igual a 0")
    num = int(input("Digite un número: "))

i = 1
factorial = 1

while i <= num:
    factorial = factorial * i
    i = i + 1

print("El factorial es:", factorial)