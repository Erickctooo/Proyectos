from django.db import models

# Create your models here.
class Producto(models.Model):
    nombre=models.CharField(max_length=50)
    stock=models.IntegerField()
    precio=models.IntegerField()
    foto=models.ImageField(null=True, blank=True, upload_to="Examen_SanMartin_Herrera",)


class Catalogo(models.Model):
    mes=models.DateField(default=None, null=True, blank=True)
    stock=models.IntegerField()
    precio=models.IntegerField()
    foto=models.ImageField(null=True, blank=True, upload_to="Examen_SanMartin_Herrera",)
    
