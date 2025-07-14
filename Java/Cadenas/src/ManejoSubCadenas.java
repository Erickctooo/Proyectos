public class ManejoSubCadenas {
    public static void main(String[] args) {
        //tema de subcadenas
        // subString((inicio, fin (sin incluirlo)
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = "+ cadena1);

        //SubCadena
        var subCadena1 = cadena1.substring(0 , 4);
        System.out.println("subCadena1: "+ subCadena1);

        var subCadena2 = cadena1.substring(5,10);
        System.out.println("subCadena2: "+ subCadena2);
    }

}
