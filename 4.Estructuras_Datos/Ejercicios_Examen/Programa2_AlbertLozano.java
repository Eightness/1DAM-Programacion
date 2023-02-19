//Albert Lozano Blasco

//PROGRAMA 2

/*
 * Necesitamos un programa en lenguaje Java que cree una matriz de tamaño F x C (valores introducidos por teclado)
 * y la rellene con números enteros aleatorios entre 1 y 20. Luego pedirá por teclado un número N y mostrará por pantalla, para cada fila,
 * la suma de los valores que son múltiplos de N.
 * 
 * Por ejemplo, dada esta matriz de 3x3 y N=5.
 * 
 * 5    10  9
 * 1    6   19
 * 20   15  10
 * 
 * El programa mostrará por pantalla:
 * Fila 1: 15
 * Fila 2: 0
 * Fila 3: 45
 * 
 */

 import java.util.Scanner;

 public class Programa2_AlbertLozano {
 
    //MAIN
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);

         //Variables
         int F;
         int C;
         int N;
         int sumaMultiplos = 0;

         System.out.println();

         System.out.print("Introduce filas: ");
         F = input.nextInt();

         System.out.print("Introduce columnas: ");
         C = input.nextInt();

         //Creamos la matriz
         int[][] matriz = new int[F][C];

         //Bucle para rellenar la matriz con valores aleatorios entre 1 y 20
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 21);
            }
         }

         //Preguntamos por un número entero
         System.out.print("Introduce un número entero: ");
         N = input.nextInt();

         System.out.println();

         //Bucle para imprimir la matriz
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
         }

         System.out.println();

         //Bucle para trabajar con la matriz
         for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                //Condicional para averiguar si la posición actual es múltiplo de N
                if (matriz[i][j] % N == 0) {
                    sumaMultiplos += matriz[i][j];
                }
                
            }

            //Mostramos la suma de los posibles múltiplos de la primera fila y reseteamos la variable
            System.out.println("Fila " + (i + 1) + ": " + sumaMultiplos);
            sumaMultiplos = 0;

         }
 
     }
     
 }