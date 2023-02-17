import java.util.Scanner;

public class Alpha14 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num;
        boolean multiplo10 = false;

        System.out.println("Introduzca cinco números enteros: ");
        
        for (int i = 1; i <= 5; i++) {
            num = input.nextInt();
            if (num % 10 == 0)
                multiplo10 = true;
        }

        if (multiplo10 == true)
            System.out.println("Sí que se ha introducido algún múltiplo de 10.");
        else
            System.out.println("No había múltiplos de 10.");
    }
}
