import java.net.SocketPermission;
import java.util.Scanner;

public class Beta10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X;
        int divisores = 0;

        System.out.print("Introduzca un número entero (positivo): ");
        X = input.nextInt();  

        for (int i = 1; i < X; i++) {
            if (X % i == 0)
                divisores += 1;
        }

        if (divisores > 2)
            System.out.println(X + " no es un número primo.");
        else
            System.out.println(X + " es un número primo.");
    }
}