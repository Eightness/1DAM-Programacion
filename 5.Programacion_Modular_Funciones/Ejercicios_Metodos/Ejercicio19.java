/*
 * Realiza un programa que permita comprobar si una terna de valores enteros (3 valores) se ajusta a la ecuación de Pitágoras: x^2 + y^2 = z^2.
 * El programa solicita al usuario los valores x, y, z. Se deberá crear una función a la que se le pase x, y, z y devuelva si son iguales o no.
 */

 import java.util.Scanner;

 public class Ejercicio19 {
 
     //Método para comprobar terna de 3 valores
     public static boolean ecuacionPitagoras(int x, int y, int z) {
         
        if ((x * x) + (y * y) == (z * z)) {
            return true;
        }

        return false;
     }
 
     //Main
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);
 
         System.out.print("Introduce x: ");
         int x = input.nextInt();

         System.out.print("Introduce y: ");
         int y = input.nextInt();

         System.out.print("Introduce z: ");
         int z = input.nextInt();
         
         System.out.println();
 
         if (ecuacionPitagoras(x, y, z)) {
            System.out.println("La terna de los 3 valores introducidos se ajusta a la ecuación de Pitágoras.");
         } else {
            System.out.println("La terna de los 3 valores introducidos no se ajusta a la ecuación de Pitágoras.");
         }
         
        }
     
 }
 