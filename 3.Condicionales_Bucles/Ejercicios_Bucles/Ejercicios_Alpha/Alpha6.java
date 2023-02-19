import java.util.Scanner;

public class Alpha6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i;
        int variableSuma = 0;
        int totalSuma = 0;

        System.out.println("La suma de los 10 primeros números naturales: ");
            for (i = 1; i <= 10; i++) {
                totalSuma = i + variableSuma;
                variableSuma = totalSuma;
            }
        System.out.println(totalSuma);
        
    }
}