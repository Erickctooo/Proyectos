import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***Sistema de Empleados***");

        // Nombre Empleado
        System.out.print("Nombre del empleado: ");
        String nombreEmpleado = scanner.nextLine();

        // Edad Empleado
        System.out.print("Edad del empleado: ");
        int edadEmpleado = Integer.parseInt(scanner.nextLine());

        // Sueldo del empleado
        System.out.print("Suedo del empleado: ");
        Double sueldoEmplado = Double.parseDouble(scanner.nextLine());

        // Es jefe de departamento
        System.out.print("Es jefe de departamento (true/false):  ");
        boolean jefeDepart = Boolean.parseBoolean(scanner.nextLine());

        // Imprimir los valores del empleado
        System.out.println("\nDatos del Empleado: ");
        System.out.println("\tNombre: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado + "años");
        //System.out.println("\tSueldo: " + sueldoEmplado);
        System.out.printf("\tSueldo: $%.2f%n", sueldoEmplado);
        System.out.println("\tEs jefe de Departamento? " + jefeDepart);





    }
}
