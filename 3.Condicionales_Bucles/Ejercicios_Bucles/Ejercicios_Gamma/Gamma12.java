import java.util.Scanner;

public class Gamma12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduzca un número entero positivo: ");
        int X = input.nextInt();

        int divisores = 0;

        for (int l = 1; l <= X ; l++) {
            
            for (int i = 1; i <= l ; i++) {
                
                if (l % i == 0) 
                    divisores += 1;

                if (divisores > 2)
                    continue;
                
            }
                
            if (divisores <= 2)
                System.out.println(l);
                
            divisores = 0;

        }
    }
}  