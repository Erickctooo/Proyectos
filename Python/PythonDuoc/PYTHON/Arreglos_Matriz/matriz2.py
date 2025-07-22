import numpy as np #np se puede usar para llenar a la biblioteca numpy y las funciones
sw=0
while(sw==0):
    while(True):
        try:
            n=int(input("ingrese largo de las filas de la matriz"))
            if(n>0):
                break
            else:
                print("debe ser numero entero ")
        except ValueError:
            print("debe ser numero entero")
    while(True):
        try:
            m=int(input("ingrese largo de las columnas de la matriz"))
            if(m>0):
                break
            else:
                print("debe ser numero entero ")
        except ValueError:
            print("debe ser numero entero")

    if(m!=n):
        sw=1

matriz=np.empty((n,m))#definido una matriz de n por n

for i in range(n):
    for j in range(m):
        while(True):
            try:
                num=int(input("ingrese un numero "))
                break
            except ValueError:
                print("debe ser numero ")
        matriz[i,j]=num

for i in range(n):
    for j in range(m):
        print(matriz[i][j])
print(matriz)

