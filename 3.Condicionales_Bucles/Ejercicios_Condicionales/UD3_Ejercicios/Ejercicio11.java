import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        /* Pedir un número entre 1 y 7 y mostrar en pantalla el día de la semana. */

        int dia; 

        Scanner lector = new Scanner(System.in);

        System.out.print("Introduzca un número entre 1 y 7: ");
        dia = lector.nextInt();

        switch (dia) {

            case 1:
                System.out.println("Lunes");
            break;

            case 2:
                System.out.println("Martes");
            break;

            case 3:
                System.out.println("Miércoles");
            break;

            case 4:
                System.out.println("Jueves");
            break;

            case 5:
                System.out.println("Viernes");
            break;

            case 6:
                System.out.println("Sábado");
            break;

            case 7:
                System.out.println("Domingo");
            break;

            default:
                System.out.println("Número no válido.");
        }
    }    
}