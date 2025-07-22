from django.shortcuts import render, redirect
from .models import Revista, Diario, Suscripcion
from .forms import RevistaForm, DiarioForm, SuscripcionForm

# Create your views here.

def index(request):
    return render(request, 'caosnews/Index.html') 

def nosotros(request):
    return render(request, 'caosnews/mvision.html') 

def galeria(request):
    return render(request, 'caosnews/Galeria.html') 

def contacto(request):
    return render(request, 'caosnews/Contacto.html') 

def divisas(request):
    return render(request, 'caosnews/Divisas.html') 

def crud(request):
    rev=Revista.objects.all()
    diar=Diario.objects.all()
    susc=Suscripcion.objects.all()
    return render(request, 'caosnews/crud.html', {'rev':rev, 'diar':diar, 'susc':susc})

def agregar(request):
    if request.method == 'POST':
        form = RevistaForm(request.POST, request.FILES)
        if form.is_valid():
            form.save()
            return redirect('crud')
    else:
        form = RevistaForm()
    context = {
        'form': form,
    }
    return render(request, 'caosnews/agregar.html', context)

def eliminarrev(request,id):
    rev=Revista.objects.get(id=id)
    rev.delete()
    return redirect('crud')

def actualizarrev(request, id):
    revista = Revista.objects.get(id=id)

    if request.method == 'POST':
        form = RevistaForm(request.POST, request.FILES, instance=revista)
        if form.is_valid():
            form.save()
            return redirect('crud')
    else:
        form = RevistaForm(instance=revista)
    context = {
        'form': form,
        'revista': revista,
    }
    return render(request, 'caosnews/actualizarrev.html', context)

def agregardiario(request):
    if request.method == 'POST':
        form = DiarioForm(request.POST, request.FILES)
        if form.is_valid():
            form.save()
            return redirect('crud')
    else:
        form = DiarioForm()

    context = {
        'form': form,
    }

    return render(request, 'caosnews/agregardiario.html', context)

def eliminardiario(request,id):
    diar=Diario.objects.get(id=id)
    diar.delete()
    return redirect('crud')

def actualizardiario(request, id):
    diario = Diario.objects.get(id=id)

    if request.method == 'POST':
        form = DiarioForm(request.POST, request.FILES, instance=diario)
        if form.is_valid():
            form.save()
            return redirect('crud')
    else:
        form = DiarioForm(instance=diario)
    context = {
        'form': form,
        'diario': diario,
    }
    return render(request, 'caosnews/actualizardiario.html', context)

def agregarsuscripcion(request):
    if request.method == 'POST':
        form = SuscripcionForm(request.POST)
        if form.is_valid():
            form.save()
            return redirect('crud')
    else:
        form = SuscripcionForm()
    
    context = {
        'form': form,
    }
    
    return render(request, 'caosnews/agregarsuscripcion.html', context)

def eliminarsuscripcion(request,id):
    susc=Suscripcion.objects.get(id=id)
    susc.delete()
    return redirect('crud')

def actualizarsuscripcion(request, id):
    suscripcion = Suscripcion.objects.get(id=id)

    if request.method == 'POST':
        form = SuscripcionForm(request.POST, instance=suscripcion)
        if form.is_valid():
            form.save()
            return redirect('crud')
    else:
        form = SuscripcionForm(instance=suscripcion)
    context = {
        'form': form,
        'suscripcion': suscripcion,
    }
    return render(request, 'caosnews/actualizarsuscripcion.html', context)

