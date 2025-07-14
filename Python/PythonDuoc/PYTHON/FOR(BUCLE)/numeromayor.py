mayor = 0
maximo = 5 #Cantidad de numeros, puede variar
 
for i in range(maximo):
    num = int(input('Dame un numero:'))
    if num > mayor:
        mayor = num
 
print(mayor)