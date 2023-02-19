import java.util.Scanner;

public class Alpha16 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num;
        int negative = 0;
        int positive = 0;

        System.out.println("Introduzca cinco números enteros: ");
        
        for (int i = 1; i <= 5; i++) {
            num = input.nextInt();
            if (num < 0)
                negative += 1;
            if (num >= 0)
                positive += 1;
        }

        System.out.println("Habían " + positive + " números positivos.");
        System.out.println("Habían " + negative + " números negativos.");
    }
}
