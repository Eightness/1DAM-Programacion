import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        /* Programa que pida al usuario un número X y luego muestre
        por pantalla los números de la tabla de multiplicar de X. */

        // Ejemplo: input: 4, output: 4, 8, 12, 16, 20, 24, 28, 32...

        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca un número entero: ");
        int X = input.nextInt();

        System.out.println("Tabla de multiplicar del " + X + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(X + " * " + i + " = " + (X * i));
        }
        
    }
    
}
