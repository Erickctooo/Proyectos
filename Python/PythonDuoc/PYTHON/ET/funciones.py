import os
import math



from numpy import size

def llenarmatriz(matriz):
	cont=1
	for i in range(10):
		for j in range(10):
			matriz[i][j]=cont
			cont+=1

def mostrarmatriz(matriz):
    print("             ________ ")
    print("            |ECENARIO|")
    print("             ________ ")
    print("______________________________________")
    print( math.trunc(matriz[0,0]), " ", math.trunc(matriz[0,1]), " ", math.trunc(matriz[0,2]), " ",  math.trunc(matriz[0,3]), " ", math.trunc(matriz[0,4]), " ", math.trunc(matriz[0,5]), " ", math.trunc(matriz[0,6]), " ", math.trunc(matriz[0,7]), " ", math.trunc(matriz[0,8]), " ", math.trunc(matriz[0,9]))
    print("                                                              ")
    print( math.trunc(matriz[1,0]), "", math.trunc(matriz[1,1]), "", math.trunc(matriz[1,2]), "",  math.trunc(matriz[1,3]), "", math.trunc(matriz[1,4]), "", math.trunc(matriz[1,5]), "", math.trunc(matriz[1,6]), "", math.trunc(matriz[1,7]), "", math.trunc(matriz[1,8]), "", math.trunc(matriz[1,9]))
    print("                                                              ")
    print( math.trunc(matriz[2,0]), "", math.trunc(matriz[2,1]), "", math.trunc(matriz[2,2]), "",  math.trunc(matriz[2,3]), "", math.trunc(matriz[2,4]), "", math.trunc(matriz[2,5]), "", math.trunc(matriz[2,6]), "", math.trunc(matriz[2,7]), "", math.trunc(matriz[2,8]), "", math.trunc(matriz[2,9]))
    print("                                                              ")
    print( math.trunc(matriz[3,0]), "", math.trunc(matriz[3,1]), "", math.trunc(matriz[3,2]), "",  math.trunc(matriz[3,3]), "", math.trunc(matriz[3,4]), "", math.trunc(matriz[3,5]), "", math.trunc(matriz[3,6]), "", math.trunc(matriz[3,7]), "", math.trunc(matriz[3,8]), "", math.trunc(matriz[3,9]))
    print("                                                              ")
    print( math.trunc(matriz[4,0]), "", math.trunc(matriz[4,1]), "", math.trunc(matriz[4,2]), "",  math.trunc(matriz[4,3]), "", math.trunc(matriz[4,4]), "", math.trunc(matriz[4,5]), "", math.trunc(matriz[4,6]), "", math.trunc(matriz[4,7]), "", math.trunc(matriz[4,8]), "", math.trunc(matriz[4,9]))
    print("                                                              ")
    print( math.trunc(matriz[5,0]), "", math.trunc(matriz[5,1]), "", math.trunc(matriz[5,2]), "",  math.trunc(matriz[5,3]), "", math.trunc(matriz[5,4]), "", math.trunc(matriz[5,5]), "", math.trunc(matriz[5,6]), "", math.trunc(matriz[5,7]), "", math.trunc(matriz[5,8]), "", math.trunc(matriz[5,9]))
    print("                                                              ")
    print( math.trunc(matriz[6,0]), "", math.trunc(matriz[6,1]), "", math.trunc(matriz[6,2]), "",  math.trunc(matriz[6,3]), "", math.trunc(matriz[6,4]), "", math.trunc(matriz[6,5]), "", math.trunc(matriz[6,6]), "", math.trunc(matriz[6,7]), "", math.trunc(matriz[6,8]), "", math.trunc(matriz[6,9]))
    print("                                                              ")
    print( math.trunc(matriz[7,0]), "", math.trunc(matriz[7,1]), "", math.trunc(matriz[7,2]), "",  math.trunc(matriz[7,3]), "", math.trunc(matriz[7,4]), "", math.trunc(matriz[7,5]), "", math.trunc(matriz[7,6]), "", math.trunc(matriz[7,7]), "", math.trunc(matriz[7,8]), "", math.trunc(matriz[7,9]))
    print("                                                              ")
    print( math.trunc(matriz[8,0]), "", math.trunc(matriz[8,1]), "", math.trunc(matriz[8,2]), "",  math.trunc(matriz[8,3]), "", math.trunc(matriz[8,4]), "", math.trunc(matriz[8,5]), "", math.trunc(matriz[8,6]), "", math.trunc(matriz[8,7]), "", math.trunc(matriz[8,8]), "", math.trunc(matriz[8,9]))
    print("                                                              ")
    print( math.trunc(matriz[9,0]), "", math.trunc(matriz[9,1]), "", math.trunc(matriz[9,2]), "",  math.trunc(matriz[9,3]), "", math.trunc(matriz[9,4]), "", math.trunc(matriz[9,5]), "", math.trunc(matriz[9,6]), "", math.trunc(matriz[9,7]), "", math.trunc(matriz[9,8]), "", math.trunc(matriz[9,9]))
    print("______________________________________")



    def validarRut(rut):
        while(True):
            try:
                rut=int(input("ingresar su rut"))
                if(len(str(rut))==8):
                    break
                else:
                    print("Rut inválido! debe ser largo 8.")
                    rut = int(input("Ingrese rut comprador válido: "))
            except ValueError:
                print("Debe ser un numero entero")
        return rut
