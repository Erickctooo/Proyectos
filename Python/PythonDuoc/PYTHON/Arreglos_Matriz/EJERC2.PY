###SE LE PIDE AL USUARIO QUE INGRESE EL LARGO DEL ARREGLO
##EN EL CMD PONGO PIP INSTALL NUMPY

import numpy as np
import os

while(True):
    try:
        n=int(input("ingrese largo del arreglo, debe ser entero positivo "))
        if(n>0):
            break
        else:
            print("debe ingresar un numero positivo")
    except ValueError:
        print("debe ser numero entero")
#aqui vamos a llenar el arreglo usando el ciclo for
arreglito=[]#deino mi arreglo o vector sin un largo especifico
for i in range(n):
    while(True):
        try:
            num=int(input("ingrese un numero para llenar el arreglo"))
            break
        except ValueError:
            print("debe ser un numero ")
    arreglito.append(num)

for i in range(n):
    print(arreglito[i])
print(arreglito)
    

    
