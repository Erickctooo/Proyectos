import os
os.system("cls")
i=1
suma=0
while(i<=10):
    print("numero ",i)
    numero=int(input("ingrese numero:"))
    if(numero>30):
        suma+=numero
    i+=1
print("la suma de los numeros mayores que 30 es ",suma)
