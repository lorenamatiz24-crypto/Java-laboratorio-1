public class Operadores {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println("=================================");
        int resultadoEntero = 5/2;
        double resultadoDecimal = 5.0/2;
        System.out.println(resultadoEntero);
        System.out.println(resultadoDecimal);
        System.out.println("=================================");
        System.out.println("los resultados son diferentes ya que ne la primera se hace una operacion con solo enteros y en la otra se hace con decimales");
        System.out.println("=================================");
        double otroResultado = 5/2;
        System.out.println(otroResultado);
        System.out.println("=================================");

        int resultado1 = 10+5*2;
        int resultado2 = (10+5)*2;
        System.out.println(resultado1);
        System.out.println(resultado2);
    }

}
