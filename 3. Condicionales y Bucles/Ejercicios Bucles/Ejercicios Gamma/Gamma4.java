import java.util.Scanner;

public class Gamma4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X = 0;;

        System.out.print("Introduce un número entero positivo: ");
        X = input.nextInt();

        for (int l = 1; l <= X; l++) {
            System.out.println("Tabla del " + l);
            for (int i = 1; i <= 10; i++) {
                System.out.println(l + " * " + i + " = " + (l * i));
            }
            System.out.println("");
        }
    }  
}
