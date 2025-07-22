public class BusquedaSubCadena {
    public static void main(String[] args) {
        //Buscar subcadenas
        //indexOf -devuelve ewl indice de la primera aparicion de la subcadena

        var cadena1 ="Hola Mundo";
        // subCadena a buscar "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = "+indice1);
        // lasindexOf  devuelve el ultimo indece de la aparacion de la subcadena
        // subcadena de mundo
       var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = "+indice2);
        //subCadena no encontras devuelve -1



    }
}
