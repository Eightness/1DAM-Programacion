/* Crea un programa que pida veinte números reales por teclado, los almacene en un
array y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de
valores. */

import java.util.Scanner;

public class Vector5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] array = new double[20];
        double num;
        double media = 0;

        for (int i = 0; i < array.length; i++) {

            System.out.print("Escribe un número: ");
            num = input.nextDouble();

            array[i] = num;

        }

        for (int i = 0; i < array.length; i++) {

            media += array[i];

        }

        media /= 20;

        System.out.println("La media de los todos los números del array es: " + media);

    }
    
}