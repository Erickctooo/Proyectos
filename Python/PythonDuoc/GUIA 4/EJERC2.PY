import os
os.system("cls")
totalR=0
adulto=0
estudiantes=0

i=1
pasajes=int(input("Ingresar la cantidad de pasajes: "))

while(i<=pasajes):
    usuario=input("ingrese tipo de usuario ESTUDIANTE/NORMAL/ADULTO MAYOR: ").upper()
    horario=input("ingrese el horario NORMAL/HORA PUNTA: ").upper()
    if(usuario=="ESTUDIANTE" and horario=="NORMAL"):
        valor=490
        print("**********************************************")
        print("               Usuario =>",usuario)
        print("               Horario =>",horario)
        print("               Valor pasaje => $",valor)
        totalR+=valor
    elif(usuario=="ESTUDIANTE" and horario=="HORA PUNTA"):
        valor=590
        print("**********************************************")
        print("               Usuario =>",usuario)
        print("               Horario =>",horario)
        print("               Valor pasaje => $",valor)
        totalR+=valor
        estudiantes+=1
    elif(usuario=="NORMAL" and horario=="NORMAL"):
        valor=790
        print("**********************************************")
        print("               Usuario =>",usuario)
        print("               Horario =>",horario)
        print("               Valor pasaje => $",valor)
        totalR+=valor
    elif(usuario=="NORMAL" and horario=="HORA PUNTA"):
        valor=890
        print("**********************************************")
        print("               Usuario =>",usuario)
        print("               Horario =>",horario)
        print("               Valor pasaje => $",valor)
        totalR+=valor
    elif(usuario=="ADULTO MAYOR" and horario=="NORMAL"):
        valor=390
        print("**********************************************")
        print("               Usuario =>",usuario)
        print("               Horario =>",horario)
        print("               Valor pasaje => $",valor)
        totalR+=valor
        adulto+=1
    elif(usuario=="ADULTO MAYOR" and horario=="HORA PUNTA"):
        valor=490
        print("**********************************************")
        print("               Usuario =>",usuario)
        print("               Horario =>",horario)
        print("               Valor pasaje => $",valor)
        totalR+=valor
        adulto+=1
    i+=1
print("LA CANTIDAD RECAUDADA ES: ",totalR)
print("CANTIDAD DE ADULTO MAYOR TRANSPORTADOS: ",adulto)
print("LA CANTIDAD DE ESTUDIANTES EN HORA PUNTA TRANSPORTADOS FUE: ",estudiantes)









