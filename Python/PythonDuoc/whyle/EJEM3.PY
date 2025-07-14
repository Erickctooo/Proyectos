import os


import os
os.system("cls")
opcion=""
while opcion!="3":
    print("Bienvenido a tu calculadora")
    print("1.-suma")
    print("2.-resta")
    print("3.-salir")
    opcion=input("ingrese una opcion: ")
    if(opcion=="1"):
        n1=int(input("ingrese un numero 1: "))
        n2=int(input("ingrese un numero 2: "))
        total=n1+n2
        print("la suma de los dos numero es:",total)
    elif(opcion=="2"):
        n1=int(input("ingrese un numero 1: "))
        n2=int(input("ingrese un numero 2: "))
        total=n1-n2
        print("la resta de los dos numero es:",total)
    elif(opcion=="3"):
        print("Gracias por usar tu calculadora")
    else:
        print("ingrese una opcion correcta")





