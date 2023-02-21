public class Pajaritos {

        public static char[][] mountain = {
        "^^^^^^        ".toCharArray(),
        " ^^^^^^^^     ".toCharArray(),
        "  ^^^^^^^     ".toCharArray(),
        "  ^^^^^       ".toCharArray(),
        "  ^^^^^^^^^^^ ".toCharArray(),
        "  ^^^^^^      ".toCharArray(),
        "  ^^^^        ".toCharArray()
        };

        //Método para imprimir la montaña
        public static void printMountain (char[][] mountain) {
            for (int row = 0; row < mountain.length; row++) {
                for (int col = 0; col < mountain.length; col++) {
                    System.out.print(mountain[row][col] + "\t");
                }
                System.out.println();
            }
        }

        //Método para transformar bordes
        public static void transformarBordes (char[][] mountain, char character) {
            for (int row = 0; row < mountain.length; row++) {
                for (int col = 0; col < mountain.length; col++) {
                    if (mountain[row][col] == '^') {
                        mountain[row][col] = character;
                    }
                }
            }
        }
    

    public static void main(String[] args) {
        transformarBordes(mountain, '1');
        printMountain(mountain);
    }
    
}

//Array bidimensional N, datos de 0 a (N * N - 1), tengo que ordenarlos de forma ascendente
/*
 * Ejemplo: Array de 0 a (3 * 3 - 1)
 * (    1,  2,  3,
 *      4,  5,  6,
 *      7,  8,  0
 * )
 * Swapear sólo con el 0
 */
