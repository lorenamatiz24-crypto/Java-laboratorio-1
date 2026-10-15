import java.util.Scanner;

public class CotizadorDepuracion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("  RETO DE DEPURACIÓN JAVA    ");
        System.out.println("=============================");

        System.out.print("Nombre del cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Producto: ");
        String producto = scanner.nextLine();

        System.out.print("Precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();

        // =========================================================================
        // ERROR 1: ERROR DE SINTAXIS
        // -------------------------------------------------------------------------
        // Qué ocurre: Si olvidas colocar el punto y coma (;) al final de la línea.
        // double descuentoPorcentaje = scanner.nextDouble()
        // El compilador (javac) se detendrá y mostrará un mensaje indicando que
        // esperaba un ';' (error: ';' expected).
        // =========================================================================
        System.out.print("Descuento (%): ");
        double descuentoPorcentaje = scanner.nextDouble(); // Corregido con ';'

        System.out.print("Impuesto (%): ");
        double impuestoPorcentaje = scanner.nextDouble();

        // =========================================================================
        // ERROR 2: ERROR RELACIONADO CON UN TIPO DE DATO (Type Mismatch)
        // -------------------------------------------------------------------------
        // Qué ocurre: Intentar almacenar texto o un tipo incompatible en una variable
        // numérica, por ejemplo: int subtotal = "360000";
        // El compilador genera un error de tipo incompatible (incompatible types),
        // porque una variable de tipo 'int' no puede guardar una cadena de texto.
        // =========================================================================
        double subtotal = precioUnitario * cantidad; // Correcto: ambos son numéricos

        // =========================================================================
        // ERROR 3: ERROR EN UNA EXPRESIÓN ARITMÉTICA (Lógico / Semántico)
        // -------------------------------------------------------------------------
        // Qué ocurre: El código compila y ejecuta sin errores en la terminal, pero el
        // cálculo matemático es incorrecto. Por ejemplo, si calculas el descuento
        // dividiendo entre 10 en lugar de entre 100:
        // double valorDescuento = subtotal * (descuentoPorcentaje / 10.0);
        // Esto alteraría por completo el resultado final de la compra sin avisarte.
        // =========================================================================
        double valorDescuento = subtotal * (descuentoPorcentaje / 100.0); // Correcto

        double base = subtotal - valorDescuento;
        double valorImpuesto = base * (impuestoPorcentaje / 100.0);
        double total = base + valorImpuesto;

        // Salida del programa
        System.out.println("\n-----------------------------");
        System.out.println("      RESULTADO DEPURADO     ");
        System.out.println("-----------------------------");
        System.out.println("Cliente: " + cliente);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + valorDescuento);
        System.out.println("TOTAL FINAL: $" + total);

        scanner.close();
    }
} 