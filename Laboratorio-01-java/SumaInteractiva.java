import java.util.Scanner;

public class SumaInteractiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.println("Suma: ");
        System.out.println(numero1 + numero2);
        System.out.println("===========");
        System.out.println("Resta: ");
        System.out.println(numero1 - numero2);
        System.out.println("===========");
        System.out.println("Multiplicación: ");
        System.out.println(numero1 * numero2);
        System.out.println("===========");
        System.out.println("Division: ");
        System.out.println(numero1 / numero2);
        System.out.println("===========");
        System.out.println("Residuo: ");
        System.out.println(numero1 % numero2);

        scanner.close();
    }
}
