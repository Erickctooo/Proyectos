import os
os.system("cls")
i=1
contM=0
contF=0
while(i<=5):
    print("persona ",i)
    ed1=int(input("ingrese edad"))
    gen1=input("ingresar sexo F:femenino M:masculino:").upper()

    if(gen1=="F"):
        contF+=1
    else:
        contM+=1
    i+=1
    
print("el total de hombre es ",contM)
print("el total de mujeres es",contF)
