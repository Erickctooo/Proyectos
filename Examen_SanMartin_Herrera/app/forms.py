from django import forms 
from . models import Producto , Catalogo
from django.forms import ModelForm
from django.contrib.auth.forms import UserCreationForm

class ProductoForm(forms.ModelForm):
    class Meta : 
        model=Producto
        fields = ['nombre' , 'stock','precio','foto']


class CatalogoForm(forms.ModelForm):
    class Meta : 
        model=Catalogo
        fields = ['mes' , 'stock','precio','foto']
        widgets = {
            'mes': forms.DateInput(attrs={'type': 'date'}),
            }
        

class CustomUserCreationForm(UserCreationForm):
    pass