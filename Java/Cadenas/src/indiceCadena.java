public class indiceCadena {
    public static void main(String[] args) {
        var cadena1 = "hola Mundo";
        var cantidadCaracteres = cadena1.length();
        System.out.println(cantidadCaracteres);
        var primerCaracter = cadena1.charAt(0);
        System.out.println("Primer caracter: "+ primerCaracter);
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimo caracter: "+ ultimoCaracter);
        var letraM = cadena1.charAt(5);
        System.out.println("Letra M: "+letraM);
    }
}
