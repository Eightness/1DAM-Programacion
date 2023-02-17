import java.util.Scanner;

public class Alpha15 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num;
        boolean negative = false;
        boolean greaterThan99 = false;

        System.out.println("Introduzca cinco números enteros: ");
        
        for (int i = 1; i <= 5; i++) {
            num = input.nextInt();
            if (num < 0)
                negative = true;
            if (num > 99)
                greaterThan99 = true;
        }

        if (negative == true)
            System.out.println("Se ha introducido algún número negativo.");
        else
            System.out.println("No se ha introducido ningún número negativo.");

        if (greaterThan99 == true)
            System.out.println("Se ha introducido algún número mayor que 99.");
        else
            System.out.println("No se ha introducido ningún número mayor que 99.");
    }
}
