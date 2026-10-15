import java.util.Scanner;

public class ProgramaIncompleto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Producto: ");
        String producto = scanner.nextLine();

        System.out.println("Precio: ");
        double precio = scanner.nextDouble();

        System.out.println("Cantidad: ");
        int cantidad = scanner.nextInt();

        double subtotal = scanner.nextDouble();

        System.out.println("Producto: " + producto);
        System.out.println("Subtotal: $" + subtotal);

        scanner.close();

        //para que sirve scanner, sirve para recibir info por consola.
        //que diferencia hay entre nexteLine(), nextInt() y nextDouble(), con nextLine() ingresamos texto, con nextInt() ingresamos solo numeros enteros y con nextDouble ingresamos numeros 
        //por que a veces se usa un nextLine() adicional despues de leer un numero, se usa para hacer un salto de linea y no generar error a la hora de ingresar otro dato.
        //que ventaja tiene pedir los datos al usuario en lugar de escribirlos directamente en el codigo, la ventaja es que se puede ingresar cualquier dato solicitado y no depender de un solo dato en el codigo, por lo que simplemente se debe ingresar mas no cambiar.
    }
}
