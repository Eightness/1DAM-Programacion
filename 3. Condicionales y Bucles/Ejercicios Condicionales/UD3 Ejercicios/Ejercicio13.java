import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        /* Leer temperatura del día en centígrados e imprimir el tipo de clima */
        
        int temp; 

        Scanner lector = new Scanner(System.in);

        System.out.print("Introduzca una temperatura en grados centígrados: ");
        temp = lector.nextInt();

        switch (temp) {

            case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
                System.out.println("Frío");
            break;

            case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:
                System.out.println("Templado");
            break;

            case 20: case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
                System.out.println("Caluroso");
            break;

            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40:
                System.out.println("Tropical");
            break;

            default:
                System.out.println("Número no válido.");
        }
    }    
}