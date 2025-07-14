import os
os.system("cls")
from random import*
genero=["HOMBRE","MUJER"]
indice=randrange(len(genero))
genero=genero[indice]
apellidos=[]
generos=[]
notasparciales=[]
notafinal=[]
res="S"
i=1
while (res=="S"):
    print("INGRESANDO EL ALUMNO: ",i)
    apellido=str(input("INGRESAR APELLIDO DEL ALUMNO: ")).upper()
    print("GENERO: ",genero)
    n=uniform(1,7)
    n1=n*0.28
    n2=n*0.34
    n3=n*0.38
    notas=(n1,n2,n3)
   
    i+=1
    res=input("DESEA INGRESAR OTRO ALUMNO S/N")
    if(res=="N"):
        print("GRACIAS POR ESTE PROGRAMA")
    apellidos.append(apellido)
    generos.append(genero)
    notasparciales.append(notas)
    
print("Los apellidos de los alumnos son: ",apellidos)
print("LAS NOTAS PARCIALES DE LOS ALUMNOS SON: ",notasparciales)




