import os
os.system("cls")
contED=0
sumaedadhombre=0
mayor30=0
sumasED=0
contM=0
contF=0
mayor=0
veces=int(input("CUANTAS PERSONAS DESEA INGRESAR :"))
for i in range(veces):
    print("---PERSONA "+str(i+1)+"---")
    edad=int(input("ingresar edad: "))       
    contED+=1
    sumasED+=edad
    if(edad>mayor):
        mayor=edad
    gen=(input("ingresar genero F:femenino M:masculino : ")).upper()
    if(gen=="M"):
        contM+=1
        sumaedadhombre+=edad
    else:
        contF+=1
        if(edad>30):
           mayor30+=1
print("el promedio de edades es :",sumasED/contED)
print("el promedio de la edad de losn hombre es:",sumaedadhombre/contM)
print("la cantidad de mujeres mayores a 30 años es :",mayor30)
print("la mayor edad ingresada es :",mayor)