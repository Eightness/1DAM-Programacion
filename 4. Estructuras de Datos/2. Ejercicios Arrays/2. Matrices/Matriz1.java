/* Crea un programa que cree una matriz de tamaño 5x5 que 
almacene los números del 1 al 25 y luego muestre la matriz
por pantalla. */

import java.util.Scanner;

public class Matriz1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] array = new int[5][5];
        int contador = 1;

        for (int i = 0; i < array.length; i++) {
            
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = contador;
                contador++;

            }
        
        }
        
        for (int i = 0; i < array.length; i++) {
            
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + "\t");

            }
        
            System.out.println();

        }

    }
    
}