public class Main
{
    public static void main(String[] args) {
        int dinerocuenta = 2000;
        int meses = 6;
        double plazofijo = 0.0275 / 12 * meses;
        double ganancias = dinerocuenta * plazofijo;
        double intereses = ganancias * 0.18;
        
        System.out.println("En total, habrá obtenido: " + (dinerocuenta + ganancias - intereses));
    }
}
