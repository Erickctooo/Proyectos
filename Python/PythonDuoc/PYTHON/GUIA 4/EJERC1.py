import os
os.system("cls")

print("**********MENU************_**PRECIO**")     
print("[1]->CHURRASCO SOLO________**$2.500**")
print("[2]->CHURRASCO ITALIANO____**$3.800**")
print("[3]->CHURRASCO MAYO________**$3.000**")

clientes=int(input("¿CUANTOS CLIENTES DESEA INGRESAR?: "))
i=1
chusolo=0
total=0
totalitaliano=0
totalmayo=0
totalre=0


while (i<=clientes):
    print("******MENU******")
    print("****CLIENTE N° ", i, "****")         
    print("[1]->CHURRASCO SOLO")
    print("[2]->CHURRASCO ITALIANO")
    print("[3]->CHURRASCO MAYO")
    opcion=int(input("ELIJA OPCION: "))
    cantidad=int(input("Ingrese la cantidad de churrascos que llevara: "))

    if(opcion==1):
        chusolo+=cantidad
        total+=cantidad*2500
        totalre+=cantidad*2500
    
    if(opcion==2):
        total+=cantidad*3800
        totalre+=cantidad*3800
    
    if(opcion==3):
        total+=cantidad*3000
        totalmayo+=cantidad*3000
        totalre+=cantidad*3000
    res=input("¿Desea llevar otro producto S/N?: ").upper()
    
    if(res=="N"):
        print("Su total a pagar es: ", total)
        total=0
        i+=1
        
print("La cantidad total recaudada es: ", totalre)
print("La cantidad de churrasco solo es: ", chusolo)
print("El total de dinero recaudado en churrasco mayo es: ", totalmayo)
