import os
os.system("cls")
contP=0
contPO=0
sumaPO=0
sumaI=0
contI=0
veces=int(input("cuantos numeros desea ingresar"))
for i in range(veces):
    print("---NUMERO "+str(i+1)+"---")
    num=int(input("ingrese un numero:"))
    if(num% 2==0):
        contP+=1
    else:
        sumaI+=num
        contI+=1
    if(num>0):
        contPO+=1
        sumaPO+=num
    if(num>0):
        contPO+=1
        sumaPO+=num
print("la cantidad de numeros pares es :",contP)
print("la suma de de los numeros positivos es :",sumaPO)
print("el promedio de los numeros impares es :",sumaI/contI)




