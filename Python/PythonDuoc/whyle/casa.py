import os
os.system("cls")

print("persona 1")
ed1=int(input("ingrese edad"))
gen1=input("ingresar sexo F:femenino M:masculino").upper()

print("persona 2")
ed2=int(input("ingrese edad"))
gen2=input("ingresar sexo F:femenino M:masculino").upper()

print("persona 3")
ed3=int(input("ingrese edad"))
gen3=input("ingresar sexo F:femenino M:masculino").upper()

print("persona 4")
ed4=int(input("ingrese edad"))
gen4=input("ingresar sexo F:femenino M:masculino").upper()

print("persona 5")
ed5=int(input("ingrese edad"))
gen5=input("ingresar sexo F:femenino M:masculino").upper()
contM=0
contF=0
if(gen1=="F"):
    contF+=1
else:
    contM+=1

if(gen2=="F"):
    contF+=1
else:
    contM+=1

if(gen3=="F"):
    contF+=1
else:
    contM+=1

if(gen4=="F"):
    contF+=1
else:
    contM+=1

if(gen5=="F"):
    contF+=1
else:
    contM+=1
print("el total de hombres es",contM)
print("el total de mujeres es",contF)


