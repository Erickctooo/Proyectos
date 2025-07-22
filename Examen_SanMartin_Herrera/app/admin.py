from django.contrib import admin
from .models import Producto , Catalogo
# Register your models here.

class ProductoAdmin(admin.ModelAdmin):
    list_display="nombre","stock","precio","foto"
admin.site.register(Producto,ProductoAdmin)

class CatalogoAdmin(admin.ModelAdmin):
    list_display="mes","stock","precio","foto"
admin.site.register(Catalogo,CatalogoAdmin)