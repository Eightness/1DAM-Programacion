public class Ejercicio6
{
    public static void main(String[]args)   
    {
        double precioDeportivas;
        double rebaja;
        double total;
    
        precioDeportivas = 85;
        rebaja = 0.15;
        total = precioDeportivas - (precioDeportivas * rebaja);

        System.out.print("El precio de las deportivas con la rebaja aplicada es: " + total);
    }
}