/*
 * Escribe un programa que cree un array de tamaño 100 con los primeros 100 números naturales. Luego muestra la suma total y la media. 
 * Implementa una función que calcule la suma de un array y otra que calcule la media de un array.
 */

 import java.util.Scanner;

 public class Ejercicio15 {
 
     //Método para calcular la suma total de un array
     public static int sumaArray(int[] numerosNaturales) {

        int resultado = 0;

        for (int i = 0; i < numerosNaturales.length; i++) {
            resultado += numerosNaturales[i];
        }

        return resultado;
     }

     //Método para calcular la media de un array
     public static double mediaArray(int[] numerosNaturales) {

        int resultado = 0;

        for (int i = 0; i < numerosNaturales.length; i++) {
            resultado += numerosNaturales[i];
        }

        resultado /= numerosNaturales.length;

        return resultado;
     }
 
     //Main
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);
         
         //Creamos un array con 100 posiciones
         int[] numerosNaturales = new int[100];

         for (int i = 0; i < numerosNaturales.length; i++) {
            numerosNaturales[i] = i + 1;
         }

         for (int i = 0; i < numerosNaturales.length; i++) {
            System.out.print(numerosNaturales[i] + ", ");
         }

         System.out.println();

         System.out.println("La suma total del array es: " + sumaArray(numerosNaturales));
         System.out.println("La media del array es: " + mediaArray(numerosNaturales));
 
        }
     
 }
 