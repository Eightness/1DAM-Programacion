/* Crea un programa que pida dos valores enteros P y Q, luego cree un array que
contenga todos los valores desde P hasta Q, y lo muestre por pantalla. */

import java.util.Scanner;

public class Vector7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int p;
        int q;
        int longitud;
        
        System.out.print("Escribe un número: ");
        p = input.nextInt();

        System.out.print("Escribe otro número: ");
        q = input.nextInt();

        longitud = p - q;

        int[] array = new int[Math.abs(longitud) + 1];

        for (int i = 0; i < array.length; i++) {
        
            if (p > q) {
                array[i] = p - i;
            }

            if (p < q) {
                array[i] = p + i;
            }
 
        }

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }

    }
    
}