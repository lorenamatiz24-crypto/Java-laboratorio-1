import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola. " + nombre);

        scanner.close();

        //Saludo con nombre//
    }
}
