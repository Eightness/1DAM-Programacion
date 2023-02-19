import java.util.Scanner;

public class Alpha2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i, A, B;

        System.out.print("Introduzca un número entero: ");
        A = input.nextInt();
        System.out.print("Introduzca otro número entero: ");
        B = input.nextInt();

        if (A < B) {
            System.out.println("Números enteros entre " + A + " y " + B + ":");
            for (i = A; i <= B; i++) {
                System.out.println(i);
            }
        }

        if (A > B) {
            System.out.println("Números enteros entre " + A + " y " + B + ":");
            for (i = A; i >= B; i--) {
                System.out.println(i);
            }
        }

        if (A == B) {
            System.out.println("Los dos números son iguales.");
            System.out.println(A);
        }
        
    }
}