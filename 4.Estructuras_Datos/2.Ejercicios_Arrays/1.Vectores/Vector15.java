/* Crea un programa que pida al usuario dos valores N y M y luego cree un array de tamaño N que contenga M en
todas sus posiciones. Luego muestra el array por pantalla. */

import java.util.Scanner;

public class Vector15 {

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