import java.util.Scanner;

public class Alpha9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i;
        int A, B;
        int variableMult = 1;
        int totalMult = 1;

        System.out.print("Introduce un número entero: ");
        A = input.nextInt();
        System.out.print("Introduce otro número entero: ");
        B = input.nextInt();

        System.out.println("La multiplicación de los números naturales entre " + A + " y " + B + ":");
            for (i = A; i <= B; i++) {
                totalMult = i * variableMult;
                variableMult = totalMult;
            }
        System.out.println(totalMult);
        
    }
}