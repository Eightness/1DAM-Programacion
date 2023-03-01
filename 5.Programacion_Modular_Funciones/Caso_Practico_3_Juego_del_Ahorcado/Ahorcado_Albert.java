import java.util.Scanner;
import java.util.Arrays;

public class Ahorcado_Albert {
    
    //Variables
    public static String[] palabras =   {"Mango", "Pijas", "Bello", "Salsa", "Jugar", "Lunar", "Barco", "Zanja", "Chico", "Fiera", 
                                         "Tumba", "Hongo", "Juzgo", "Helio", "Voces", "Pizza", "Quema", "Roque", "Sello", "Verde", 
                                         "Horno", "Vuelo", "Grito", "Clase", "Rumba", "Tonto", "Nubes", "Corso", "Amigo", "Cenar", 
                                         "Punto", "Lunes", "Tocar", "Forro", "Cebra", "Pelea", "Ratas", "Tejas", "Yagua", "Cajas", 
                                         "Zafra", "Dolor", "Gusan", "Ondas", "Mente", "Feudo", "Mecas", "Zorro", "Sonar", "Pista"};
    
    public static String str = palabras[(int)(Math.random() * 50)].toUpperCase();
    public static char[] palabraSeleccionada = {str.charAt(0), str.charAt(1), str.charAt(2), str.charAt(3), str.charAt(4),};
    public static char[] letras = {'-', '-', '-', '-', '-'};
    public static char[] letrasUsadas = new char[25];
    public static int vidas = 5;
    public static Scanner input = new Scanner(System.in);
    public static int numLetras = 0;

    //Output
    public static void output() {
        System.out.println();
        System.out.print("Palabra: "); imprimirLetras();
        System.out.println();
        System.out.print("Vidas: " + vidas + "\tLetras usadas: "); imprimirLetrasUsadas();
        System.out.println();
        gameOver();
        input();
    }

    //Input
    public static void input() {
        boolean interruptor = false;
        char letraElegida;
        do {
            interruptor = false;
            System.out.print("¿Qué letra probamos? ");
            letraElegida = input.next().toUpperCase().charAt(0);

            for (int i = 0; i < numLetras; i++) {
                if (letrasUsadas[i] == letraElegida) {
                    interruptor = true;
                }
            }

            if (interruptor) {
                System.out.println("Ya has introducido esa letra, prueba otra.");
                System.out.println();
            }
        } while (interruptor);

        actualizarLetras(letraElegida);
        numLetras++;
    }

    //Función para actualizar los vectores letras y letras usadas
    public static void actualizarLetras (char letraElegida) {
        int count = 0;
        for (int i = 0; i < letras.length; i++) {
            if (palabraSeleccionada[i] == letraElegida) {
                letras[i] = letraElegida;
                count++;
            }
        }
        if (count > 0) {
            System.out.println();
            System.out.println();
            System.out.println("¡HAS ACERTADO! :)");
        }
        if (count == 0) {
            System.out.println();
            System.out.println();
            System.out.println("¡HAS FALLADO! :(");
            vidas--;
        }

        letrasUsadas[numLetras] = letraElegida;
    }

    //Función para imprimir vector de letras usadas
    public static void imprimirLetrasUsadas() {
        for (int i = 0; i < letrasUsadas.length; i++) {
            System.out.print(letrasUsadas[i] + " ");
        }
        System.out.println();
    }

    //Función para imprimir vector de las letras
    public static void imprimirLetras() {
        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i] + " ");
        }
        System.out.println();
    }

    //Función para descubir si el juego ha terminado
    public static void gameOver () {
        boolean interruptor = false;
        if (vidas == 0) {
            System.out.println("¡HAS PERDIDO! :(");
            System.out.println();
            System.exit(0);
        }
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == '-') {
                interruptor = true;
            }
        }
        if (!interruptor) {
            System.out.println("¡HAS GANADO! :D");
            System.out.println();
            System.exit(0);
        }
    }

    //Función para ver la palabra seleccionada aleatoriamente para debuggear
    public static void verPalabraSeleccionada () {
        for (int i = 0; i < palabraSeleccionada.length; i++) {
            System.out.print(palabraSeleccionada[i]);
        }
    }

    //Función para ver las letras actuales en el tablero para debuggear
    public static void verLetrasTablero () {
        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i]);
        }
    }

    //MAIN
    public static void main(String[] args) {

        System.out.println();
        verPalabraSeleccionada();
        System.out.println();
        verLetrasTablero();
        System.out.println();

        //Bienvenida
        System.out.println();
        System.out.println("¡COMIENZA EL JUEGO DEL AHORCADO! by Albert");

        while (true) {
            output();
        }
        
    }
    
}