/* Crea un programa que cree una matriz de 10x10 e introduzca
los valores de las tablas de multiplicar del 1 al 10 (cada
tabla en una fila). Luego mostrará la matriz por pantalla. */

import java.util.Scanner;

public class Matriz2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] array = new int[10][10];
        int tabla = 1;
        int mult = 1;

        for (int i = 0; i < array.length; i++) {
            
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = tabla * mult;
                mult++;

            }

            tabla++;
            mult = 1;
        
        }
        
        for (int i = 0; i < array.length; i++) {
            
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + "\t");

            }
        
            System.out.println();

        }

    }
    
}