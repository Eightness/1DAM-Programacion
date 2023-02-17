/*
 * Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
 * double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA
 */

 import java.util.Scanner;

 public class Ejercicio6 {
 
     //Método para convertir millas a kilómetros
     public static double precioConIVA (double precio) {

        double precioConIVA = precio * 1.21;
 
        return precioConIVA;
     }
 
     //Main
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);
         
         System.out.print("Introduce un precio: ");
         double precio = input.nextDouble();

         System.out.println();
 
         System.out.println(precio + " + 21% de IVA = " + precioConIVA(precio));

     }
     
 }
 