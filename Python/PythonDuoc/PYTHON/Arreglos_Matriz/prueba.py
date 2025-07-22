import os
import funcionesprueba as ff
import numpy as np 

matriz=np.empty((6,6 ))
ff.llenarmatriz(matriz)
op=0
while(op!=6):
    os.system("cls")

    print("        Raviikong    ")
    print("  ********************* ")
    print("1.   Mostrar camarotes disponibles ")
    print("2.   Comprar pasaje")
    print("3.   Totales")
    print("4.   Anular venta")
    print("5.   Listado de pasajeros")
    print("6.   Salir")
    while(True):
        try:
            op=int(input("Elija una opción [1,2,3,4,5,6 ] "))
            if(op>0 and op<7):
                break
            else:
                print("Elija una opción [1,2,3,4,5,6 ]")
        except ValueError:
            print("Debe ser un número entero!!")
    if (op==1):
        print(matriz)
        os.system("pause")
        #ff.mostrarmatriz(matriz)


