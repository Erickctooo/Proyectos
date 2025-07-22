import funciones as ff
import os
import numpy as np
import datetime
matriz=np.empty((10,10))
ff.llenarmatriz(matriz)
hora=datetime.datetime.now()
rut=(len(str())==8)
pasajeros=[]



op=0

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
ubi37=np.where(matriz==37)
ubi38=np.where(matriz==38)
ubi39=np.where(matriz==39)
ubi40=np.where(matriz==40)
ubi41=np.where(matriz==41)
ubi42=np.where(matriz==42)
ubi43=np.where(matriz==43)
ubi44=np.where(matriz==44)
ubi45=np.where(matriz==45)
ubi46=np.where(matriz==46)
ubi47=np.where(matriz==47)
ubi48=np.where(matriz==48)
ubi49=np.where(matriz==49)
ubi50=np.where(matriz==50)
ubi51=np.where(matriz==51)
ubi52=np.where(matriz==52)
ubi53=np.where(matriz==53)
ubi54=np.where(matriz==54)
ubi55=np.where(matriz==55)
ubi56=np.where(matriz==56)
ubi57=np.where(matriz==57)
ubi58=np.where(matriz==58)
ubi59=np.where(matriz==59)
ubi60=np.where(matriz==60)
ubi61=np.where(matriz==61)
ubi62=np.where(matriz==62)
ubi63=np.where(matriz==63)
ubi64=np.where(matriz==64)
ubi65=np.where(matriz==65)
ubi66=np.where(matriz==66)
ubi67=np.where(matriz==67)
ubi68=np.where(matriz==68)
ubi69=np.where(matriz==69)
ubi70=np.where(matriz==70)
ubi71=np.where(matriz==71)
ubi72=np.where(matriz==72)
ubi73=np.where(matriz==73)
ubi74=np.where(matriz==74)
ubi75=np.where(matriz==75)
ubi76=np.where(matriz==76)
ubi77=np.where(matriz==77)
ubi78=np.where(matriz==78)
ubi79=np.where(matriz==79)
ubi80=np.where(matriz==80)
ubi81=np.where(matriz==81)
ubi82=np.where(matriz==82)
ubi83=np.where(matriz==83)
ubi84=np.where(matriz==84)
ubi85=np.where(matriz==85)
ubi86=np.where(matriz==86)
ubi87=np.where(matriz==87)
ubi88=np.where(matriz==88)
ubi89=np.where(matriz==89)
ubi90=np.where(matriz==90)
ubi91=np.where(matriz==91)
ubi92=np.where(matriz==92)
ubi93=np.where(matriz==93)
ubi94=np.where(matriz==94)
ubi95=np.where(matriz==95)
ubi96=np.where(matriz==96)
ubi97=np.where(matriz==97)
ubi98=np.where(matriz==98)
ubi99=np.where(matriz==99)
ubi100=np.where(matriz==100)

while(op!=5):
    os.system("cls")

    print("      “Michael Jam”      ")
    print("  ********************* ")
    print("[1].   Comprar entradas ")
    print("[2].   Mostrar ubicaciones ")
    print("[3].   Ver listado de asistentes ")
    print("[4].   Mostrar ganancias totales ")
    print("[5].   Salir")

    while(True):
        try:
            op=int(input("Ingrese una opcion: "))
            if(op>0 and op<6):
                break
            else:
                print("\nDebe elegir una de las opciones disponibles.\n")
                os.system("pause")
        except ValueError:
            print("\nDebe ser un número entero.\n")


    if(op==1):
        os.system("cls")
        while(True):
            try:
                cant=int(input("Ingrese cantidad de entradas deseadas . 3 como maximo "))
                if(cant<=3 and cant>=1):
                    break
                else:
                    print("!ERROR¡,Cantidad de entradas invalida,debe ser un minimo de 1 o maximo 3")
                    os.system("pause")
            except ValueError:
                print("debe ser un numero entero")
         
            
        ("UBICACIONES DISPONIBLES")
        ff.mostrarmatriz(matriz)
        print("___________________")
        print("Los precios de las entradas son los siguientes:\n• Platinum, $120.000. (Asientos del 1 al 20).\n• Gold, $80.000. (Asientos del 21 al 50).\n• Silver, $50.000. (Asientos del 51 al 100.)")



        asi=int(input("\nSeleccione el o los asiento ¡Los asientos marcados con X no estan disponibles!: "))
        if(asi in matriz and asi>=1 and asi<=100):
            ff.validarRut(rut)

            

               
               


        
    if(op==2):
        os.system("cls")
        print("UBICACIONES DISPONIBLES")
        ff.mostrarmatriz(matriz)
        os.system("pause")

    if(op==4):
        os.system("cls")
        if(len(pasajeros)>0):
            for rut in pasajeros:
                print(rut, "\n")
            os.system("pause")
        else:
            print("No hay pasajeros.\n")
            os.system("pause")







    if(op==5):
        break
       

        
           
            














