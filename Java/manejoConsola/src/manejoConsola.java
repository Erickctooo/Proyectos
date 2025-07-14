import java.util.Scanner;

public class manejoConsola {
    public static void main(String[] args) {
        // Introducir valores por consola
        Scanner scanner = new Scanner(System.in); // in - input - entrada de datos

        System.out.println("Ingresar tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Tu nombre es: " + nombre);


    }
}
