import os
os.system("cls")
i=1
contM=0
contF=0
while(i<=5):
	print("Persona ",i)
	ed1=int(input("Ingrese edad "))
	gen1=input("Ingrese genero F:femenino M:masculino ").upper()
	
	if(gen1=="F"):
		contF+=1 
	else:
		contM+=1
	i+=1
print("El total de hombres es ",contM)
print("El total de mujeres es ",contF)
	