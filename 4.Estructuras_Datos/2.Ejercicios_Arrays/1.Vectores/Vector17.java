/* Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un array
y los 10 últimos en otro array. Por último, comparará ambos arrays y le dirá al usuario si son iguales o no. */

import java.util.Scanner;

public class Vector17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[55];
        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            
            for (int j = 1; j <= i; j++) {

                array[contador] = i;
                contador++;

            }
        
        }
        
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
            
        }

    }
    
}