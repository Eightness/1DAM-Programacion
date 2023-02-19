import java.util.Scanner;

public class EjercicioF {

    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);

        // int n;
        // int u, d, c;

        // System.out.print("Introduce un número entre 0 y 999: ");
        // n = input.nextInt();

        // if (n < 10){
        //     u = n;
        //     System.out.println(u);
        // }
        
        // if (n >= 10 && n < 100){
        //     u = n % 10;
        //     n /= 10;
        //     d = n;
        //     System.out.println(u + "" + d);
        // }

        // if (n >= 100 && n < 1000){
        //     u = n % 10;
        //     n /= 10;
        //     d = n % 10;
        //     n /= 10;
        //     c = n;
        //     System.out.println(u + "" + d + "" + c);
        // }

        
        int num;
        int dm, um, c, d, u;

        Scanner input = new Scanner(System.in);
       
        System.out.print("Introduzca un número entre 0 y 99.999: ");
        num=input.nextInt();
        
        u = num % 10;
        num = num / 10;
        
        d = num % 10;
        num = num / 10;
        
        c = num % 10;
        num = num / 10;
        
        um = num % 10;
        num = num / 10;
        
        dm = num;

        if (dm == u && um == d)
        System.out.println ("el número es capicúa");
        else
        System.out.println ("el número NO es capicúa");
        
    }
}
