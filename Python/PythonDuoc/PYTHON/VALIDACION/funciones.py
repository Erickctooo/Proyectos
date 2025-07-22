def ValidaDatos(mensa,inf,sup):
	while(True):
		try:
			num=int(input(mensa))
			if(num>=inf and num<=sup):
				break
			else:
				print("debe estar en el rango "+str(inf)+"-"+str(sup))
		except ValueError:
			print("Debe ser un numero entero")
	return num

def validarRut(rut):
	while(True):
		try:
			if(len(str(rut))==8):
				break
			else:
				print("Rut inválido! debe ser largo 8.")
				rut = int(input("Ingrese rut comprador válido: "))
		except ValueError:
			print("Debe ser un numero entero")
	return rut

def llenarMatriz(departamentos):
  for i in range(1,11):
    for j in range(4):
        departamentos[i][j]=" "
  return departamentos

def validarPiso():
	piso = int(input("Elija piso: "))
	while(True):
		try:
			if( piso > 0 and piso < 11):
				break
			else:
				print("Piso inexistente! debe estar entre pisos 1 y 10")
				piso = int(input("Ingrese piso válido: "))
		except ValueError:
			print("Debe ser un numero entero")
	return piso




def validarLetra():
	letra = str(input("Elija letra departamento: "))
	while(True):
		letra = letra.upper()
		try:
			if( letra == "A" or letra == "B" or letra == "C" or letra == "D" ):
				break
			else:
				print("Letra de departamento inexistente! debe ser A, B, C o D")
				letra = str(input("Ingrese letra válida: "))
		except ValueError:
			print("Debe ser una letra")
	return letra




def mostrarDepartamentos(departamentos):
	print("            A   B   C   D")
	for i in reversed(range(1,11)):
		if(i == 10):
			print("Piso: ", i," " ,departamentos[i][0], " ", departamentos[i][0] , " ", departamentos[i][0] , " ", departamentos[i][0])
		else:
			print("Piso:  ", i," " ,departamentos[i][0], " ", departamentos[i][0] , " ", departamentos[i][0] , " ", departamentos[i][0])




def validarDisponibilidad(piso,letra,departamentos):
	while True:
		try:
			if(letra == "A"):
				if(departamentos[piso][0] == "X"):
					print("Departamento no disponible, elija otro!")
					letra = int(input("Ingrese letra válida: "))
					piso = int(input("Ingrese piso válido: "))
			if(letra == "B"):
				if(departamentos[piso][1] == "X"):
					print("Departamento no disponible, elija otro!")
					letra = int(input("Ingrese letra válida: "))
					piso = int(input("Ingrese piso válido: "))
			if(letra == "C"):
				if(departamentos[piso][2] == "X"):
					print("Departamento no disponible, elija otro!")
					letra = int(input("Ingrese letra válida: "))
					piso = int(input("Ingrese piso válido: "))
			if(letra == "D"):
				if(departamentos[piso][3] == "X"):
					print("Departamento no disponible, elija otro!")
					letra = int(input("Ingrese letra válida: "))
					piso = int(input("Ingrese piso válido: "))
			else:
				break
		except ValueError:
			print("Debe ser una letra")
		return letra
		
		
		
		
	

		


def comprarDepartamento(compradores,departamentos):
	rutComprador = int(input("Ingrese rut comprador: "))
	rutComprador = validarRut(rutComprador);

	mostrarDepartamentos(departamentos)

	print("\n Elija un departamento")
	piso = validarPiso()
	letra = validarLetra()
	validarDisponibilidad(piso,letra,departamentos)
	reservar(departamentos, compradores,letra, piso, rutComprador)

def reservar(departamentos, compradores, letra, piso, rut):
	print("into reserva")
	print("letra en reserva es: ", letra)
	if(letra == "A"):
		departamentos[piso][0]="X"
		print("compro en A, depto ",piso,0)
	if(letra == "B"):
		departamentos[piso][1]="X"
		print("compro en B")
	if(letra == "C"):
		departamentos[piso][2]="X"
		print("compro en C")
	if(letra == "D"):
		departamentos[piso][3]="X"
		print("compro en D")
	mostrarDepartamentos(departamentos)
	return compradores.append(rut)

def mostrarCompradores(compradores):
	for i in range(41):
		print(compradores[i])

	




