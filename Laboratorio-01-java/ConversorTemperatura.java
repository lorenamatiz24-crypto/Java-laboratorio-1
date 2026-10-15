import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Grados Celsius: ");
        double celsius = scanner.nextInt();

        System.out.println("C°: " + celsius);
        System.out.println("Calculo Fahrenheit");
        System.out.println("F°: " + (celsius * 9 / 5) + 32);

        scanner.close();
    }
}
