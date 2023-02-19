import java.util.Scanner;

public class Beta3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        int negative = 0;
        int positive = 0;

        System.out.println("Vaya introduciendo una secuencia de números: ");
        do {
            num = input.nextInt();
            if (num < 0) {
                negative += 1;
            }
            if (num > 0) {
                positive += 1;
            }

        }
        while (num != 0);
        
        System.out.println("Números positivos introducidos: " + positive);
        System.out.println("Números negativos introducidos: " + negative);

    }
}