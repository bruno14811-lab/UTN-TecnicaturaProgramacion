# EJERCICIO: TIENDA DE LIBROS
print("Digite los siguientes datos del libro")
nombre = input("Digite el nombre del libro: ")
ID = int(input("Digite el ID del libro: "))
precio = float(input("Digite el precio del libro: "))
envioGratuito = input("indicar si el libro es gratuito (True/False): ")
if envioGratuito == "True":
    envioGratuito = True
elif envioGratuito == "False":
    envioGratuito = False
else:
    envioGratuito = "El valor es incorrecto, debe escribir True/False"
print(f'''
        Nombre: {nombre}
        Id: {ID}
        Precio: {precio}
        Envio gratuito: {envioGratuito}
''')
            
