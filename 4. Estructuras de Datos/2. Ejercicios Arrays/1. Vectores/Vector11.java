/* Crea un programa que cree dos arrays de enteros de tamaño 10. Luego introducirá en
el primer array todos los valores del 1 al 10. Por último, deberá copiar todos los
valores del primer array al segundo array en orden inverso, y mostrar ambos por
pantalla. */

import java.util.Scanner;

public class Vector11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        int contador = 0;

        for (int i = 0; i < array1.length; i++) {
        
            array1[i] = (i + 1);

        }

        for (int i = (array2.length - 1); i >= 0; i--) {
        
            array2[i] = array1[contador];
            contador += 1;

        }
        
        for (int i = 0; i < array1.length; i++) {
        
            System.out.print(array1[i] + " ");

        }

        System.out.println();

        for (int i = 0; i < array2.length; i++) {
        
            System.out.print(array2[i] + " ");

        }

    }
    
}