from django.shortcuts import redirect , render
from .models import Producto , Catalogo
from .forms import ProductoForm , CatalogoForm , CustomUserCreationForm
from django.contrib.auth import authenticate, login
from django.contrib import messages


# Create your views here.
def index(request):
    return render(request,'app/index.html')

def sobre(request):
    return render(request,'app/sobre.html')

def galeria(request):
    return render(request,'app/galeria.html')

def agendar(request):
    return render(request,'app/agendar.html')

def ubicacion(request):
    return render(request,'app/ubicacion.html')

def carrito(request):
    return render(request,'app/carrito.html')

def producto(request):
    pro=Producto.objects.all()
    cat=Catalogo.objects.all()
    return render(request,'app/producto.html',{'pro':pro , 'cat':cat })

def agregar(request):
    if request.method == 'POST':
        form = ProductoForm(request.POST, request.FILES)
        if form.is_valid():
            form.save()
            return redirect('Producto')
    else:
        form = ProductoForm()
    context = {
        'form': form,
    }
    return render(request, 'app/agregar.html', context)


def eliminar(request,id):
    pro=Producto.objects.get(id=id)
    pro.delete()
    return redirect('Producto')

def actualizar(request, id):
    producto = Producto.objects.get(id=id)

    if request.method == 'POST':
        form = ProductoForm(request.POST, request.FILES, instance=producto)
        if form.is_valid():
            form.save()
            return redirect('Producto')
    else:
        form = ProductoForm(instance=producto)
    context = {
        'form': form,
        'producto': producto,
    }
    return render(request, 'app/actualizar.html', context)



def agregar2(request):
    if request.method == 'POST':
        form = CatalogoForm(request.POST, request.FILES)
        if form.is_valid():
            form.save()
            return redirect('Producto')
    else:
        form = CatalogoForm()
    context = {
        'form': form,
    }
    return render(request, 'app/agregar2.html', context)


def eliminar2(request,id):
    cat=Catalogo.objects.get(id=id)
    cat.delete()
    return redirect('Producto')

def actualizar2(request, id):
    catalogo = Catalogo.objects.get(id=id)

    if request.method == 'POST':
        form = CatalogoForm(request.POST, request.FILES, instance=catalogo)
        if form.is_valid():
            form.save()
            return redirect('Producto')
    else:
        form = CatalogoForm(instance=catalogo)
    context = {
        'form': form,
        'catalogo': catalogo,
    }
    return render(request, 'app/actualizar2.html', context)


def registro(request):
    data = {
        'form': CustomUserCreationForm()
    }
    if request.method == 'POST':
        formulario = CustomUserCreationForm(request.POST)
        if formulario.is_valid():
            formulario.save()
            user = authenticate(username=formulario.cleaned_data["username"], password=formulario.cleaned_data["password1"])
            login(request, user)
            messages.success(request, "Te has registrado correctamente")
            return redirect(to="Index") 
        else:
            data["form"] = formulario
    return render(request, 'registration/registro.html', data)




