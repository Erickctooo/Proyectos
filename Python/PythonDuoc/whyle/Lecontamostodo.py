import os
os.system("cls") #limpio la pantalla
print("Persona 1")
ed1=int(input("Ingrese edad "))
gen1=input("Ingrese genero F:femenino M:masculino ").upper()
#.upper() convierte a mayúsculas .lower() a minúsculas
print("Persona 2")
ed2=int(input("Ingrese edad "))
gen2=input("Ingrese genero F:femenino M:masculino ").upper()
print("Persona 3")
ed3=int(input("Ingrese edad "))
gen3=input("Ingrese genero F:femenino M:masculino ").upper()
print("Persona 4")
ed4=int(input("Ingrese edad "))
gen4=input("Ingrese genero F:femenino M:masculino ").upper()
print("Persona 5")
ed5=int(input("Ingrese edad "))
gen5=input("Ingrese genero F:femenino M:masculino ").upper()
contM=0
contF=0
if(gen1=="F"):
	contF+=1 #contF=contF+1
else:
	contM+=1

if(gen2=="F"):
	contF+=1 #contF=contF+1
else:
	contM+=1

if(gen3=="F"):
	contF+=1 #contF=contF+1
else:
	contM+=1

if(gen4=="F"):
	contF+=1 #contF=contF+1
else:
	contM+=1

if(gen5=="F"):
	contF+=1 #contF=contF+1
else:
	contM+=1
print("El total de hombres es ",contM)
print("El total de mujeres es ",contF)
	

