nElementos = int(input("Digite la cantidad de elementos a ingresar: "))
sumaPares = 0
conteoPares = 0
sumaImpares = 0
conteoImpares = 0
for i in range(nElementos):
    num = int(input(f"Ingrese el numero {i + 1}: "))
    if num % 2 == 0:
        sumaPares += num
        conteoPares += 1
    else:
        sumaImpares += num
        conteoImpares += 1

## calcular promedio de impares
if conteoImpares > 0:
    promedioImpares = sumaImpares / conteoImpares
else:
    promedioImparaes = 0

print("\nResultado:")
print("Suma de numeros pares:", sumaPares)
print("Cantidad de numeros pares:",conteoPares )
print("Promedio de numeros impares:",promedioImpares)