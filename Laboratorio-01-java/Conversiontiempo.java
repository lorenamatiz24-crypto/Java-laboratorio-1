public class Conversiontiempo {
    public static void main(String[] args) {
        int totalMinutos = 367;
        int horas = totalMinutos / 60;
        int minutos = totalMinutos % 60; 


        System.out.println("Horas: " + horas);
        System.out.println("Minutos restantes:" + minutos);
        System.out.println("============================");
        
        int totalMinutos1 = 458;
        int Horas = totalMinutos1 / 60;
        int Minutos = totalMinutos1 % 60;
        
        System.out.println("Horas: " + Horas);
        System.out.println("Minutos restantes:" + Minutos);
    }
}