res="S"
i=1
sumapar=0
contper=0
while(res=="S"):
	print("Ingresando el número ",i)
	num=int(input("Ingrese un número "))
	if(num%2==0):
		sumapar+=num
	j=1
	sumaper=0
	while(j<num):
		if(num%j==0):
			sumaper+=j
		j+=1
	if(sumaper==num):
		contper+=1
	i+=1
	res=input("Desea ingresar otro número S/N ").upper()
print("La suma de los pares es :",sumapar)
print("El total de números perfectos es :",contper)


