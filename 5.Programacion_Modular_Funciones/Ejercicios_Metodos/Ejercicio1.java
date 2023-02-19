/*
 * Escribe un programa que pida dos números reales por teclado y muestre por pantalla el resultado de multiplicarlos. Implementa y utiliza la función:
 * double multiplica(double a, double b) // Devuelve la multiplicación de dos números.
 */

import java.util.Scanner;

public class Ejercicio1 {

    //Método para obtener el resultado de multiplicar dos números reales
    public static double multiplica (double a, double b) {

        double resultado = a * b;

        return resultado;
    }

    //Main
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        double a, b;

        System.out.print("Introduce un número real: ");
        a = input.nextDouble();

        System.out.print("Introduce otro número real: ");
        b = input.nextDouble();

        System.out.println();

        System.out.println("El resultado de multiplicar ambos números es: " + multiplica(a, b));
        
    }
    
}
