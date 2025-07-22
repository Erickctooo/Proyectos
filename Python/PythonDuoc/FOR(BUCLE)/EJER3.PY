import os
os.system("cls")
import random
contPaPo=0
sumaPaPo=0
mayor=0
menor=0
solodos=0
numeros=int(input("CUANTOS NUMEROS DESEA GENERAR: "))
for i in range(numeros):
    x =random.randint(-200,201);
    print(str(x) + "\t");
    if(x>0 and x%2==0):
        contPaPo+=1
        sumaPaPo+=x
    if(x>mayor):
        mayor=x
    elif(x<menor):
        menor=x
    if(x>-100 and x<100):
        solodos+=1
print("la suma de los pares positivos es: ",sumaPaPo)
print("el numero mayor generado es:", mayor, "y el numero menor es :", menor)
print("la cantidad de numeros de 2 digitos son: ",solodos)










