/* Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú
con distintas opciones:
◦ a. Mostrar valores.
◦ b. Introducir valor.
◦ c. Salir.
La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y
una posición P, luego escribirá V en la posición P del array. El menú se repetirá
indefinidamente hasta que el usuario elija la opción ‘c’ que terminará el programa. */

import java.util.Scanner;

public class Vector12 {

    public static void main(String[] args) {

        int[] array = new int[10];
        
        while (true) {
            
            Scanner input = new Scanner(System.in);

            System.out.println("a. Mostrar valores.");
            System.out.println("b. Introducir valor.");
            System.out.println("c. Salir.");

            System.out.println();

            String abc = input.nextLine();

            System.out.println();
    
            if (abc.equals("a")) {
                
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }

            }
    
            if (abc.equals("b")) {
                System.out.println("Escribe un valor: ");
                int v = input.nextInt();
                System.out.println("Escribe una posición: ");
                int p = input.nextInt();
                array[p] = v;
            }
    
            if (abc.equals("c")) {
                break;
            }

            System.out.println();
            System.out.println();
            
        }


    }
    
}