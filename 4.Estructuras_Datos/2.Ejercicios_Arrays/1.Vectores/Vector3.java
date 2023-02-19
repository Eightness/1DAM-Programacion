/* Crea un programa que pida diez números reales por teclado, 
los almacene en un array, y luego lo recorra para averiguar el 
máximo y mínimo y mostrarlos por pantalla. */

import java.util.Scanner;

public class Vector3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];
        double num;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {

            System.out.print("Escribe un número: ");
            num = input.nextDouble();

            array[i] = num;

        }

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }

        }

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }

        }

        System.out.println("El número máximo del array es: " + max);
        System.out.println("El número mínimo del array es: " + min);

    }
    
}