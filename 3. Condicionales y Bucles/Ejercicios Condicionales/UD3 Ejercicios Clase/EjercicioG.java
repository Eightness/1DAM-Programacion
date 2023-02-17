import java.util.Scanner;

public class EjercicioG {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        int u, d, c;

        System.out.print("Introduce un número entre 0 y 999: ");
        n = input.nextInt();

        if (n < 10)
            System.out.println(n + " sólo tiene una cifra.");
        
        if (n >= 10 && n < 100){
            u = n % 10;
            n /= 10;
            d = n;

            if ( u == d)
                System.out.println("Es capicua.");

                else
                    System.out.println("No es capicua.");
        }

        if (n >= 100 && n < 1000){
            u = n % 10;
            n /= 10;
            d = n % 10;
            n /= 10;
            c = n;

            if ( u == c)
                System.out.println("Es capicua.");

                else
                    System.out.println("No es capicua.");
        }
    }
}
