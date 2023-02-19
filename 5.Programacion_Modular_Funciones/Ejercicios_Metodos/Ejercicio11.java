/*
 * Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado. Para ello implementa una función que reciba como parámetro un número entero y muestre por pantalla la tabla de multipliar de dicho número.
 */

 import java.util.Scanner;

 public class Ejercicio11 {
 
     //Método para imprimir la tabla de multiplicar de n
     public static void tablaMultiplicar(int n) {

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
         
         System.out.print("Introduce un número entero: ");
         int n = input.nextInt();

         System.out.println();

         tablaMultiplicar(n);

        }
     
 }
 