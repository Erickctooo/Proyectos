from django.contrib import admin
from .models import Revista, Diario ,Suscripcion

# Register your models here.

class RevistasAdmin(admin.ModelAdmin):
    list_display="nombre", "articulo", "mes", "stock", "precio", "foto"
admin.site.register(Revista,RevistasAdmin)

class DiariosAdmin(admin.ModelAdmin):
    list_display="dia", "stock", "precio", "foto"
admin.site.register(Diario,DiariosAdmin)

class SuscripcionAdmin(admin.ModelAdmin):
    list_display="tiempo", "precio", "descripcion"
admin.site.register(Suscripcion,SuscripcionAdmin)