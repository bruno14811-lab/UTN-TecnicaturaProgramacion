# EJECICIO Conversión de Número a texto
num = int(input("Difite un numero en el rango del 1 al 3"))
numTexto = ""
if num == 1:
    numTexto = "Numero uno"
elif num == 2:
    numTexto = "Numero dos"
elif num == 3:
    numTexto = "Numero tres"
else:
    numTexto = "Has ingresado un numero fuerda de rango"
print(f"el numeor ingresado es: {num} - {numTexto}")

    