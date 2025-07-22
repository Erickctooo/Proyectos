from django.urls import path
from . import views
from django.conf import settings
from django.conf.urls.static import static

urlpatterns = [
    path('', views.index, name='index'),
    path('caosnews/mvision.html', views.nosotros, name='nosotros'),
    path('caosnews/Galeria.html', views.galeria, name='galeria'),
    path('caosnews/Contacto.html', views.contacto, name='contacto'),
    path('caosnews/Divisas.html', views.divisas, name='divisas'),
    path('caosnews/crud.html', views.crud, name='crud'),

    path('caosnews/agregar.html', views.agregar, name='agregar'),
    path('caosnews/eliminarrev/<int:id>/', views.eliminarrev, name='eliminarrev'),
    path('caosnews/actualizarrev/<int:id>/', views.actualizarrev, name='actualizarrev'),

    path('caosnews/agregardiario.html', views.agregardiario, name='agregardiario'),
    path('caosnews/eliminardiario/<int:id>/', views.eliminardiario, name='eliminardiario'),
    path('caosnews/actualizardiario/<int:id>/', views.actualizardiario, name='actualizardiario'),

    path('caosnews/agregarsuscripcion.html', views.agregarsuscripcion, name='agregarsuscripcion'),
     path('caosnews/eliminarsuscripcion/<int:id>/', views.eliminarsuscripcion, name='eliminarsuscripcion'),
     path('caosnews/actualizarsuscripcion/<int:id>/', views.actualizarsuscripcion, name='actualizarsuscripcion'),
]+ static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)