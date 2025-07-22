import os
import math

totalvip=0
totalpla=0
totalnor=0
totalge=0

from numpy import size
def llenarmatriz(matriz):
	cont=1
	for i in range(6):
		for j in range(6):
			matriz[i][j]=cont
			cont+=1

def mostrarmatriz(matriz):
	print("|     ", math.trunc(matriz[0,0]), "    ", math.trunc(matriz[0,1]), "    ", math.trunc(matriz[0,2]), "                   ",  math.trunc(matriz[0,3]), "   ", math.trunc(matriz[0,4]), "   ", math.trunc(matriz[0,5]), "    |")
	print("|                                                            |")
	print("|     ", math.trunc(matriz[1,0]), "    ", math.trunc(matriz[1,1]), "    ", math.trunc(matriz[1,2]), "                   ",  math.trunc(matriz[1,3]), "  ", math.trunc(matriz[1,4]), "  ", math.trunc(matriz[1,5]), "   |")
	print("|                                                            |")
	print("|     ", math.trunc(matriz[2,0]), "   ", math.trunc(matriz[2,1]), "   ", math.trunc(matriz[2,2]), "                  ",  math.trunc(matriz[2,3]), "  ", math.trunc(matriz[2,4]), "  ", math.trunc(matriz[2,5]), "   |")
	print("|                                                            |")
	print("|     ", math.trunc(matriz[3,0]), "   ", math.trunc(matriz[3,1]), "   ", math.trunc(matriz[3,2]), "                  ",  math.trunc(matriz[3,3]), "  ", math.trunc(matriz[3,4]), "  ", math.trunc(matriz[3,5]), "   |")
	print("|                                                            |")
	print("|     ", math.trunc(matriz[4,0]), "   ", math.trunc(matriz[4,1]), "   ", math.trunc(matriz[4,2]), "                  ",  math.trunc(matriz[4,3]), "  ", math.trunc(matriz[4,4]), "  ", math.trunc(matriz[4,5]), "   |")
	print("|____________________________________________________________|")
	print("|____________________________________________________________|")
	print("|     ", math.trunc(matriz[5,0]), "   ", math.trunc(matriz[5,1]), "   ", math.trunc(matriz[5,2]), "                  ",  math.trunc(matriz[5,3]), "  ", math.trunc(matriz[5,4]), "  ", math.trunc(matriz[5,5]), "   |")
