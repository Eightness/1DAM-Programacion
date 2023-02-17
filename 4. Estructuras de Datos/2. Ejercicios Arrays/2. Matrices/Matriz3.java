/* Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado)
e introduzca en ella NxM valores(también introducidos por teclado). 
Luego deberá recorrer la matriz y al final mostrar por pantalla cuántos valores son mayores que cero, 
cuántos son menores que cero y cuántos son igual a cero. */

import java.util.Scanner;

public class Matriz3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el número de filas: ");
        int rows = input.nextInt();
        System.out.print("Introduce el número de columnas: ");
        int cols = input.nextInt();

        int[][] array = new int[rows][cols];
        int mayores = 0;
        int iguales = 0;
        int menores = 0;

        for (int i = 0; i < array.length; i++) {
            
            for (int j = 0; j < array[i].length; j++) {

                System.out.print("Introduce la posición " + i + ", " + j + ": ");
                array[i][j] = input.nextInt();

                if (array[i][j] > 0) {
                    mayores++;
                }

                if (array[i][j] == 0) {
                    iguales++;
                }

                if (array[i][j] < 0) {
                    menores++;
                }

            }
        
        }
        
        for (int i = 0; i < array.length; i++) {
            
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + "\t");

            }
        
            System.out.println();

        }

        System.out.println("Hay " + mayores + " valores mayores que 0.");
        System.out.println("Hay " + iguales + " valores iguales a 0.");
        System.out.println("Hay " + menores + " valores menores que 0.");

    }
    
}