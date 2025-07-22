
package Modelo;


public abstract class Juego {
    private String codigo ;
    private String nombrejuego;
    private String nombredistribuidor;
    private int preciojuego;
    private int stock;

    public Juego(String codigo, String nombrejuego, String nombredistribuidor, int preciojuego, int stock) {
        this.codigo = codigo;
        this.nombrejuego = nombrejuego;
        this.nombredistribuidor = nombredistribuidor;
        this.preciojuego = preciojuego;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombrejuego() {
        return nombrejuego;
    }

    public String getNombredistribuidor() {
        return nombredistribuidor;
    }

    public int getPreciojuego() {
        return preciojuego;
    }

    public int getStock() {
        return stock;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombrejuego(String nombrejuego) {
        this.nombrejuego = nombrejuego;
    }

    public void setNombredistribuidor(String nombredistribuidor) {
        this.nombredistribuidor = nombredistribuidor;
    }

    public void setPreciojuego(int preciojuego) {
        this.preciojuego = preciojuego;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
    public abstract int descuento(int cant);
    public abstract int totalApagar(int cant);
   
    public  boolean existencia (int cant)
    {
        if(stock>=cant)
        {
            return true;
        }
        return false;
    }    
    
}
