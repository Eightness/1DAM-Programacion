/*
 * Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar algo. Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado.
 * Se debe crear una función a la que le pasemos ambos valores y nos devuelva el descuento.
 */

import java.util.Scanner;

public class Ejercicio13 {

    //Método para descubrir el descuento aplicado
    public static double descubrirDescuento(double precioOriginal, double precioFinal) {

       double porcentaje = precioFinal / precioOriginal * 100;

       return porcentaje;
    }

    //Main
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduce el precio original: ");
        double precioOriginal = input.nextDouble();

        System.out.print("Introduce el precio final: ");
        double precioFinal = input.nextDouble();

        System.out.println();

        System.out.println("El descuento que se ha aplicado es del: " + descubrirDescuento(precioOriginal, precioFinal) + "%");

       }
    
}
