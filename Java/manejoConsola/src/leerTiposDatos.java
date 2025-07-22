import java.util.Scanner;

public class leerTiposDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Leer distintos tipos de datos
        // Leer un tipo int
        System.out.println("Ingresar tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Tu edad es: " + edad);

        // Leer tipo double
        System.out.println("Ingresar tu altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Tu altura es: " + altura);

        //consumimos el caracter salto de linea
        scanner.nextLine();

        // Leer tipo String
        System.out.println("Ingresar nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Tu nombre es: " + nombre);

        // Conversion de datos
        System.out.println("Proporciona un valor entero: ");
        //String enteroString = scanner.nextLine();
        //int entero = Integer.parseInt(enteroString);
        var entero = Integer.parseInt(scanner.nextLine());
        System.out.println("Entero = " + entero);

        // Tipo flotante
        System.out.println("Proporciona un valor de tipo flotante: ");
        var flotante = Float.parseFloat(scanner.nextLine());
        System.out.println("flotante =" + flotante);



    }
}
