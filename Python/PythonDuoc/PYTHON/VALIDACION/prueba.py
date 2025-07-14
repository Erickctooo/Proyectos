import numpy
import funciones


op=1
departamentos = numpy.empty([11,4],type(str))
compradores =[0]*41
departamentos = funciones.llenarMatriz(departamentos)
while(op!=5):
    print("\n")
    print("*********CASA FELIZ*********")
    print("\n")
    print("1. Comprar Departamento")
    print("2. Mostrar departamentos disponibles")
    print("3. Ver listado de compradores")
    print("4. Mostrar ganancias totales")
    print("5. Salir")
    op=funciones.ValidaDatos("Elija opcion ",1,5)
    if(op==1):
      matriz = funciones.comprarDepartamento(compradores,departamentos)
    if(op==2):
      funciones.mostrarDepartamentos(departamentos)
    if(op==3):
      funciones.mostrarCompradores(compradores)
    if(op==4):
      print("\n")
    if(op==5):
      print("Nombre: Daniel Reyes")
      print("Fecha: 11/07/2022")
      