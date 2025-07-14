import os
os.system("cls")
acum=0
cuantos=int(input("cuantos numeros desea ingresar: "))
ciclo=0
contP=0
sumaP=0
sumaI=0
contI=0
while ciclo<cuantos:
    num=int(input("ingrese un numero: "))
    acum+=num
    ciclo+=1
    if(num%2==0):
        contP+=1
    else:
        sumaI+=num
        contI+=1
        

    if(num>0):
        sumaP+=num
print("La cantidad de numeros PARES ingresados son: ",contP)
print("La suma de los numeros POSITIVOS es: ",sumaP)
print("El promedio de los numeros impares es: ",sumaI/contI)



