//Albert Lozano Blasco
//1º DAM - Programación. Examen 2º trimestre.

import java.util.Scanner;
import java.util.Arrays;

public class Programator_Albert {

    //Variables
    static Scanner input = new Scanner(System.in);  //Scanner

    //-------------------------------------------------------------------------------------------------------

    //Método para mostrar el menú de la aplicación
    public static void menu() {
        System.out.println();
        System.out.println("PROGRAMATOR:");
        System.out.println("----------------------");
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
            vocalimetro();
            break;
            
            //Cerímetro
            case 2:
            cerimetro();
            break;

            //Media valores altos
            case 3:
            mediaValoresAltos();
            break;

            //Salir
            case 4:
            salir();
            break;

            //Qué pasa por defecto (si no se escoge ninguna opción)
            default: System.out.println("Opción inválida.");
        }
    }

    //-------------------------------------------------------------------------------------------------------

    //Método para el input de Vocalímetro (input STRING)
    public static String inputString(){
        input.nextLine();
        System.out.println("Introduce una frase para comprobar la palabra con mayor número de vocales: ");
        String frase = input.nextLine();

        return frase;
    }

    //-------------------------------------------------------------------------------------------------------

    //Método 1 Vocalímetro
    public static void vocalimetro() {
        //Bienvenida
        System.out.println();
        System.out.println("BIENVENIDOS AL VOCALÍMETRO:");
        System.out.println();

        //Recogemos input
        String frase = inputString().toUpperCase();
        
        //Variables
        int palabras = 1;           //Llevar la cuenta de cuántas palabras hay en la frase
        int contadorVocales = 0;    //Llevar la cuenta de las vocales 
        int posicion = 0;           //Llevar la cuenta de la posición del vector de fraseSeparada
        int resultado = 0;

        //Bucle para recorrer la frase y averiguar cuántas palabras hay
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                palabras++;
            }
        }

        //Creamos vectores
        String[] fraseSeparada = new String[palabras];
        int[] vocales = new int[palabras];
        int[] vocales2 = new int[palabras];

        //Bucle para rellenar el vector de las palabras de la frase con nada
        for (int i = 0; i < fraseSeparada.length; i++) {
            fraseSeparada[i] = "";
        }

        //Bucle para rellenar el vector de las palabras de la frase
        for (int i = 0; i < frase.length(); i++) {
            fraseSeparada[posicion] += frase.charAt(i);
            if (frase.charAt(i) == ' ') {
                posicion++;
            }
        }

        //Bucle para trabajar con cada palabra de la frase 
        for (int i = 0; i < fraseSeparada.length; i++) {
            for (int j = 0; j < fraseSeparada[i].length(); j++) {
                if (fraseSeparada[i].charAt(j) == 'A' || fraseSeparada[i].charAt(j) == 'E' || fraseSeparada[i].charAt(j) == 'I' || fraseSeparada[i].charAt(j) == 'O' || fraseSeparada[i].charAt(j) == 'U') {
                    contadorVocales++;
                }
            }
            vocales[i] = contadorVocales;
            vocales2[i] = contadorVocales;
            contadorVocales = 0;
        }

        Arrays.sort(vocales2);

        //Bucle para detectar palabra con más vocales
        for (int i = 0; i < palabras; i++) {
            if (vocales[i] == vocales2[palabras - 1]){
                resultado = i;
            }
        }

        System.out.println();
        System.out.println("La palabra con más vocales es: " + fraseSeparada[resultado].toLowerCase());
    }

    //-------------------------------------------------------------------------------------------------------

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

    //-------------------------------------------------------------------------------------------------------

    //Método 2 Cerímetro
    public static void cerimetro() {
        //Bienvenida
        System.out.println();
        System.out.println("BIENVENIDOS AL CERÍMETRO:");
        System.out.println();

        //Recogemos input
        int n = inputN();

        //Creamos vectores y variables
        int[] enteros = new int[n];
        String[] numeros = new String[n];
        int contadorCeros = 0;
        int[] ceros = new int[n];
        int[] sorted = new int[n];

        //Rellenamos vectores
        for (int i = 0; i < n; i++) {
            enteros[i] = inputInt();
            numeros[i] = Integer.toString(enteros[i]);
        }

        //Recorremos vector de strings en búsqueda de 0 y añadimos la cantidad de 0 a otro vector
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < numeros[i].length(); j++) {
                if (numeros[i].charAt(j) == '0') {
                    contadorCeros++;
                }
            }
            ceros[i] = contadorCeros;
            contadorCeros = 0;
        }

        //Imprimimos los números introducidos originalmente
        System.out.println();
        System.out.print("Los números introducidos originalmente son: [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(enteros[i] + " ");
        }
        System.out.println("]");

        //Imprimimos los números ordenados de mayor a menor número de ceros
        System.out.println();
        System.out.print("Los números ordenados de mayor a menor número de ceros: [ ");
        System.out.println("]");
    }

    //-------------------------------------------------------------------------------------------------------

    //Método 3 Media valores altos
    public static void mediaValoresAltos() {
        System.out.println();
        System.out.println("BIENVENIDOS A LA MEDIA DE LOS VALORES MÁS ALTOS:");
        System.out.println();

        //Recogemos input
        int n = inputN();

        //Creamos vectores y variables
        int[] enteros = new int[n];
        int primero, segundo, tercero;
        double media;

        //Rellenamos vector enteros
        for (int i = 0; i < n; i++) {
            enteros[i] = inputInt();
        }

        //Imprimimos los números introducidos originalmente
        System.out.println();
        System.out.print("Los números introducidos originalmente son: [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(enteros[i] + " ");
        }
        System.out.println("]");

        Arrays.sort(enteros);
        primero = enteros[n-1];
        segundo = enteros[n-2];
        tercero = enteros[n-3];
        media = primero + segundo + tercero;
        media /= 3;

        //Imprimimos la media
        System.out.println();
        System.out.println("La media aritmética de los 3 valores más altos es: " + media);
        System.out.println();
    }

    //-------------------------------------------------------------------------------------------------------

    //Método 4 SALIR
    public static void salir() {
        System.out.println();
        System.out.println("Adiós.");
        System.exit(0);
    }

    //-------------------------------------------------------------------------------------------------------

    //Método PROGRAMATOR
    public static void programator() {
        menu();
        opciones(eleccion());
    }

    //-------------------------------------------------------------------------------------------------------

    //MAIN
    public static void main(String[] args) {

        while (true) {
            programator();
        }
        
    }
    
}
