import java.util.Scanner;

public class Alpha12 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int A, B;

        System.out.print("Introduzca un número entero: ");
        A = input.nextInt();
        System.out.print("Introduzca otro número entero: ");
        B = input.nextInt();

        System.out.println("Los números positivos entre " + A + " y " + B + " son: ");
        for (int i = A; i <= B; i++) {
            if (i >= 0)
                System.out.println(i);

        }
    }
}
