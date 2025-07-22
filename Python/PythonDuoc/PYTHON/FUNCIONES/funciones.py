def validar_numero(cadena):
    while not cadena.isdigit():
        cadena=input("Error, Ingrese un numero. ")
    return int(cadena)

cadena=input("ingrese un numero: ")
numero=validar_numero(cadena)
print("esto es un numero: ",numero)
