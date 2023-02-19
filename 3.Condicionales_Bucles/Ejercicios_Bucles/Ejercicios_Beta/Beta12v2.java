import java.util.Scanner;

public class Beta12v2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /* Escribe un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador
        intenta adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez
        hasta adivinarlo (el usuario deberá indicarle al ordenador si es mayor, menor o igual al
        número que ha pensado). */

        // Número del 1 al 100.

        int A = 1;
        int B = 100;
        
        boolean akinator = false;

        do {

            int half = (A + B) / 2;

            System.out.println("¿Es " + half + " el número en el que estás pensando?");
            System.out.println("¿Es mayor (1), menor (2), o igual (3)?");
            int guess = input.nextInt();

            switch (guess) {

                case 1:
                    A = half + 1;
                break;

                case 2:
                    B = half;
                break;

                case 3:
                    System.out.println("¡Acerté!");
                    akinator = true;
                break;

                default:
                    System.out.println("Valor introducido incorrecto.");
                break;

            }

        } while (akinator != true);

    }
}