/*
 * Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros. Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la función:
 * double millas_a_kilometros(int millas) // Devuelve la conversion de millas a kilómetros
 */

 import java.util.Scanner;

 public class Ejercicio5 {
 
     //Método para convertir millas a kilómetros
     public static double millas_a_kilometros (int millas) {

        double kilometros = Double.valueOf(millas) * 1.60934;
 
        return kilometros;
     }
 
     //Main
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);
         
         System.out.print("Introduce millas: ");
         int millas = input.nextInt();

         System.out.println();
 
         System.out.println(millas + " en kilómetros, son: " + millas_a_kilometros(millas));

     }
     
 }
 