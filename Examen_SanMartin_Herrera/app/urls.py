from django.urls import path
from app import views
from .views import registro
from django.conf import settings
from django.conf.urls.static import static

urlpatterns = [
    path('',views.index, name="Index"),
    path('galeria',views.galeria, name="Galeria"),
    path('sobre',views.sobre, name="Sobre"),
    path('agendar',views.agendar,name="Agendar"),
    path('ubicacion',views.ubicacion,name="Ubicacion" ),
    path('producto',views.producto,name="Producto" ),
    path('carrito',views.carrito,name="Carrito" ),

    path('agregar/', views.agregar, name='agregar'),
    path('eliminar/<int:id>/',views.eliminar,name='eliminar'),
    path('actualizar/<int:id>/',views.actualizar,name='actualizar'),
    


    path('agregar2/', views.agregar2, name='agregar2'),
    path('eliminar2/<int:id>/',views.eliminar2,name='eliminar2'),
    path('actualizar2/<int:id>/',views.actualizar2,name='actualizar2'),
    
    path('registro/',registro, name="registro"),

]+ static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)