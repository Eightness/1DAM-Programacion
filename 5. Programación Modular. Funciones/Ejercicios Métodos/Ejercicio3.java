/*
 * Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cuál es el mínimo. Implementa y utiliza la función:
 * int minimo(nt a, int b) // Devuelve el menor entre a y b
 */

 import java.util.Scanner;

 public class Ejercicio3 {
 
     //Método para saber cuál de dos números enteros es el mínimo
     public static int minimo (int a, int b) {

        if (a > b) {
            return b;
        }
 
        return a;
     }
 
     //Main
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);
         
         System.out.print("Introduce un número entero: ");
         int a = input.nextInt();

         System.out.print("Introduce otro número entero: ");
         int b = input.nextInt();

         System.out.println();
 
         System.out.println("El número menor es: " + minimo(a, b));

     }
     
 }
 