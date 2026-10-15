import java.util.Scanner;

public class LecturasMixtas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Edad: ");
        //int edad = scanner.nextInt();

        //System.out.println("Nombre: ");
        //String nombre = scanner.nextLine();

        //corregido

        System.out.println("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        scanner.close();
    }
}
