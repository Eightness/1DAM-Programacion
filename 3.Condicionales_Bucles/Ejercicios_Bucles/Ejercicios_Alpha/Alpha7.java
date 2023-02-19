import java.util.Scanner;

public class Alpha7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i;
        int A, B;
        int variableSuma = 0;
        int totalSuma = 0;

        System.out.print("Introduce un número entero: ");
        A = input.nextInt();
        System.out.print("Introduce otro número entero: ");
        B = input.nextInt();

        System.out.println("La suma de los números naturales entre " + A + " y " + B + ":");
            for (i = A; i <= B; i++) {
                totalSuma = i + variableSuma;
                variableSuma = totalSuma;
            }
        System.out.println(totalSuma);
        
    }
}