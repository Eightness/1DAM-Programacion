/*
 * Realize un programa que nos pida números enteros hasta que se introduzca el 0, diciéndonos, para cada número introducido si es primo o no.
 * Hay que recordar que un número es primo si es divisble por si mismo y por 1. El 1 no es primo por convenio. 
 * Se debe crear una función que pasándole un número entero devuelva si es primo o no.
 */
 import java.util.Scanner;

 public class Ejercicio17 {
 
     //Método para averiguar si un número es primo o no
     public static boolean esPrimo(int x) {

        for (int i = 0; i <= x; i++) {
            
        }

        return true;
     }
 
     //Main
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);

         do {
             
             System.out.print("Introduce un número entero (pulse 0 para terminar): ");
             int x = input.nextInt();

             if (esPrimo(x)) {
                System.out.println("El número introducido es primo.");
             } else {
                System.out.println("El número introducido no es primo.");
             }

         } while (x != 0);
         
        }
     
 }
 