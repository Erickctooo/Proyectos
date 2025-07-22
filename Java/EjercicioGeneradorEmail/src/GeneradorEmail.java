import java.sql.SQLOutput;

public class GeneradorEmail {
    public static void main(String[] args) {

        //Solucion mia

        String nombre = "Erick San Martin";
        String empresa = "Global Mentoring";
        String dominio = " cl";

        System.out.println("***** Generador de Email *****");

        System.out.println("Nombre Usuario: "+nombre);
        // Normalizar Nombre
        // limpiar espacios
        var nombreNormalizado = nombre.strip();
        //remplazar espacios con puntos
        nombreNormalizado = nombre.replace(" ",".");
        // hacer minuscula todo el nombre
        nombreNormalizado = nombreNormalizado.toLowerCase();
        System.out.println("Nombre usuario Normalizado: "+nombreNormalizado);

        System.out.println("\nNombre empresa: "+empresa);
        var extencionD = dominio.replace(" ",".").trim();
        System.out.println("Extension Del Domino: "+extencionD);
        // normalizar Datos Empresa
        var normalizadoEmpresa = empresa.replace(" ",".").toLowerCase();
        var dominioEmailNormalizado = ("@"+normalizadoEmpresa+extencionD);
        System.out.println("Domino Email Normalizado: "+dominioEmailNormalizado);

        System.out.println("\nEmail Final Generado: "+nombreNormalizado+dominioEmailNormalizado);

    //Solucion del Curso

     /*   System.out.println("*** Generador de Emails ***");
        // Nombre completo del usuario
        var nombreCompleto = " Ubaldo Acosta Soto ";
        System.out.println("nombreCompleto = " + nombreCompleto);

        // Procesar o normalizar el nombrel del usuario
        // Limpiar los espacios en blanco al inicio y al final
        var nombreNormalizado = nombreCompleto.strip();
        // Reemplazar los espacios en blanco por punto
        nombreNormalizado = nombreNormalizado.replace(" ", ".");
        // Convertimos a minúsculas
        nombreNormalizado = nombreNormalizado.toLowerCase();
        System.out.println("nombreNormalizado = " + nombreNormalizado);

        // Datos de la empresa
        var nombreEmpresa = " Global Mentoring ";
        System.out.println("\nNombre empresa: " + nombreEmpresa);
        var extensionDominio = ".com.mx";
        System.out.println("Extensión del dominio: " + extensionDominio);

        // Quitamos los espacios en blanco y convertimos a minúsculas
        var nombreEmpresaNormalizado = nombreEmpresa.strip().replace(" ", ".").toLowerCase();
        var dominioEmailNormalizado = "@" + nombreEmpresaNormalizado + extensionDominio;
        System.out.println("dominioEmailNormalizado = " + dominioEmailNormalizado);

        // Creamos el email final
        var emailNormalizado = nombreNormalizado + dominioEmailNormalizado;
        System.out.println("emailNormalizado = " + emailNormalizado);*/


    }
}
