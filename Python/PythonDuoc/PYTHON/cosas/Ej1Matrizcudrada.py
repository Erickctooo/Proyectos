import numpy as np #np se puede usar para llamar a la biblioteca numpy y las funciones y tipos de datos relacionados.
while(True):
	try:
		n=int(input("Ingrese largo de la matriz cuadrada"))
		if(n>0):
			break
		else:
			print("Debe ser un numero positivo")
	except ValueError:
			print("Debe ser numero entero")

matriz=np.empty((n,n))#defino una matriz de n por n


for i in range(n):
    for j in range (n):
    	while(True):
    		try:
    			num=int(input("Ingrese un numero "))
    			break
    		except ValueError:
    			print("Debe ser número ")

    	matriz[i,j]=num #matriz[i][j]=num

 	
for i in range(n):
	for j in range(n):
		print(matriz[i][j])
	print()
print(matriz)
