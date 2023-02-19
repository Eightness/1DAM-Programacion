/* Necesitamos crear un programa para mostrar el rating de los 8 jugadores de un torneo de ajedrez.
Primero se le pedirá al usuario que introduza el rating de todos los jugadores (habitualmente valores entre 1000 y 2800, de tipo entero)
y luego muestre el rating en orden descendente (de la más alta a la más baja). */

import java.util.Scanner;

public class Vector19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[55];
        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            
            for (int j = 1; j <= i; j++) {

                array[contador] = i;
                contador++;

            }
        
        }
        
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
            
        }

    }
    
}