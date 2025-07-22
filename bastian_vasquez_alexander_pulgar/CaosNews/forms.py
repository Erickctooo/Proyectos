from django import forms
from .models import Revista, Diario, Suscripcion
from django.forms import ModelForm

class RevistaForm(forms.ModelForm):
    class Meta:
        model = Revista
        fields = ['nombre', 'articulo', 'mes', 'stock', 'precio', 'foto']

class DiarioForm(forms.ModelForm):
    class Meta:
        model = Diario
        fields = ('dia', 'stock', 'precio', 'foto')
        widgets = {
            'dia': forms.DateInput(attrs={'type': 'date'}),
            }
        
class SuscripcionForm(forms.ModelForm):
    class Meta:
        model = Suscripcion
        fields = ('tiempo', 'precio', 'descripcion')