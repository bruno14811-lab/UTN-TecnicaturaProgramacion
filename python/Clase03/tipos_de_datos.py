# tipos de datos
a: str = "hola alumnos"
print(type(a))
a = 10
print(type(a))

# tipos de datos booleanos
a = True
print(type(a))
a = False
print(type(a))


# tipos int, float, String, Bool
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "hola alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))


# manejo de cadenas (String)
miGrupoFavorito = "los fundamentalistas: ""the best rock band"
print("mi grupo favorito es: ", miGrupoFavorito)
miGrupoFavorito = "los fundamentalistas"
caracteristicas = "the best rock band"
print("mi grupo favorito es: ", miGrupoFavorito, caracteristicas)
numero1 = "7"
numero2 = "8"
print(numero1 + numero2) # no puede sumar un string con otro string
print(int(numero1) + int(numero2)) # estamos convirtiendo el String en entero "int"


# tipos de datos booleanos (bool)
miBoleano = True
print(miBoleano)
miBoleano = False
print(miBoleano)
miBoleano = 1 > 2
print(miBoleano)
miBoleano = 1 > 2
print(miBoleano)


# condicional doble "if", "else"
if miBoleano:
    print("mi resultado es verdadero ")
else:
    print("mi resultado es falso")


# procesar entrada del usuario
# funcion "input"
resultado = input("digite un numero:") # input nos regresa un dato tipo String
print(resultado)

# conversion de la entrada de datos
numero1 = (input("digite el primer numero: ")) # cadena tipo string
numero2 = (input("digite el segundo numero: "))
resultado = numero1 + numero2
print("el resultado es: ", resultado)
numero1 = ((int)(input("digite el primer numero: "))) # cadena tipo "int" para que lo tome como un entero
numero2 = ((int)(input("digite el segundo numero: "))) # transforma tipo string a entero (int)
resultado = numero1 + numero2
print("el resultado es: ", resultado)





