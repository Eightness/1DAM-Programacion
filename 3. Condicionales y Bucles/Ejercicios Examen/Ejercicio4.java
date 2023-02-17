import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        /* Programa que muestre por pantalla los primeros X números
        (que introduce el usuario) de la secuencia de Fibonacci. */

        // Ejemplo: 
        //input: 10
        //output: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.

        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca la cantidad de números que quiera ver de la secuencia de Fibonacci: ");
        int X = input.nextInt();

        System.out.println("1");
        System.out.println("1");

        int f1 = 1;
        int f2 = 1;
        int fibonacci = 2;
        

        for (int i = 3; i <= X; i++) {

            System.out.println(fibonacci);
            
            f1 = f2;
            f2 = fibonacci;
            fibonacci = f1 + f2;
            
        }

    }
    
}
