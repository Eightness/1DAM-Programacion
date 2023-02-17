/*
 * El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: Se divide el número de DNI entre 23 y el resto es codificado por una letra según la siguiente equivalencia.
 * Escribe un programa que pida el DNI y muestre por pantalla la letra asociada. Para ello se deberá crear una función a la que se le pase el número y devuelva la letra.
 */

import java.util.Scanner;

public class Ejercicio18 {

    //Método para averiguar la letra de un DNI
    public static char letraDNI(int dni) {

        char letra = ' ';

        dni %= 23;

        switch (dni) {
            case 0:
            letra = 'T';
            break;
            case 1:
            letra = 'R';
            break;
            case 2:
            letra = 'W';
            break;
            case 3:
            letra = 'A';
            break;
            case 4:
            letra = 'G';
            break;
            case 5:
            letra = 'M';
            break;
            case 6:
            letra = 'Y';
            break;
            case 7:
            letra = 'F';
            break;
            case 8:
            letra = 'P';
            break;
            case 9:
            letra = 'D';
            break;
            case 10:
            letra = 'X';
            break;
            case 11:
            letra = 'B';
            break;
            case 12:
            letra = 'N';
            break;
            case 13:
            letra = 'J';
            break;
            case 14:
            letra = 'Z';
            break;
            case 15:
            letra = 'S';
            break;
            case 16:
            letra = 'Q';
            break;
            case 17:
            letra = 'V';
            break;
            case 18:
            letra = 'H';
            break;
            case 19:
            letra = 'L';
            break;
            case 20:
            letra = 'C';
            break;
            case 21:
            letra = 'K';
            break;
            case 22:
            letra = 'E';
            break;
        }
        return letra;
    }

    //Main
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce un DNI: ");
        int dni = input.nextInt();

        System.out.println();

        System.out.println("La letra del DNI introducido es: " + letraDNI(dni));
        
       }
    
}
