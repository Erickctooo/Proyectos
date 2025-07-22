import os
os.system("cls")
i=1
contP=0
contI=0
while(i<=10):
    print("numero ",i)
    numero=int(input("ingrese numero:"))
    if(numero% 2==0):
        contP+=1
    else:
        contI+=1
    i+=1
print("la cantidad de numeros impares es",contI)
print("la cantidad de numeros pares es",contP)



