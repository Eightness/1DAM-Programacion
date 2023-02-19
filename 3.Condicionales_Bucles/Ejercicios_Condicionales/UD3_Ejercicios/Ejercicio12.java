import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        /* Pedir un número entre 1 y 12 y mostrar en pantalla el número de días que tiene el mes. */

        int mes; 

        Scanner lector = new Scanner(System.in);

        System.out.print("Introduzca un número entre 1 y 12: ");
        mes = lector.nextInt();

        switch (mes) {

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("El mes tiene 31 días");
            break;

            case 2:
                System.out.println("El mes tiene 27/28 días dependiendo de si es año bisiesto o no");
            break;

            case 4: case 6: case 9: case 11:
                System.out.println("El mes tiene 30 días");
            break;

            default:
                System.out.println("Número no válido.");
        }
    }    
}