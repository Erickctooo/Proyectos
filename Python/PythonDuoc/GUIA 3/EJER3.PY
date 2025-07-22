import os
from shutil import copyfileobj
os.system("cls")
import random
num=int(input("¿Cuantos numeros desea generar? "))
ciclo=0
sumaPAPO=0
contPAPO=0
mayor=0
menor=0
solodos=0
while ciclo < num:
    ciclo+=1
    x = random.randint(-200,200);
    print(str(x) + "\t")
    if(x>0 and x%2==0 ):
        contPAPO+=1
        sumaPAPO+=x
    if(x>mayor):
        mayor=x
    elif(x<menor):
        menor=x
    if(x>-100 and x<100):
        solodos+=1
print("La suma de los numeros pares positivos generados es: ",sumaPAPO)
print("El mayor numero generado es: ",mayor, "El numero menor generado es: ",menor)
print("La cantidad de numeros generados con dos digitos son: ",solodos)

    

