import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        String nombreProducto = "Zapatillas";
        int precio = 200000;
        int cantidadDisponible = 50;
        boolean disponible = true ;

        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Preio del producto: " + precio);
        System.out.println("Cantidad disponible " + cantidadDisponible);
        System.out.println("Disponible para la venta: " + disponible);

        nombreProducto = "Playstation";
        precio = 250000;
        cantidadDisponible = 40;
        disponible = false ;

        System.out.println("------------------------------------------");

        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Preio del producto: " + precio);
        System.out.println("Cantidad disponible " + cantidadDisponible);
        System.out.println("Disponible para la venta: " + disponible);



    }
}