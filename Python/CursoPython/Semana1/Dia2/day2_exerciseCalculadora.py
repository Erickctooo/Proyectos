import os
os.system("cls")
op = 0
total=0

while (op!=5):
    print("CALCULADORA")
    print("[1]Sumar")
    print("[2]Restar")
    print("[3]Multiplicar")
    print("[4]Dividir")
    print("[5]Salir")
    op=input("Ingresar opcion: ")
    
    if (op == "1"):
        
        CantNum = int(input("¿Cuántos números desea sumar?: "))
        total = 0
        for i in range(CantNum):
            num = int(input(f"Ingresar número {i+1}: "))
            total += num  
        print(f"La suma es: {total}")
        input("Presiona Enter para continuar...")


        
    if (op == "2"):
        CantNum = int(input("¿Cuántos números desea restar?: "))
        total = 0  
        for i in range(CantNum):
            num = int(input(f"Ingresar número {i+1}: "))
            if i == 0:
                total = num  
            else:
                total -= num  
        print(f"La resta es: {total}")
        input("Presiona Enter para continuar...")


    if (op == "3"):
        CantNum = int(input("¿Cuántos números desea multiplicar?: "))
        total = 0  
        for i in range(CantNum):
            num = int(input(f"Ingresar número {i+1}: "))
            if i ==0:
                total = num
            else:
                total*=num
        print(f"La multiplicacion es: {total}")
        input("Presiona Enter para continuar...")

    if (op == "4"):
        n1 = int(input("Ingresar primer numero para la division: "))
        n2 = int(input("Ingresar segundo numero para la division: "))
        print(f"La division de {n1} y {n2} es : {n1//n2}")
        input("Presiona Enter para continuar...")
      
    if (op == "5"):
        break
    