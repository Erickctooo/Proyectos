import os
from re import S
os.system("cls")
op=0
res="S"
i=1


total=0

while(op!=5):
    print("sushi nikkey app")
    print("******************")
    print("[1]->REGISTRAR CLIENTE")
    print("[2]->CONSULTAR DATOS DEL CLIENTE")
    print("[3]->REGISTRO DE PEDIDO")
    print("[4]->SALIR")
    op=input("ingrese la opcion deseada: ")
    if(op=="1"):
        rut=int(input("ingresar rut sin punto y sin digito verificador: "))
        while(rut<5000000 and rut<99999999):
            print("RUT INVALIDO")
            rut=int(input("ingresar rut sin punto y sin digito verificador: "))

        nombre=str(input("ingresar nombre:"))
        direcion=str(input("ingresar direcion:"))
        comuna=str(input("ingresar comuna: "))
        correo=str(input("ingresar correo: "))
        while("@"not in correo):
            correo=input("error, ingrese correctamente")
        edad=int(input("ingresar edad: "))
        while(edad<18):
            print("EDAD INSUFICIENTE")
            edad=int(input("ingresar edad: "))

        telefono=int(input("ingresar telefono: "))
        while(telefono<100000000 and 999999999):
            print("ERROR TELEFONO INVALIDO")
            telefono=int(input("ingresar telefono: "))

        tipo=input("PREFERNCIAL-HABITUAL-OCACIONAL:")
    if(op=="2"):
        print("DATOS DE CLIENTE")
        print("****************")
        print(rut)
        print(nombre)
        print(direcion)
        print(comuna)
        print(correo)
        print(edad)
        print(telefono)
        print(tipo)
    while(op=="3"):
        if(op=="3"):
            while(res=="S"):
                print("**********MENU***************PRECIO*********PORCIONES")     
                print("[1]->CALIFORNIA____________**$5.100*********     8   ")
                print("[2]->CRAB AHUMADO__________**$6.200*********     8   ")
                print("[3]->TEMPURA TUNE NIKKEI___**$5.800*********     8   ")
                opcion=int(input("ELIJA OPCION: "))
                if(opcion==1):
                    print("CALIFORNIA")
                    print("**********")
                    print("CAMARON FURAI/PALTA/SALMON")
                    envol=str(input("ENVOLTURA DE SESAMO O CIBOULETTE: ")).upper()
                    total+=5100
                if(opcion==2):
                    print("CRAB AHUMADO")
                    print("**********")
                    print("CAMARON FURAI/PALTA/ENVUELTO EN PALTA/CUBIERTO CON CRAB TARTA/PEPINO/CIBOULETTE/ACEBICHADO AHUMADO")
                    total+=6200
                if(opcion==3):
                    print("TEMPURA TUNE NIKKEI")
                    print("**********")
                    print("CAMARON TEMPURA/QUESO CREMA/CEBOLLIN/APANADO EN PANKO/CUBIERTO EN ATUM ACEBICHADO")
                    total+=5800
                res=input("¿Desea llevar otro producto S/N?: ").upper()
                if(res=="N"):
                    while(res=="N" and i<=1):
                        print("SU TOTAL A PAGAR ES: $",total)
                        dinero=int(input("¿CON CUANTO DINERO EN EFECTIVO DESEA PAGAR: "))
                        if(dinero==total):
                            print("NO TIENE VUELTO ")
                            i+=1
                        if(dinero>total):
                            print("SU VUELTO ES: $",dinero-total)
                            i+=1
                        if(dinero<total):
                            print("EL DINERO ES INSUFICIENTE")
                            i+=1
                        print("GRACIAS POR PREFERIR SUSHI-NIKKEY ")
                        
    if(op=="4"):
        break
print("GRACIAS POR PREFERIR SUSHI-NIKKEY ")
    







