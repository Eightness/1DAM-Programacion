/*
 * Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá recibir dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo.
 */

 import java.util.Scanner;

 public class Ejercicio14 {
 
     //Método para imprimir un triángulo con un carácter x y un número de líneas n
     public static void trianguloMagico(char x, int n) {
        
        for (int i = 1; i <= n; i++) {

            for (int j = i - 1; j < n; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print(x);
            }
            
            System.out.println();
        }

     }
 
     //Main
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);
         
         System.out.print("Introduce el carácter deseado en el triángulo: ");
         char x = input.next().charAt(0);
 
         System.out.print("Introduce el número de líneas del triángulo: ");
         int n = input.nextInt();
 
         System.out.println();

         trianguloMagico(x, n);

         System.out.println();
 
        }
     
 }
 