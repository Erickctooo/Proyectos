import os
os.system("cls")

num=input(("ingrese un numero: "))
while not num.isdigit():
    print("por favor ingrese correctamente")
    os.system("pause")
    num=input("ingrese un numero: ")
    break
    

    
