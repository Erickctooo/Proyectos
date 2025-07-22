import os
def suma_dos(a,b):
	c=a+b
	print("La suma de ",a,"+",b,"=",c)
	print("Aqui muestro el resultado dese la función")
	os.system("pause")
def suma_dos1(a,b):
	c=a+b
	return c 


#main() o programa principal
#se piden dos números, se suman y se muestra la suma
#se hace la suma en una funcion
num1=int(input("Ingrese primer número "))
num2=int(input("Ingrese segundo número "))
#aqui voy a llamar a la función y le mandaré los números
suma_dos(num1,num2)
print("Ya volvió de la función uno")
nn=suma_dos1(num1,num2)
print("La suma de ",num1, "+",num2,"=",nn)


