/*
 * Escribe un programa que imprima las tablas de multiplicar del 1 al 10. Implementa una función que reciba un número entero como parámetro e imprima su tabla de multiplicar.
 */

 import java.util.Scanner;

 public class Ejercicio20 {
 
     //Método para imprimir tabla de multiplicar de un valro
     public static void tablaMultipicar(int n) {
        System.out.println("Tabla de multiplicar del " + n + ": ");
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
     }
 
     //Main
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);
 
         //Bucle anidado para imprimir las tablas de multiplicar del 1 al 10
         for (int i = 1; i <= 10; i++) {
             System.out.println("Tabla de multipicar del " + i + ": ");
             System.out.println();
             for (int j = 1; j <= 10; j++) {
                 System.out.println(i + " * " + j + " = " + (i * j));
             }
             System.out.println();
         }

         System.out.print("Introduce un número entero: ");
         int n = input.nextInt();

         tablaMultipicar(n);
            
     }
 }
 