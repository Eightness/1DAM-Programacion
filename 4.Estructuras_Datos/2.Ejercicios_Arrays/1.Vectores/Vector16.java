/* Crea un programa que cree un array de enteros e introduzca la siguiente secuencia
de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y
luego la muestre por pantalla. En esta ocasión has de utilizar Arrays.fill(). */

import java.util.Scanner;

public class Vector16 {

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