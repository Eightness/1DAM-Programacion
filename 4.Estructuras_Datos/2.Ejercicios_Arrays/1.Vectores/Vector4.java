/* Crea un programa que pida veinte números enteros por teclado, 
los almacene en un array y luego muestre por separado la suma de 
todos los valores positivos y negativos. */

import java.util.Scanner;

public class Vector4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] array = new int[20];
        int num;
        int positivo = 0;
        int negativo = 0;

        for (int i = 0; i < array.length; i++) {

            System.out.print("Escribe un número: ");
            num = input.nextInt();

            array[i] = num;

        }

        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0) {
                positivo += array[i];
            }

        }

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {
                negativo += array[i];
            }

        }

        System.out.println("La suma de los números positivos del array es: " + positivo);
        System.out.println("La suma de los números negativos del array es: " + negativo);

    }
    
}