sumar = lambda numero,suma: suma + numero



def calcular_suma_elemnetos(suma=0):
    try:
        cantidad_elmentos=int(input("ingrese la cantidad de elementos que desea sumar: "))
    except:
        print("hola desde la excepcion")
    for indice in range(cantidad_elmentos):
        try:
            numero = int(input("ingrese el numero quie desea agregar a la suma: "))
        except:
            print("hola desde la excepcion")
        suma = sumar(numero,suma)
    print(f"la suma de los elementos ingresados es: ",(suma))


calcular_suma_elemnetos()