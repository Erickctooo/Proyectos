public class metodoCadenas {
    public static void main(String[] args) {

        var cadena1 = "Hola Mundo";

        // obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud = "+ longitud);

        // remplazar caracteres
        var nuevaCadena = cadena1.replace('o','a');
        System.out.println("nueva cadena: "+ nuevaCadena);

        //Convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("Mayusculas: "+ mayusculas);

        // Convertir a minisculas
        System.out.println("minisculas: "+cadena1.toLowerCase());

        //Eliminar espacios al inicio y al final
        var cadena2 = "Erick San Martin      ";
        System.out.println("cadena2 con espacios = "+ cadena2);
        System.out.println("cadena2 sin espacios = "+ cadena2.trim());


    }
}
