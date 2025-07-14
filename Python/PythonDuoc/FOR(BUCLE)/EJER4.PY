
import os
from secrets import choice
os.system("cls")
import random
num=int(input("CANTIDAD DE TRABAJADORES DE LA EMPRESA: "))
tipocontrato=['LICENCIADO','TECNICO','OBRERO']
trabajadores=[]
edad=[]
tpcontrato=[]
sueldtra=[]
totalP=0
mayor=0
save=str()
contM60=0
for i in range(num):
     print("---TRABAJADOR "+str(i+1)+"---")
     nombre=str(input("NOMBRE DEL TRABAJADOR: "))
     x=random.randint(18,81)
     print("EDAD DE TRABAJADOR: ",x)
     contrato= choice(tipocontrato)
     print("TIPO DE CONTRATO: ",contrato)
     hrs=int(input("CANTIDAD DE HORAS TRABAJADAS: "))
     if(contrato=="LICENCIADO"):
          sueldo=hrs*10250
          totalP+=sueldo
     if(contrato=="TECNICO"):
          sueldo=hrs*7120
          totalP+=sueldo
     if(contrato=="OBRERO"):
          sueldo=hrs*5200
          totalP+=sueldo
     if(sueldo>mayor):
          mayor=sueldo
     if(x>60):
          contM60+=1
     trabajadores.append(nombre)
     edad.append(x)
     tpcontrato.append(contrato)
     sueldtra.append(sueldo)
print("LA NOMBRE DE LOS TRABAJADORES: ",trabajadores)
print("LA EDAD DE LOS TRABAJADORES ES: ",edad,)
print("EL TIPO DE CONTRATO DE CADA TRABAJADOR: ",tpcontrato)
print("EL SUELDO DE CADA TRABAJADOR ES: ",sueldtra)
print("EL TRABAJADOR CON MAS SUELDO ES: ",save,mayor)
print("EL TOTAL PAGADO POR LA EMPRESA A SUS TRABAJADORES ES: $",totalP)
print("EL TOTAL DE TRABAJADORES MAYORES DE 60 AÑOS SON: ",contM60)












    
