import java.net.SocketPermission;
import java.util.Scanner;

public class Beta11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int b500 = 0, b200 = 0, b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0;
        int precio = 0;

        System.out.println("Introduzca un precio múltiplo de 5: ");
        precio = input.nextInt();

        // b500 = precio / 500;
        // precio %= 500;
        // b200 = precio / 200;
        // precio %= 200;
        // b100 = precio / 100;
        // precio %= 100;
        // b50 = precio / 50;
        // precio %= 50;
        // b20 = precio / 20;
        // precio %= 20;
        // b10 = precio / 10;
        // precio %= 10;
        // b5 = precio / 5;
        // precio %= 5;
        
        do { 
            if (precio >= 500) {
                b500 += 1;
                precio -= 500;
            }
            else if (precio >= 200) {
                b200 += 1;
                precio -= 200;
            }
            else if (precio >= 100) {
                b100 += 1;
                precio -= 100;
            }
            else if (precio >= 50) {
                b50 += 1;
                precio -= 50;
            } 
            else if (precio >= 20) {
                b20 += 1;
                precio -= 20;
            } 
            else if (precio >= 10) {
                b10 += 1;
                precio -= 10;
            }
            else if (precio >= 5) {
                b5 += 1;
                precio -= 5;
            }

        }
        while (precio > 0);

        System.out.println("Necesitaremos " + b500 + " billete/s de 500 euros.");
        System.out.println("Necesitaremos " + b200 + " billete/s de 200 euros.");
        System.out.println("Necesitaremos " + b100 + " billete/s de 100 euros.");
        System.out.println("Necesitaremos " + b50 + " billete/s de 50 euros.");
        System.out.println("Necesitaremos " + b20 + " billete/s de 20 euros.");
        System.out.println("Necesitaremos " + b10 + " billete/s de 10 euros.");
        System.out.println("Necesitaremos " + b5 + " billete/s de 5 euros.");
        
    }
}