import os
import funciones as ff

#main() o programa principal
#se piden dos números, se suman y se muestra la suma
#se hace la suma en una funcion
num1=int(input("Ingrese primer número "))
num2=int(input("Ingrese segundo número "))
#aqui voy a llamar a la función y le mandaré los números
ff.suma_dos(num1,num2)
print("Ya volvió de la función uno")
nn=ff.suma_dos1(num1,num2)
print("La suma de ",num1, "+",num2,"=",nn)


