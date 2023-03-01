import java.util.Scanner;

public class Ahorcado_Albert_v2 {

    public static Scanner input = new Scanner(System.in);
    public static String[] words = {"hola", "adios", "casa", "coche", "perro", "gato", "raton", "arbol", "sol", "luna", "agua", "fuego", "tierra", "aire", "manzana", "naranja", "limon", "platano", "fresa", "frambuesa", "melocoton", "sandia", "uva", "leche", "cafe", "te", "azucar", "sal", "pimienta", "aceite", "vinagre", "arroz", "pasta", "pan", "carne", "pescado", "pollo", "huevos", "queso", "yogur", "miel", "mantequilla", "chocolate", "caramelo", "galletas", "bizcocho", "helado", "cocacola", "cerveza", "vino"};
    public static String selectedWord = words[(int)(Math.random() * 50)].toUpperCase();
    public static char[] word = new char[selectedWord.length()];
    public static char[] hiddenword = new char[selectedWord.length()];
    public static char[] usedLetters = new char[25];
    public static int lives = 5;
    public static int turns = 0;
    public static char userLetter;

    //Function for filling "word" array with word chars
    public static void fillWord() {
        for (int i = 0; i < word.length; i++) {
            word[i] = selectedWord.charAt(i);
        }
    }

    //Function for filling "hiddenWord" array with hyphen
    public static void fillHiddenWord() {
        for (int i = 0; i < hiddenword.length; i++) {
            hiddenword[i] = '-';
        }
    }
    
    //Function to print "hiddenWord" array
    public static void printHiddenWord() {
        for (int i = 0; i < hiddenword.length; i++) {
            System.out.print(hiddenword[i] + " ");
        }
        System.out.println();
    }

    //Function to print "usedLetters" array
    public static void printUsedLetters() {
        for (int i = 0; i <= turns; i++) {
            System.out.print(usedLetters[i] + " ");
        }
    }

    //Function to initialize
    public static void setUp() {
        fillWord();
        fillHiddenWord();
        System.out.println();
        System.out.println("¡COMIENZA EL JUEGO DEL AHORCADO! By Albert");
    }

    //Function to check if game is over
    public static boolean gameOver() {
        int hyphenCount = 0;

        for (int i = 0; i < hiddenword.length; i++) {
            if (hiddenword[i] == '-') {
                hyphenCount++;
            }
        }

        if (hyphenCount == 0) {
            System.out.println();
            System.out.println("¡HAS GANADO! :D");
            System.out.println("La palabra era: " + selectedWord);
            System.out.println();
            return true;
        }

        if (lives == 0) {
            System.out.println();
            System.out.println("¡HAS PERDIDO! :(");
            System.out.println("La palabra era: " + selectedWord);
            System.out.println();
            return true;
        }

        return false;
    }

    //Function to get input from user
    public static char input() {
        boolean check = false;
        do {
            check = false;
            System.out.print("¿Qué letra probamos? ");
            userLetter = input.nextLine().toUpperCase().charAt(0);

            for (int i = 0; i <= turns; i++) {
                if (usedLetters[i] == userLetter) {
                    check = true;
                }
            }

            if (check) {
                System.out.println();
                System.out.println("Ya has probado esa letra, prueba otra.");
            }
        } while (check);

        turns++;
        return userLetter;
    }

    //Function to see if selected word contains user letter
    public static boolean foundLetter() {
        for (int i = 0; i < word.length; i++) {
            if (word[i] == userLetter) {
                return true;
            }
        }

        return false;
    }

    //Function to discover user letter
    public static void discoverLetter(char userLetter) {
        for (int i = 0; i < hiddenword.length; i++) {
            if (word[i] == userLetter) {
                hiddenword[i] = userLetter;
            }
        }
    }

    //Function to update data
    public static void update(char userLetter) {
        if (foundLetter()) {
            System.out.println();
            System.out.println();
            System.out.println("¡HAS ACERTADO! :)");
            //Discover user letter
            discoverLetter(userLetter);
        } else {
            System.out.println();
            System.out.println();
            System.out.println("¡HAS FALLADO! :(");
            lives--;
        }
        //We add user letter to used letters array
        usedLetters[turns] = userLetter;
    }

    //Function to print all
    public static void printAll() {
        System.out.println();
        System.out.print("Palabra: "); printHiddenWord();
        System.out.println();
        System.out.print("Vidas: " + lives + "\tLetras usadas: "); printUsedLetters();
        System.out.println();
        System.out.println();
    }

    //Output function
    public static void output() {
        printAll();
        userLetter = input();
        update(userLetter);
    }

    //MAIN
    public static void main(String[] args) {

        setUp();

        while (!gameOver()) {
            output();
        }
        
    }
}
