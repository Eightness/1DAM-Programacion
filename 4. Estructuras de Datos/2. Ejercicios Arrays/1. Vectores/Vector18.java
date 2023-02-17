/* Crea un programa que cree un array de tamaño 30 y los rellene con valores aleatorios entre 0 y 9 (utiliza Math.Random()*10).
Luego ordena los valores del array y los mostrará por pantalla. */

import java.util.Scanner;

public class Vector18 {

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