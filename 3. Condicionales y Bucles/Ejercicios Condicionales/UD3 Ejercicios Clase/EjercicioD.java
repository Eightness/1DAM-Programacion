import java.util.Scanner;

public class EjercicioD {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Introduce un número: ");
        num1 = input.nextInt();
        System.out.print("Introduce otro número: ");
        num2 = input.nextInt();

        if (num1 % num2 == 0)
            System.out.println(num2 + " es múltiplo de " + num1);
    }
}
