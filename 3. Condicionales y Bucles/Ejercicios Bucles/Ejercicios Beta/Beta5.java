import java.net.SocketPermission;
import java.util.Scanner;

public class Beta5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int A, B;
        int sumaPares = 0;
        int sumaImpares = 0;

        System.out.println("Introduzca un número entero: ");
        A = input.nextInt();  
        System.out.println("Introduzca otro número entero: ");
        B = input.nextInt();  

        for (int i = A; i <= B; i++) {
            if (i % 2 == 0)
                sumaPares += i;
            else    
                sumaImpares += i;
            
        }
        
        System.out.println(sumaPares);
        System.out.println(sumaImpares);
    
    }
}