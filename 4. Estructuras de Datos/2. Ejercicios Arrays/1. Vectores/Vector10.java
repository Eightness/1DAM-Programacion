/* Crea un programa para realizar cálculos relacionados con la altura (en metros) de
personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas
por teclado. Luego mostrará la altura media, máxima y mínima así como cuántas
personas miden por encima y por debajo de la media. */

import java.util.Scanner;

public class Vector10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Escribe el número total de alturas que vas a introducir: ");
        n = input.nextInt();

        double[] array = new double[n];

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double media = 0;
        int superior = 0;
        int inferior = 0;

        for (int i = 0; i < array.length; i++) {
        
            System.out.print("Escribe una altura: ");
            array[i] = input.nextDouble();

            media += array[i];

            if (array[i] < min) {
                min = array[i];
            }

            if (array[i] > max) {
                max = array[i];
            }

        }

        media /= n;

        for (int i = 0; i < array.length; i++) {

            if (array[i] >= media) {
                superior += 1;
            }
            
            if (array[i] < media) {
                inferior += 1;
            }
            
        }

        System.out.println("La altura mínima es: " + min);
        System.out.println("La altura máxima es: " + max);
        System.out.println("La altura media es " + media);
        System.out.println("Alturas superiores o iguales a la media: " + superior);
        System.out.println("Alturas inferiores a la media: " + inferior);

    }
    
}