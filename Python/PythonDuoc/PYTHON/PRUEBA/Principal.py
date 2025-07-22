import os
import Libreria as ff
import numpy as np

matriz=np.empty((6,6 ))
ff.llenarmatriz(matriz)
op=0
pasajeros=[]
total=0
totalvip=0
totalpre=0
totalnor=0
totalge=0
asi=0
compra=0
salir=0
ubi1=np.where(matriz==1)
ubi2=np.where(matriz==2)
ubi3=np.where(matriz==3)
ubi4=np.where(matriz==4)
ubi5=np.where(matriz==5)
ubi6=np.where(matriz==6)
ubi7=np.where(matriz==7)
ubi8=np.where(matriz==8)
ubi9=np.where(matriz==9)
ubi10=np.where(matriz==10)
ubi11=np.where(matriz==11)
ubi12=np.where(matriz==12)
ubi13=np.where(matriz==13)
ubi14=np.where(matriz==14)
ubi15=np.where(matriz==15)
ubi16=np.where(matriz==16)
ubi17=np.where(matriz==17)
ubi18=np.where(matriz==18)
ubi19=np.where(matriz==19)
ubi20=np.where(matriz==20)
ubi21=np.where(matriz==21)
ubi22=np.where(matriz==22)
ubi23=np.where(matriz==23)
ubi24=np.where(matriz==24)
ubi25=np.where(matriz==25)
ubi26=np.where(matriz==26)
ubi27=np.where(matriz==27)
ubi28=np.where(matriz==28)
ubi29=np.where(matriz==29)
ubi30=np.where(matriz==30)
ubi31=np.where(matriz==31)
ubi32=np.where(matriz==32)
ubi33=np.where(matriz==33)
ubi34=np.where(matriz==34)
ubi35=np.where(matriz==35)
ubi36=np.where(matriz==36)

