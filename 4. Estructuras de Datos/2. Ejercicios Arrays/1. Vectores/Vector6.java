/* Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
N, escriba M en todas sus posiciones y lo muestre por pantalla. */

import java.util.Scanner;

public class Vector6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        int m;
        
        System.out.print("Escribe un número: ");
        n = input.nextInt();

        System.out.print("Escribe otro número: ");
        m = input.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
        
            array[i] = m;
            
        }

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }

    }
    
}