import java.util.Scanner;

public class Alpha10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i;
        int precio = 0;

        System.out.println("Introduzca 5 precios: ");
        for (i = 1; i <= 5; i++) {
            precio += input.nextInt();
        }
        System.out.println("La suma de los precios es: " + precio);
        
    }
}