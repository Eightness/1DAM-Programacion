/* Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y
1.0, utilizando Math.random(), y luego le pida al usuario un valor real R. Por último,
mostrará cuántos valores del array son igual o superiores a R. */

import java.util.Scanner;

public class Vector8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double r;
        int cantidad = 0;
        double[] array = new double[100];
        
        System.out.print("Escribe un número: ");
        r = input.nextDouble();


        for (int i = 0; i < array.length; i++) {
        
            array[i] = Math.random();

            if (array[i] >= r) {
                cantidad += 1;
            }

        }

        System.out.println("Hay " + cantidad + " números que son mayores o iguales a " + r + ".");

    }
    
}