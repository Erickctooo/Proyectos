
public class Main {
    public static void main(String[] args) {

        String nombreCliente = "Erick San Martin";
        int diasEstancia = 10;
        final int tarifaDiaria = 50000;
        boolean vistaAlMar = true ;

        System.out.println("Nombre del Cliente: "+" "+nombreCliente);
        System.out.println("Dias de estancia: "+" "+diasEstancia);
        System.out.println("Tarifa Diaria: "+" "+tarifaDiaria);
        System.out.println("Vista al mar: "+" "+vistaAlMar);

        System.out.println("----------------------------------------------");

        System.out.println("Nombre del Cliente: "+" "+nombreCliente);
        diasEstancia = 20 ;
        System.out.println("Dias de estancia: "+" "+diasEstancia);
        System.out.println("Tarifa Diaria: "+" "+tarifaDiaria);
        vistaAlMar = false;
        System.out.println("Vista al mar: "+" "+vistaAlMar);


    }
}