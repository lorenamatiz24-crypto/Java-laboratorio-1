import java.util.Scanner;

public class DatosUsuarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ciudad: ");
        String ciudad = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Cursos terminados: ");
        int cursos = scanner.nextInt();

        System.out.println("Nombre: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Edad: " + edad);
        System.out.println("Cursos terminados: " + cursos);
        
        scanner.close();
    }
}
