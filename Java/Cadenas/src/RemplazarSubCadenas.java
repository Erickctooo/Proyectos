public class RemplazarSubCadenas {
    public static void main(String[] args) {
        var cadena = "Hola Mundo";
        System.out.println("Cadenas Original: "+ cadena);

        //Remplazar "Mundo" por "a todos"

        var cadenaNueva = cadena.replace("Mundo","a todos");
        System.out.println("CadenaNueva: "+cadenaNueva);

        // Remplazar "Hola" por "adios"
        cadenaNueva = cadena.replace("Hola","Saludos");
        System.out.println("CadenaNueva = "+ cadenaNueva);

    }
}
