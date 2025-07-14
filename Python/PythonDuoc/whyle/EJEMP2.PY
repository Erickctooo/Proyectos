acum=0
cuantos=int(input("¿cuantos numeros desea ingresar"))
ciclo=0
while ciclo< cuantos:
    num=int(input("ingrese un numero: "))
    acum+=num
    ciclo+=1
print("total:",acum)
