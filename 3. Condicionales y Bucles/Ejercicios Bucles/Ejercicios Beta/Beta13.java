import java.util.Scanner;

public class Beta13 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num;
        int resto = 0;
        int res = 0;

        System.out.print("Introduzca un número entero: ");
        num = input.nextInt();

        do {
            resto = num % 10;
            num /= 10;
            res += resto;

        } while (num > 0);

        System.out.println("La suma de las cifras del número introducido es: " + res);
    }
}
