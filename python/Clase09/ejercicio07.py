## calcular salario y su suma

i = 1
suma = 0
while i <= 5:
    print(f"\nSalario del empreado {i}")

    horas = float(input("Digite las horas trabajadas: "))
    tarifa = float(input("Digite la tarifa por hora> "))

    salario = horas * tarifa

    print(f"El salario es> ${salario}")
    suma = suma + salario
    i = i + 1
print(f"\nLa suma de todos los salarios es:${salario}")

