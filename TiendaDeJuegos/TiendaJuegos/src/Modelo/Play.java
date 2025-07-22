
package Modelo;

public class Play extends Juego {
    private int annolanzamiento;
    private boolean dlc ;

    public Play(int annolanzamiento, boolean dlc, String codigo, String nombrejuego, String nombredistribuidor, int preciojuego, int stock) {
        super(codigo, nombrejuego, nombredistribuidor, preciojuego, stock);
        this.annolanzamiento = annolanzamiento;
        this.dlc = dlc;
    }

    public int getAnnolanzamiento() {
        return annolanzamiento;
    }

    public boolean isDlc() {
        return dlc;
    }

    public void setAnnolanzamiento(int annolanzamiento) {
        this.annolanzamiento = annolanzamiento;
    }

    public void setDlc(boolean dlc) {
        this.dlc = dlc;
    }
    @Override
    public int descuento(int cant)
    {
        int descuento = 0;
        if(dlc==true)
        {
            descuento = (int)((super.getPreciojuego()*cant)*0.2);
        }
        return descuento;          
    }
    @Override
    public int totalApagar(int cant)
    {
        int total=0;
         if(super.existencia(cant)==true)
             total = (super.getPreciojuego()*cant)-descuento(cant);
        return total;
    }
}
