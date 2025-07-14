from html.entities import name2codepoint


nomb=input("ingrese su nombre")
ed=int(input("ingrese su edad"))
n1=float(input("ingrese nota 1"))
n2=float(input("ingrese nota 2"))
n3=float(input("ingrese nota 3"))
prom=(n1+n2+n3)/3
print("nombre    ",nomb," y su promedio ",prom)
