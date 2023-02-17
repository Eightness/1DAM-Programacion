/* Crea un programa que pida diez números reales por teclado,
 * los almacene en un array, y luego muestre todos sus vectores. */

import java.util.Scanner;

public class Vector1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];
        double num;

        for (int i = 0; i < array.length; i++) {

            System.out.print("Escribe un número: ");
            num = input.nextDouble();

            array[i] = num;

        }

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }

    }
    
}