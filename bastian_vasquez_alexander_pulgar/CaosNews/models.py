from django.db import models

# Create your models here.

class Revista(models.Model):
    nombre=models.CharField(max_length=50)
    articulo=models.IntegerField()
    mes=models.CharField(max_length=50)
    stock=models.IntegerField()
    precio=models.IntegerField()
    foto=models.ImageField(null=True, blank=True, upload_to="bastian_vasquez_alexander_pulgar",)

class Diario(models.Model):
    dia=models.DateField(default=None, null=True, blank=True)
    stock=models.IntegerField()
    precio=models.IntegerField()
    foto=models.ImageField(null=True, blank=True, upload_to="bastian_vasquez_alexander_pulgar",)

class Suscripcion(models.Model):
    tiempo=models.CharField(max_length=20)
    precio=models.IntegerField()
    descripcion=models.CharField(max_length=100)