/*
 * Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad o no. Implementa y utiliza la función:
 * boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
 */

 import java.util.Scanner;

 public class Ejercicio2 {
 
     //Método para saber si alguien es mayor de edad o no
     public static boolean esMayorEdad (int a) {
 
         return a >= 18;

     }
 
     //Main
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);
         
         System.out.print("Introduce tu edad: ");
         int a = input.nextInt();
         
         System.out.println();
 
         if (esMayorEdad(a)) {
            System.out.println("Eres mayor de edad.");
         } else {
            System.out.println("Eres menor de edad.");
         }

     }
     
 }
 