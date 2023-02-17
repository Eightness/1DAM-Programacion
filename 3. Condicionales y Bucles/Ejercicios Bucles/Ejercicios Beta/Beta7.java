import java.net.SocketPermission;
import java.util.Scanner;

public class Beta7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long N;
        long factorial = 0;

        System.out.print("Introduzca un número entero: ");
        N = input.nextInt();  

        factorial = N;

        for (int i = 1; i < N; i++) {
            factorial *= (N - i);
        }
        System.out.println("El factorial de " + N + " es: " + factorial);
    }
}