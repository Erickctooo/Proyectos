from ast import*
import os
from secrets import choice
os.system("cls")
import random
ciclos=0
totalPA=0
mayor=0
mayor60=0
trabajadores=[]
edad=[]
tpcontrato=[]
sueldtra=[]
tipocontrato=["LICENCIADO","TECNICO","OBRERO"]
cuantos=int(input("CUANTOS TRABAJADORES DESEA INGRESAR: "))
while(ciclos<cuantos):
     ciclos+=1
     print("***TRABAJADOR "+str(ciclos)+"***")
     nombre=str(input("NOMBRE DEL TRABAJADOR: "))
     X = random.randint(18,80);
     print("EDAD DEL TRABAJADOR: ",X)
     Contrato=choice(tipocontrato)
     print("TIPO DE CONTRATO: ",Contrato)
     hrs=int(input("CUANTAS HORAS TRABAJADAS: "))
     if(Contrato=="LICENCIADO"):
        sueldo=hrs*10250
        totalPA+=sueldo
     if(Contrato=="TECNICO"):
         sueldo=hrs*7120
         totalPA+=sueldo
     if(Contrato=="OBRERO"):
         sueldo=hrs*5200
         totalPA+=sueldo
     if(sueldo>mayor):
         mayor=sueldo
     if(X>60):
         mayor60+=1
     trabajadores.append(nombre)
     edad.append(X)
     tpcontrato.append(Contrato)
     sueldtra.append(sueldo)
print("LA NOMBRE DE LOS TRABAJADORES: ",trabajadores)
print("LA EDAD DE LOS TRABAJADORES ES: ",edad,)
print("EL TIPO DE CONTRATO DE CADA TRABAJADOR: ",tpcontrato)
print("EL SUELDO DE CADA TRABAJADOR ES: ",sueldtra)
print("EL TRABAJADOR CON MAS SUELDO ES: ",mayor)
print("EL TOTAL PAGADO POR LA EMPRESA A SUS TRABAJADORES ES: $",totalPA)
print("EL TOTAL DE TRABAJADORES MAYORES DE 60 AÑOS SON: ",mayor60)

    
    

     




    
