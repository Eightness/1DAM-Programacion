/* Un cuadrado mágico es una matriz cuadrada en la que la suma de cada fila, de cada columna y de las dos diagonales principales tienen el mismo valor.
Desarrolla un programa que permita al usuario introducir los valores (enteros) de una matriz 3x3,
luego la muestre por pantalla y por último muestre un mensaje indicando si es un cuadrado mágico o no.
Deberás utilizar bucles. */

// 8   1   6
// 3   5   7
// 4   9   2

import java.util.Scanner;

public class Matriz6 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Introducir dimensión de la matriz cuadrada
        System.out.print("Introduce la dimensión de la matriz cuadrada (mayor que 1): ");
        int n = input.nextInt();

        //Creamos la matriz
        int[][] array = new int[n][n];

        //Variables
        boolean cuadradoMagico = false;
        int sumaRows = 0;
        int sumaCols= 0;
        int sumaDiag1 = 0;
        int sumaDiag2 = 0;
        int resultado = 0;
        
        //Bucle para asignar valores a la matriz
        for (int rows = 0; rows < array.length; rows++) {

            for (int cols = 0; cols < array[rows].length; cols++) {

                System.out.print("Introduce un valor entero para la matriz: ");
                array[rows][cols] = input.nextInt();

            }
        
        }
        
        //Obtenemos el resultado que deseamos.
        for (int i = 0; i < array.length; i++) {
            resultado += array[0][i];
        }

        //Bucle para comprobar suma de filas
        for (int rows = 0; rows < array.length; rows++) {

            sumaRows = 0;
            
            for (int cols = 0; cols < array[rows].length; cols++) {

                sumaRows += array[rows][cols];

            }

            if (sumaRows != resultado) {
                cuadradoMagico = false;
            }

            if (sumaRows == resultado) {
                cuadradoMagico = true;
            }

        }

        //Bucle para comprobar suma de columnas
        for (int rows = 0; rows < array.length; rows++) {

            sumaCols = 0;
            
            for (int cols = 0; cols < array[rows].length; cols++) {

                sumaCols += array[cols][rows];

            }

            if (sumaCols != resultado) {
                cuadradoMagico = false;
            }

            if (sumaCols == resultado) {
                cuadradoMagico = true;
            }

        }

        // //Bucle para comprobar la diagonal izquierda
        for (int rows = 0; rows < n; rows++) {

            for (int cols = rows; cols < (rows + 1); cols++) {

                sumaDiag1 += array[rows][cols];

            }

        }
        
        if (sumaDiag1 != resultado) {
            cuadradoMagico = false;
        }

        if (sumaDiag1 == resultado) {
            cuadradoMagico = true;
        }

        // //Bucle para comprobar la diagonal derecha
        for (int rows = (n - 1); rows >= 0; rows--) {

            for (int cols = rows; cols > (rows - 1); cols--) {

                sumaDiag2 += array[rows][cols];

            }

        }
        
        if (sumaDiag2 != resultado) {
            cuadradoMagico = false;
        }

        if (sumaDiag2 == resultado) {
            cuadradoMagico = true;
        }

        System.out.println();
        
        //Bucle para imprimir la matriz
        for (int i = 0; i < array.length; i++) {
            
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + "\t");

            }
        
            System.out.println();

        }

        System.out.println();

        if (cuadradoMagico) {
            System.out.println("El cuadrado es mágico. :)");
        } else {
            System.out.println("El cuadrado no es mágico. :(");
        }

    }
    
}