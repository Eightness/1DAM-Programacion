/* Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
valores enteros aleatorios entre 1 y 10. Luego pedirá un valor N y mostrará en qué
posiciones del array aparece N. */

import java.util.Scanner;

public class Vector9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        int[] array = new int[100];
        
        System.out.print("Escribe un número: ");
        n = input.nextInt();

        System.out.println("En el array creado el número " + n + " aparece en las siguientes posiciones: ");

        for (int i = 0; i < array.length; i++) {
        
            array[i] = (int)(Math.random() * (10 + 1));

            if (array[i] == n) {
                System.out.println(i);
            }

        }

    }
    
}