import os
os.system("cls")
i=1
contP=0
contN=0
while(i<=10):
    print("numero ",i)
    numero=int(input("ingresar numero:"))
    if(numero>0):
        contP+=1
    else:
        contN+=1
    i+=1
print("los numeros positivos son:",contP)
print("los numeros negativos son:",contN)
