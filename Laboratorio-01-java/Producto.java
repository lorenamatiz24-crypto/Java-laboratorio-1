public class Producto {
    public static void main(String[] args) {
        String nombre  = "Lapiz";
        int codigo = 233;
        double precio = 2000.0;
        int cantidad = 10;
        char categoria = 'A';
        boolean estado = true;
        final double impuesto = 0.19;
        
        System.out.println("=================");
        System.out.println("PRODUCTO");
        System.out.println("=================");

        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Categoria: " + categoria);
        System.out.println("Estado: "+ estado);
        System.out.println("Impuesto: " + impuesto);
    }
}
