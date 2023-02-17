/*
 * Escribe un programa que cree un array del tamaño indicado por teclado y luego lo rellene con valores aleatorios (utiliza Math.random()).
 * Implementa la función que rellena un array con valores aleatorios.
 */

 import java.util.Scanner;

 public class Ejercicio16 {
 
     //Método para rellenar un array con números aleatorios
     public static void randomArray(double[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

     }
 
     //Main
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);

         System.out.print("Introduce la longitud del vector: ");
         int l = input.nextInt();
         
         //Creamos un array con 100 posiciones
         double[] array = new double[l];

         randomArray(array);
 
        }
     
 }
 