while(op!=6):
    os.system("cls")

    print("        Raviikong    ")
    print("  ********************* ")
    print("1.   Mostrar camarotes disponibles ")
    print("2.   Comprar pasaje")
    print("3.   Totales")
    print("4.   Anular venta")
    print("5.   Listado de pasajeros")
    print("6.   Salir")
    
    while(True):
        try:
            op=int(input("Elija una opción: "))
            if(op>0 and op<7):
                break
            else:
                print("\nDebe elegir una de las opciones disponibles.\n")
                os.system("pause")
        except ValueError:
            print("\nDebe ser un número entero.\n")
   
    if(op==1):
        os.system("cls")
        ff.mostrarmatriz(matriz)
        os.system("pause")
        
    if(op==2):
        os.system("cls")
        while(True):
            try:
                ff.mostrarmatriz(matriz)
                asi=int(input("\nSeleccione un asiento ¡Los asientos marcados con -1 no estan disponibles!: "))
                if(asi in matriz and asi>=1 and asi<=36):
                            nom=input("\nIngrese su nombre y apellido: ").upper()
                            tipo=nom.isupper()
                            while(tipo==False):
                                    nom=input("\nError, ingrese su nombre y apellido nuevamente: ").upper()
                                    if(nom.isupper()):
                                        tipo=True
                            if(tipo==True):
                                pasajeros.append(nom)
                                matriz[matriz==asi]=-1
                                compra+=1
                                if(asi==1 or asi==8 or asi==15 or asi==22 or asi==29 or asi==36):
                                    totalvip+=5000
                                    totalge+=5000
                                    print("\nSu total a pagar es $ 5000 barras de latinio prensado.\n")
                                    os.system("pause")
                                elif(asi==6 or asi==11 or asi==16 or asi==21 or asi==26 or asi==31):
                                    totalpre+=3000
                                    totalge+=3000
                                    print("\nSu total a pagar es $3000 barras de latinio prensado.\n")
                                    os.system("pause")
                                else:
                                    totalnor+=1300
                                    totalge+=1300
                                    print("\nSu total a pagar es $1300 barras de latinio prensado.\n")
                                    os.system("pause")
                                break
                else:
                    print("\nEl asiento seleccionado no está disponible.\n")
                    os.system("pause")
                    break
            except ValueError:
                print("\nDebe seleccionar un asiento\n")
                os.system("pause")
                os.system("cls")
    
    if(op==3):
        os.system("cls")
        print("El total recaudado en camarotes VIP es $", totalvip, "barras de latino prensado.")
        print("\nEl total recaudado en camarotes premium es $", totalpre, "barras de latino prensado.")
        print("\nEl total recaudado en camarotes normales es $", totalnor, "barras de latino prensado.")
        print("\nEl total recaudado en general es $", totalge, "barras de latino prensado.\n")
        os.system("pause")

    if(op==4):
        if(compra<1):
            print("\nError, aun no ha comprado un asiento.\n")
            os.system("pause")
        elif(compra>0):
            while(True):
                try: 
                    anulasi=int(input("\nIngrese el numero de asiento que desea anular: "))
                    if(anulasi in matriz):
                        print("\nError, el asiento está disponible.\n")
                        os.system("pause")
                        break
                    elif(anulasi<1 or anulasi>36):
                        print("\nError, la nave solo tiene 36 asientos.\n")
                        os.system("pause")
                        break
                    else:
                        anunom=input("\nIngrese su nombre y apellido: ").upper()
                        tipo2=anunom.isupper()
                        while(tipo2==False):
                            anunom=input("\nError, ingrese su nombre y apellido nuevamente: ").upper()
                            if(anunom.isupper()):
                                tipo2=True
                                break
                        if(anunom not in pasajeros):
                            print("El nombre ingresado no se encuentra en la lista de pasajeros.")
                            os.system("pause")
                            break
                        if(anulasi==1):
                            matriz[ubi1]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==2):
                            matriz[ubi2]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==3):
                            matriz[ubi3]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==4):
                            matriz[ubi4]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==5):
                            matriz[ubi5]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==6):
                            matriz[ubi6]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==7):
                            matriz[ubi7]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==8):
                            matriz[ubi8]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==9):
                            matriz[ubi9]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==10):
                            matriz[ubi10]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==11):
                            matriz[ubi11]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==12):
                            matriz[ubi12]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==13):
                            matriz[ubi13]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==14):
                            matriz[ubi14]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==15):
                            matriz[ubi15]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==16):
                            matriz[ubi16]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==17):
                            matriz[ubi17]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==18):
                            matriz[ubi18]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==19):
                            matriz[ubi19]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==20):
                            matriz[ubi20]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==21):
                            matriz[ubi21]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==22):
                            matriz[ubi22]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==23):
                            matriz[ubi23]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==24):
                            matriz[ubi24]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==25):
                            matriz[ubi25]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==26):
                            matriz[ubi26]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==27):
                            matriz[ubi27]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==28):
                            matriz[ubi28]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==29):
                            matriz[ubi29]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==30):
                            matriz[ubi30]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==31):
                            matriz[ubi31]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==32):
                            matriz[ubi32]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==33):
                            matriz[ubi33]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==34):
                            matriz[ubi34]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==35):
                            matriz[ubi35]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        elif(anulasi==36):
                            matriz[ubi36]=anulasi
                            for x in range(len(pasajeros)-1,-1,-1):
                                if pasajeros[x] == anunom:
                                    pasajeros.pop(x)
                        print("\nCompra anulada.\n")
                        os.system("pause")
                        if(anulasi==1 or anulasi==8 or anulasi==15 or anulasi==22 or anulasi==29 or anulasi==36):
                            totalvip-=5000
                            totalge-=5000
                        elif(anulasi==6 or anulasi==11 or anulasi==16 or anulasi==21 or anulasi==26 or anulasi==31):
                            totalpre-=3000
                            totalge-=3000
                        else:
                            totalnor-=1300
                            totalge-=1300
                        break
                except ValueError:
                    print("\nDebe ingresar un asiento\n")
                    os.system("pause")
                
    if(op==5):
        os.system("cls")
        if(len(pasajeros)>0):
            for nom in pasajeros:
                print(nom, "\n")
            os.system("pause")
        else:
            print("No hay pasajeros.\n")
            os.system("pause")
    
    if(op==6):
        break