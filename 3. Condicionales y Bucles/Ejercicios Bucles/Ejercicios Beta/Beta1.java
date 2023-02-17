import java.util.Scanner;

public class Beta1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i, num;

        System.out.print("Introduzca un número entero: ");
        num = input.nextInt();
        
        System.out.println("La tabla de multiplicar de " + num + " es: ");
            for (i = 1; i <= 10; i++) {
                System.out.println(num * i);
            }
        
    }
}