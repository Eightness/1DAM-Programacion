import java.util.Scanner;

public class Alpha8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i;
        int variableMult = 1;
        int totalMult = 1;

        System.out.println("La multiplicación de los 10 primeros números naturales: ");
            for (i = 1; i <= 10; i++) {
                totalMult = i * variableMult;
                variableMult = totalMult;
            }
        System.out.println(totalMult);
        
    }
}