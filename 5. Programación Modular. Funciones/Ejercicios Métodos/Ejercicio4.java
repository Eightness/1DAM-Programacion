/*
 * Escribe un programa que pida un número entero por teclado y muestre por pantalla si es positivo, negativo o cero. Implementa y utiliza la función:
 * int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
 */

 import java.util.Scanner;

 public class Ejercicio4 {
 
     //Método para saber si el número es negativo, 0 o positivo
     public static int dimeSigno (int a) {

        if (a > 0) {
            return 1;
        }
    
        if (a < 0) {
            return -1;
        }
 
        return 0;
     }
 
     //Main
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);
         
         System.out.print("Introduce un número entero: ");
         int a = input.nextInt();

         System.out.println();
 
         switch (dimeSigno(a)) {

            case -1:
                System.out.println("El número es negativo.");
            break;

            case 0:
                System.out.println("El número es 0.");
            break;

            case 1:
                System.out.println("El número es positivo.");
            break;
         }

     }
     
 }
 