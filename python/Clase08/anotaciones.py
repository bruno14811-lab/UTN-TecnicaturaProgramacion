# Ejercicio 3: Leer 10 numeros e imprimir cuantos son positivos
# cuantos negativos y cuantos neutros
conteoPositivos = 0
conteoNegativos = 0
conteoNeutros = 0

for i in range(1, 11):
    num = int(input(f"{i}. Digite un numero: "))

    if num == 0:
        conteoNeutros = conteoNeutros + 1
    else:
        if num < 0:
            conteoNegativos = conteoNegativos + 1
        else:
            conteoPositivos = conteoPositivos + 1

print("La cantidad de positivos es: ", conteoPositivos)
print("La cantidad de negativos es: ", conteoNegativos)
print("La cantidad de neutros es: ", conteoNeutros)
