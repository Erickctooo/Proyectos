import os
os,os.system('cls')




def sumar(numero,numero2):
    suma= numero + numero2
    return suma
    


for i in range(3):
    numero = int(input("ingrese primer numero para suma: "))
    numero2 = int(input("ingrese segundo numero para suma: "))
    print('El resultado desumar los numeros ingresados es: '+str(sumar(numero,numero2)))
   

