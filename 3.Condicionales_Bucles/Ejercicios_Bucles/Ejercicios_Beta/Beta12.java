import java.util.Scanner;

public class Beta12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /* Escribe un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador
        intenta adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez
        hasta adivinarlo (el usuario deberá indicarle al ordenador si es mayor, menor o igual al
        número que ha pensado). */

        // Número del 1 al 100.

        // Mi idea es trabajar con intervalos al dividir el número mayor entre 2.
        int minimum_menor = 1;      // Límite menor del intervalo menor. [*1*, 50]
        int maximum_menor = 50;     // Límite mayor del intervalo menor. [1, *50*]
        int minimum_mayor = 50;     // Límite menor del intervalo mayor. [*50*, 100]
        int maximum_mayor = 100;    // Límite mayor del intervalo mayor. [50, *100*]
        int half = 50;
        int guess = 0;              // Input del usuario para indicar si es mayor, menor o igual.

        // Este bucle se realiza mientras guess != 3 (Hasta que el usuario nos diga que hemos acertado)
        do {
            System.out.println("Tu número es mayor, menor o igual que " + half + "?");
            System.out.println("Introduce 1 si es mayor.");
            System.out.println("Introduce 2 si es menor.");
            System.out.println("Introduce 3 si es igual.");
            guess = input.nextInt();

            // Si el usuario nos dice que el número es mayor:
            if (guess == 1) {
                // Fórmula para darle nuevo valor al límite mayor del nuevo intervalo menor. [50, *75*][75, 100], etc.
                maximum_menor += ((maximum_mayor - maximum_menor) / 2);
            }
            
            // Si el usuario nos dice que el número es menor:
            if (guess == 2) {
                // Fórmula para darle nuevo valor al límite mayor del nuevo intervalo menor. [1, *25*][25, 50], etc.
                maximum_menor -= (maximum_menor - (maximum_menor / 2));
            }
        
        } while (guess != 3);

        System.out.println("Acerté.");

        // Idea detrás de las fórmulas de los if guess.

        // [1, 50][50, 100]

        // 100 - 50 = 50 
        // 50 / 2 = 25
        // 50 + 25 = *75*

        // [50, 75][75, 100]

        // 100 - 75 = 25
        // 25 / 2 = 12
        // 75 + 12 = 87

        // [75, 87][87, 100]

    }
}