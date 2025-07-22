
package Modelo;


public class Xbox extends Juego
{
    private boolean multijugador;
    private int duracionjuego;

    public Xbox(boolean multijugador, int duracionjuego, String codigo, String nombrejuego, String nombredistribuidor, int preciojuego, int stock) {
        super(codigo, nombrejuego, nombredistribuidor, preciojuego, stock);
        this.multijugador = multijugador;
        this.duracionjuego = duracionjuego;
    }

    public boolean isMultijugador() {
        return multijugador;
    }

    public int getDuracionjuego() {
        return duracionjuego;
    }

    public void setMultijugador(boolean multijugador) {
        this.multijugador = multijugador;
    }

    public void setDuracionjuego(int duracionjuego) {
        this.duracionjuego = duracionjuego;
    }
    
    @Override
    public int descuento(int cant)
    {
        int descuento = 0;
        if(multijugador==true)
        {
            descuento = (int)(super.getPreciojuego()*0.2);
        }
        return descuento;
    }
    
    @Override
    public int totalApagar(int cant)
    {
        int total=0;
         if(existencia(cant)==true)
             total = (super.getPreciojuego()*cant)-descuento(cant);
         return total;
    }
}
