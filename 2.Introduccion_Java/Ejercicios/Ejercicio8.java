public class Main
{
    public static void main(String[] args) {
        int dinerocuenta = 2000;
        int meses = 6;
        double plazofijo = 0.0275 / 12 * meses;
        double ganancias = dinerocuenta * plazofijo;
        double intereses = ganancias * 0.18;
         
        System.out.println("Dinero en la cuenta: " + dinerocuenta);
        System.out.println("Meses transcurridos: " + meses);
        System.out.println("Parte proporcional del plazo fijo anual: " + plazofijo);
        System.out.println("En " + meses + " meses, el plazo fijo habrá generado: " + ganancias);
        System.out.println("Los intereses sobre el plazo fijo serán: " + intereses);
        System.out.println("En total, habrá obtenido: " + (dinerocuenta + ganancias - intereses));
    }
}
