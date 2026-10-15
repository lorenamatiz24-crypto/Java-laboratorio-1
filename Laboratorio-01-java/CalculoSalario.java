import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Trabajador: ");
        String nombre = scanner.nextLine();

        System.out.println("Horas: ");
        double horas = scanner.nextInt();

        System.out.println("Valor por hora: ");
        double valor = scanner.nextInt();

        System.out.println("Resumen de pago");
        System.out.println("Trabajador: " + nombre);
        System.out.println("Horas Trabajadas: " + horas);
        System.out.println("Valor por hora: " + valor);
        System.out.println("Pago total: " + valor * horas);

        scanner.close();
    }
}
