import java.util.Scanner;

public class Beta2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i;
        int variableSuma = 0;
        int totalSuma = 0;
        int variableMult = 1;
        int totalMult = 1;

        System.out.println("La suma de los 10 primeros números naturales: ");
            for (i = 1; i <= 10; i++) {
                totalSuma = i + variableSuma;
                variableSuma = totalSuma;
            }
        System.out.println(totalSuma);

        System.out.println("La multiplicaciónde los 10 primeros números naturales: ");
            for (i = 1; i <= 10; i++) {
                totalMult = i * variableMult;
                variableMult = totalMult;
            }
        System.out.println(totalMult);
        
    }
}