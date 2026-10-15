public class Inventario {
    public static void main(String[] args) {
        String producto = "Monitor";
        int unidad = 8;
        double precio = 720000.0;
        boolean disponible = true;

        System.out.println("Producto: " + producto);
        System.out.println("Unidad: " + unidad);
        System.out.println("Precio: $" + precio);
        System.out.println("Disponible: " + disponible);
        System.out.println("=======================");
        unidad = 5;
        precio = 699000.0;
        System.out.println("Producto: " + producto);
        System.out.println("Unidad: " + unidad);
        System.out.println("Precio: $" + precio);
        System.out.println("Disponible: " + disponible);
    }
}
