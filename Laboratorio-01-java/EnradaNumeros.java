import java.util.Scanner;

public class EnradaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Edad: ");
        int edad = scanner.nextInt();

        System.out.println("Cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.println("Precio: ");
        int precio = scanner.nextInt();


        System.out.println("tu edad. " + edad);
        System.out.println("la cantidad. " + cantidad);
        System.out.println("el precio. " + precio);

        scanner.close();
    }
}
