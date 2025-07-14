import java.util.Scanner;

public class ResetasCocina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***Recetas de cocina***");
        System.out.print("Ingresar el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa ingredientes: ");
        String ingredientes = scanner.nextLine();
        System.out.print("Ingresa tiempo de preparacion (min): ");
        int minPrep = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingresa la dificultad: ");
        String dif = scanner.nextLine();

        System.out.println("\n***Receta de cocina***");
        System.out.println("Nombre Receta: "+nombre);
        System.out.println("Ingredientes: "+ingredientes);
        System.out.println("Tiempo preparacion: "+minPrep+ " minutos");
        System.out.println("Dificultad: "+dif);



    }
}
