nom1=(input("ingresar nombre primera persona"))
edad1=int(input("ingresar edad primera persona"))
gen1=(input("ingresar sexo F:femenino M:masculino"))
nom2=(input("ingresar nombre segunda persona"))
edad2=int(input("ingresar edad segunda persona"))
gen2=(input("ingresar sexo F:femenino M:masculino"))
if(gen1=="F"):
    print("es mujer y su nombre es", nom1)
elif(gen1=="M"):
    print("es hombre y su edad es", edad1)
if(gen2=="F"):
    print("es mujer y su nombre es", nom2)
elif(gen2=="M"):
    print("es hombre y su edad es", edad2)