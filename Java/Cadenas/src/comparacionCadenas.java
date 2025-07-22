public class comparacionCadenas {
    public static void main(String[] args) {
        // comparacion cadenas(pool de cadenas)

        var cadena1 = "Java";
        var cadena2 = "Java";

        var cadena3 = new String("Java");// creacion de nuevo objeto 

        // comparcion de cadenas (==) comparan la referencia

        System.out.print("cadena 1 es igual en referencia a cadena 2: ");
        System.out.println(cadena1 == cadena2);
        // comparar cadena 1 con cadena 3 ()referencia a cadena3
        System.out.print("cadena 1 es igual a referencia de cadena 3: ");
        System.out.println(cadena1 == cadena3);

        // comparar contenido usaremos el metodo equeals
        System.out.println("cadena 1 es igual en contenido a cadena 3: ");
        System.out.println(cadena1.equals(cadena3));


    }
}
