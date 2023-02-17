/*
 * Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y su perímetro. Implementa y utiliza las funciones:
 * double perimetroRectangulo(double ancho, double alto) // Devuelve el perimetro
 * double areaRectangulo(double ancho, double alto) // Devuelve el área
 */

 import java.util.Scanner;

 public class Ejercicio7 {
 
     //Método para averiguar el perimetro del rectángulo
     public static double perimetroRectangulo (double ancho, double alto) {

        double perimetro = (ancho * 2) + (alto * 2);

        return perimetro;
     }

     //Método para averiguar el área del rectángulo
     public static double areaRectangulo (double ancho, double alto) {

        double area = ancho * alto;

        return area;
     }
 
     //Main
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);
         
         System.out.print("Introduce el ancho del rectángulo: ");
         double ancho = input.nextDouble();

         System.out.print("Introduce el alto del rectángulo: ");
         double alto = input.nextDouble();

         System.out.println();
 
         System.out.println("El perímetro del rectángulo es: " + perimetroRectangulo(ancho, alto));
         System.out.println("El área del rectángulo es: " + areaRectangulo(ancho, alto));

        }
     
 }
 