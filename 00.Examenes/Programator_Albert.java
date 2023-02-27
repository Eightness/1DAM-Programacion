//Albert Lozano Blasco
//1º DAM - Programación. Examen 2º trimestre.
import java.util.Scanner;

public class Programator_Albert {

    //Variables
    static Scanner input = new Scanner(System.in);  //Scanner

    //Método para mostrar el menú de la aplicación
    public static void menu() {
        System.out.println();
        System.out.println("PROGRAMATOR:");
        System.out.println();
        System.out.println("----------------------");
        System.out.println();
        System.out.println("1- Vocalímetro");
        System.out.println("2- Cerímetro");
        System.out.println("3- Media valores altos");
        System.out.println("4- SALIR");
        System.out.println();
    }

    //Método para elegir la opción
    public static int eleccion() {
        System.out.print("Elige opción: ");
        int eleccion = input.nextInt();

        return eleccion;
    }

    //Método para las diferentes opciones
    public static void opciones(int eleccion) {
        //Switch principal
        switch (eleccion) {
            //Vocalímetro
            case 1:
            break;
            
            //Cerímetro
            case 2:
            break;

            //Media valores altos
            case 3:
            break;

            //Salir
            case 4:
            salir();
            break;

            //Qué pasa por defecto (si no se escoge ninguna opción)
            default: System.out.println("Opción inválida.");
        }
    }

    //Método para el input de Vocalímetro (input STRING)
    public static String inputString(){
        System.out.println("Introduce una frase para comprobar la palabra con mayor número de vocales: ");
        String frase = input.nextLine();

        return frase;
    }

    //Método 1 Vocalímetro
    public static void vocalimetro() {
        System.out.println("BIENVENIDOS AL VOCALÍMETRO:");
        System.out.println();
        
    }

    //Método para saber el número de inputs que nos va a dar el usuario
    public static int inputN() {
        System.out.print("¿Cuántos números enteros va a introducir? ");
        int n = input.nextInt();

        return n;
    }

    //Método para el input de Cerímetro y Media valores altos (input INT)
    public static int inputInt() {
        System.out.print("Introduce número entero: ");
        int entero = input.nextInt();

        return entero;
    }

    //Método 2 Cerímetro
    public static void cerimetro() {
        System.out.println("BIENVENIDOS AL CERÍMETRO:");
        System.out.println();
    }

    //Método 3 Media valores altos
    public static void mediaValoresAltos() {
        System.out.println("BIENVENIDOS A LA MEDIA DE LOS VALORES MÁS ALTOS:");
        System.out.println();
    }

    //Método 4 SALIR
    public static void salir() {
        System.out.println("Adiós.");
        System.exit(0);
    }

    //Método PROGRAMATOR
    public static void programator() {
        menu();
        opciones(eleccion());
    }

    //MAIN
    public static void main(String[] args) {

        while (true) {
            programator();
        }
        
    }
    
}
