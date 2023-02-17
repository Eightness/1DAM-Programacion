import java.util.Scanner;

public class Gamma11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduzca un número entero positivo: ");
        int X = input.nextInt();

        for (int l = 1; l <= X ; l++) {

            if (l == 1) {
                for (int i = 1; i <= X; i++) {
                    System.out.print("*");
                    System.out.print(" ");
                }
            }

            if (l > 1 && l < X) {
                for (int i = 1; i <= X; i++) {
                    if (i == 1)
                        System.out.print("*"); 
                    
                    if (i > 1 && i < X) {
                        System.out.print(" ");
                        System.out.print(" ");
                    }
                    
                    if (i == X) {
                        System.out.print(" ");
                        System.out.print("*");
                    }
                }
            }

            if (l == X) {
                for (int i = 1; i <= X; i++) {
                    System.out.print("*");
                    System.out.print(" ");
                }
            }

            System.out.println(""); 
        }
    }
}  