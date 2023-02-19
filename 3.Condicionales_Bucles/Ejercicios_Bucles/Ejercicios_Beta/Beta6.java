import java.net.SocketPermission;
import java.util.Scanner;

public class Beta6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int A, B;
        int res = 0;

        System.out.println("Introduzca un número entero: ");
        A = input.nextInt();  
        System.out.println("Introduzca otro número entero: ");
        B = input.nextInt();  

        res = A;

        for (int i = 1; i < B; i++) {
            res *= A;
            
        }
        
        System.out.println(res);
    
    }
}