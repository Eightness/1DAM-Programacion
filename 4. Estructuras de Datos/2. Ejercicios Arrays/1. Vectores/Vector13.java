/* Crea un programa que permita al usuario almacenar una secuencia aritmética en un
array y luego mostrarla. Una secuencia aritmética es una serie de números que
comienza por un valor inicial V, y continúa con incrementos de I. Por ejemplo, con
V=1 e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17,
27, 37… El programa solicitará al usuario V, I además de N (nº de valores a crear). */

import java.util.Scanner;

public class Vector13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Número de valores a crear: ");
        int numero = input.nextInt();
        System.out.print("Valor inicial: ");
        int valorInicial = input.nextInt();
        System.out.print("Valor del incremento: ");
        int incremento = input.nextInt();

        int[] array = new int[numero];
        array[0] = valorInicial;
        array[1] = valorInicial + incremento;

        int init = valorInicial + incremento;

        for (int i = 2; i < numero; i++) {
            
            array[i] = init + incremento;
            init = array[i];

        }
        
        for (int i = 0; i < numero; i++) {

            System.out.print(array[i] + " ");
            
        }

    }
    
}