/*
 * Escribe un programa que pida un valro N entero y luego muestre: el sumatorio desde 1 a N, el productorio de 1 a N y el valro intermedio entre 1 y N. Implementa y utiliza las funciones:
 * int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
 * int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
 * double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
 */

 import java.util.Scanner;

 public class Ejercicio8 {
 
     //Método para sumar enteros de 1 a n
     public static int suma1aN(int n) {

        int resultado = 0;

        for (int i = 1; i <= n; i++) {
            resultado += i;
        }

        return resultado;
     }

     //Método para multiplicar enteros de 1 a n
     public static int producto1aN(int n) {

        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
     }

     //Método para saber el valor intermedio entre 1 y n
     public static double intermedio1aN(int n) {

        double resultado = (1 + n) / 2;

        return resultado;
     }
 
     //Main
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);
         
         System.out.print("Introduce un número entero: ");
         int n = input.nextInt();

         System.out.println();

         System.out.println(suma1aN(n));
         System.out.println(producto1aN(n));
         System.out.println(intermedio1aN(n));


        }
     
 }
 