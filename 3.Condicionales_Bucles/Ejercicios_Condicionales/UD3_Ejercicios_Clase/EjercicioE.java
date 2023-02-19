import java.util.Scanner;

public class EjercicioE {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Introduce un número entre 0 y 999: ");
        num = input.nextInt();

        if (num < 10)
            System.out.println(num + " tiene una sola cifra.");
        
        if (num >=10 && num < 100)
            System.out.println(num + " tiene dos cifras.");

        if (num >= 100)
            System.out.println(num + " tiene tres cifras.");
    }
}
