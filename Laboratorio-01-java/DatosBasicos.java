public class DatosBasicos {
    public static void main(String[] args) {
        String producto = "teclado";
        int cantidad =3;
        double precio = 85000.0;
        boolean disponible = true;
        char categoria = 'A';

        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: $"+ precio);
        System.out.println("Disponible: " + disponible);
        System.out.println("Categoria:" + categoria);
        System.out.println(cantidad);
        System.out.println("=================================================");
        cantidad = 80;
        System.out.println(cantidad);
        System.out.println("=================================================");
        System.out.println("¿Que valor se muestra primero?");
        System.out.println(" el valor que se muestra es el que esta escrito por defecto");
        System.out.println("==================================================");
        System.out.println("¿Que valor se muestra despues?");
        System.out.println("el valor que se muestra despues es e numero que se modifico despues de mostrar valor por defecto");
        System.out.println("==================================================");
        System.out.println("¿Cambio el tipo de la variable o solamente su contenido?");
        System.out.println("el tipo de la variable no se cambio, lo unico que cambio fue el contenido ya que ese se reemplazo por otro diferente");
    }
}
