import java.net.SocketPermission;
import java.util.Scanner;

public class Beta8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N;
        int f1 = 1;
        int f2 = 1;
        int fibonacci = 0;

        System.out.print("Introduzca un número entero (positivo): ");
        N = input.nextInt();  

        System.out.println("El/Los primeros " + N + " números de la secuencia de fibonacci son: ");
        
        System.out.println(1);
        System.out.println(1);
        
        for (int i = 1; i < N; i++) {
            fibonacci = f1 + f2;
            f1 = f2;
            f2 = fibonacci;
            System.out.println(fibonacci);
        }
    }
}