import java.util.Scanner;

public class Gamma10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduzca un número entero positivo: ");
        int X = input.nextInt();

        int espacios = 0;

        for (int l = 1; l <= X ; l++) {

            espacios = X - l;

            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            
            for (int i = 1; i <= l; i++) {
                System.out.print("*");
            }
            
            for (int i = 2; i <= l; i++) {
                System.out.print("*");
            }

            System.out.println(""); 
        }
    }
}  