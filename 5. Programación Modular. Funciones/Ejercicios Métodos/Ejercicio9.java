/*
 * REaliza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más elevado. Impleméntalo creando únicamente una función a la que le pasemos dos valores (no tres) y nos devuelva el máximo de los dos valores.
 */

 import java.util.Scanner;

 public class Ejercicio9 {
 
     //Método que devuelve el mayor entre dos números
     public static int mayor(int a, int b) {

        if (a > b) {
            return a;
        }

        return b;
     }
 
     //Main
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);
         
         System.out.print("Introduce un número entero: ");
         int a = input.nextInt();

         System.out.print("Introduce otro número entero: ");
         int b = input.nextInt();

         System.out.print("Introduce otro número entero: ");
         int c = input.nextInt();

         System.out.println();

         if (c > mayor(a, b)) {
            System.out.println("El número mayor es: " + c);
         } else {
            System.out.println("El número mayor es: " + mayor(a, b));
         }


        }
     
 }
 