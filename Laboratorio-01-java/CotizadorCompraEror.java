import java.util.Scanner;

public class CotizadorCompraEror {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre: ");
        String nombre = scanner.nextLine(); //Cuando String cambia a string se genera error ya que esta en minuscula y no identifica el tipo de dato.
        //Cuando scanner cambia a Scanner se genera error y no recibe ningun tipo de dato en consola.

        System.out.println("Producto: ");
        String producto = scanner.nextLine();

        System.out.println("Precio: ");
        int precio = scanner.nextInt(); //Cuando scanner.nextInt() cambia a scanner.nextLine() se genera error por el tipo de datos, ya que debe recibir tipo Int y no Line que es de String.
        scanner.nextLine();

        System.out.println("Cantidad: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Porcentaje de descuento: ");
        int descuento = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Porcentaje de impuesto: ");
        int impuesto = scanner.nextInt();

        String vendedor = "Lucas";
        double costoEnvio = 15000.0;
        int codigoCotizacion = 749;
        
        //Calcular subtotal de toda la compra
        double Subtotal = precio * cantidad;

        //Calcula y aplica el descuento al subtotal
        double calculoDescuento = descuento / 100.0;
        double ValorDescuento = Subtotal * calculoDescuento;

        //Del calculo anterior se obtiene la base
        double base = Subtotal - ValorDescuento;

        //Luego se calcula el impuesto usando el subtotal
        double calculoImpuesto = impuesto / 100.0; //Cuando se hace una operación incorrecta, no da el resultado esperado.
        double Impuesto = base * calculoImpuesto;

        //Luego se agrega la base mas el impuesto para obtener el total
        double total = base + Impuesto + costoEnvio;


        System.out.println("=================");
        System.out.println(" COTIZADOR JAVA ");
        System.out.println("=================");
        System.out.println("                 ");
        System.out.println("Vendedor: " + vendedor);
        System.out.println("Numero de cotizacion: " + codigoCotizacion);
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Producto: " + producto);
        System.out.println("Precio unitario: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Descuento (%): " + descuento);
        System.out.println("Impuesto (%): " + impuesto);
        System.out.println("                 ");
        System.out.println("-----------------");
        System.out.println(" RESUMEN DE COMPRA ");
        System.out.println("-----------------");
        System.out.println("Cliente: " + nombre);
        System.out.println("Producto: " + producto);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + Subtotal);
        System.out.println("Descuento: $" + ValorDescuento);
        System.out.println("Base: $" + base);
        System.out.println("Impuesto: $" + Impuesto);
        System.out.println("TOTAL: $" + total);

        scanner.close();
    }
}
