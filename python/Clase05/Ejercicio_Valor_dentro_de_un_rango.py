# EJERCICIO: VALOR DENTRO DE UN RANGO

num = int(input("ingrese un valor: "))
numMinimo = 0
numMaximo = 5
dentroRango = (num >= numMinimo and num <= numMaximo)
if dentroRango:
    print(f"El numero {num} esta dentro del rango")
else:
    print(f"El numero {num} esta fuera del rango")






