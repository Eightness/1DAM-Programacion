/*
 * Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El programa debe tener una función que reciba como parámetro una cantidad en kilómetros y nos la devuelva en millas.
 */
 import java.util.Scanner;

 public class Ejercicio12 {
 
     //Método para convertir de kilómetros a millas
     public static double kilometros_a_millas(double kilometros) {

        double millas = kilometros * 0.621371;

        return millas;
     }
 
     //Main
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);
         
         System.out.print("Introduce kilómetros: ");
         double kilometros = input.nextDouble();

         System.out.println();

         System.out.println(kilometros + "kilometros, converidos a millas son: " + kilometros_a_millas(kilometros));

        }
     
 }
 