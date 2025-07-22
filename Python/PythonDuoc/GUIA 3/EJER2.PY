import os
os.system("cls")

ciclo=0
contED=0
sumaED=0
contEH=0
sumaEH=0
contEF=0
mayor30=0
mayor=0
acum=0
personas=int(input("¿cuantas personas desea ingresar?: "))
while ciclo < personas:
    ciclo+=1
    print("***PERSONA  "+str(ciclo)+"***")
    edad=int(input("ingresar edad: "))
    contED+=1
    sumaED+=edad
    if(edad>mayor):
        mayor=edad
    genero=(input("ingrese genero m:MASCULINO f:FEMENINO :"))
    if(genero=="m"):
        contEH+=1
        sumaEH+=edad
    else:
        contEF+=1
        if(edad>30):
            mayor30+=1
print("El promedio de las edades es: ",sumaED/contED)
print("El promedio de las edades de los hombres es: ",sumaEH/contEH)
print("La cantidad de mujeres mayores a 30 años es: ",mayor30)
print("La mayor edad ingresada es: ",mayor)



