public class CaracteresEspeciales {
    public static void main(String[] args) {
        //Caracteres especiales
        // \n -- imprime salto de linea
        var cadena1 = "hola\nMundo";
        System.out.println("Cadena1 = "+ cadena1);

        // \t - tabulador

        var cadena2 = "\tHola\tMundo";
        System.out.println("cadena2 : "+cadena2 );
        // \' -- agrega comilla simple
        var cadena3 = "Hola\' Mundo";
        // \" - agrega comilla doble
        var cadena4 = "hola\"Mundo";
        System.out.println("cadena4 = "+ cadena4);

        // \\ -- caracter barra invertida
        var cadena5 = "Hola \\ Mundo";
        System.out.println("cadena 5 = "+cadena5);

    }
}
