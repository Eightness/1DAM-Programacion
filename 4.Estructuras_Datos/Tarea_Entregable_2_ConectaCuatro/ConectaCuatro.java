//OBJETIVO

/* Debes desarrollar el juego del Conecta 4 en modalidad Humano vs CPU. */

//REQUISITOS
/*
 * El tablero del juego tendrá 6 filas y 7 columnas.
 * 
 * En el turno del jugador humano se le preguntará en qué columna desea poner la ficha.
 * El usuario puede equivocarse e intentar poner la ficha en una posición no válida, esto debe evitarse.
 * 
 * En el turno de la CPU esta colocará la ficha en una columna aleatoria de entre las que se encuentren vacías.
 * 
 * Ten en cuenta que en este juego la ficha se pone en una columna y cae hasta abajo del todo o hasta encontrarse con otra ficha.
 * 
 * Humano y CPU seguirán jugando turnos alternos hasta que uno de los dos gane (poniendo 4 fichas seguidas) o hasta que el tablero se llene, 
 * lo cual seŕia un empate.
 * 
 */

 import java.util.Scanner;

 public class ConectaCuatro {

    //MÉTODOS
    //--------------------------------------------------------------------------------------------------------------------

    //Método para imprimir el tablero
    public static void imprimirTablero (String[][] tablero) {

            System.out.println("TABLERO CONECTA4");
            System.out.println();
            System.out.println("\t0\t\t1\t\t2\t\t3\t\t4\t\t5\t\t6");
            System.out.println();

            for (int i = 0; i < tablero.length; i++) {

                System.out.print(i);
                for (int j = 0; j < tablero[i].length; j++) {
                    System.out.print("\t" + tablero[i][j] + "\t");
                }
                System.out.println();
                System.out.println();

            }
    }

    //Método para rellenar el tablero
    public static void rellenarTablero (String[][] tablero) {

        for (int i = 0; i < tablero.length; i++) {
        
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = "_";
            }

        }
    }

    //Método para identificar la fila en la que estamos en la columna elegida cada turno
    public static int compruebaFila (String[][] tablero, int columna) {

        for (int i = (tablero.length - 1); i >= 0; i--) {

            if (tablero[i][columna] == "_") {
                return i;
            } else {
                continue;
            }

        }

        return -1;
    }

    //Método para comprobar el número de fichas en el tablero / el número de turnos realizados
    public static int compruebaFichas (String[][] tablero) {

        int contador = 0;

        for (int i = 0; i < tablero.length; i++) {
        
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == "O" || tablero[i][j] == "X") {
                    contador += 1;
                }
            }

        }

        return contador;
    }

    //Método para comprobar combinación de filas
    public static boolean conectaFilas (String[][] tablero, String jugador, int fila) {

        int cadena = 0;

        for (int i = 0; i < 7; i++) {

            if (tablero[fila][i] == jugador) {
                cadena += 1;
                if (cadena == 4) {
                    return true;
                }
            } else {
                cadena = 0;
            }

        }

        return false;
    }

    //Método para comprobar combinación de columnas
    public static boolean conectaColumnas (String[][] tablero, String jugador, int columna) {

        int cadena = 0;

        for (int i = 0; i < 6; i++) {

            if (tablero[i][columna] == jugador) {
                cadena += 1;
                if (cadena == 4) {
                    return true;
                }
            } else {
                cadena = 0;
            }
            
        }

        return false;
    }

    //Método para comprobar combinación de diagonales (derecha)
    public static boolean conectaDiagonalesDerecha (String[][] tablero, String jugador) {
        
        int cadena = 0;
        int fila;
        int columna;

        fila = 3; columna = 0; 
        for (int i = 0; i < 4; i++) {
            if (tablero[fila][columna] == jugador) {
                cadena++;
            } else {
                cadena = 0;
            }
            if (cadena == 4) {
                return true;
            }
            fila--;
            columna++;
        }

        fila = 4; columna = 0;
        for (int i = 0; i < 5; i++) {
            if (tablero[fila][columna] == jugador) {
                cadena++;
            } else {
                cadena = 0;
            }
            if (cadena == 4) {
                return true;
            }
            fila--;
            columna++;
        }

        fila = 5; columna = 0;
        for (int i = 0; i < 6; i++) {
            if (tablero[fila][columna] == jugador) {
                cadena++;
            } else {
                cadena = 0;
            }
            if (cadena == 4) {
                return true;
            }
            fila--;
            columna++;
        }

        fila = 5; columna = 1;
        for (int i = 0; i < 6; i++) {
            if (tablero[fila][columna] == jugador) {
                cadena++;
            } else {
                cadena = 0;
            }
            if (cadena == 4) {
                return true;
            }
            fila--;
            columna++;
        }

        fila = 5; columna = 2;
        for (int i = 0; i < 5; i++) {
            if (tablero[fila][columna] == jugador) {
                cadena++;
            } else {
                cadena = 0;
            }
            if (cadena == 4) {
                return true;
            }
            fila--;
            columna++;
        }

        fila = 5; columna = 3;
        for (int i = 0; i < 4; i++) {
            if (tablero[fila][columna] == jugador) {
                cadena++;
            } else {
                cadena = 0;
            }
            if (cadena == 4) {
                return true;
            }
            fila--;
            columna++;
        }

        return false;
    }

    //Método para comprobar combinación de diagonales (izquierda)
    public static boolean conectaDiagonalesIzquierda (String[][] tablero, String jugador) {

        int cadena = 0;
        int fila;
        int columna;

        fila = 2; columna = 0; 
        for (int i = 0; i < 4; i++) {
            if (tablero[fila][columna] == jugador) {
                cadena++;
            } else {
                cadena = 0;
            }
            if (cadena == 4) {
                return true;
            }
            fila++;
            columna++;
        }

        fila = 1; columna = 0;
        for (int i = 0; i < 5; i++) {
            if (tablero[fila][columna] == jugador) {
                cadena++;
            } else {
                cadena = 0;
            }
            if (cadena == 4) {
                return true;
            }
            fila++;
            columna++;
        }

        fila = 0; columna = 0;
        for (int i = 0; i < 6; i++) {
            if (tablero[fila][columna] == jugador) {
                cadena++;
            } else {
                cadena = 0;
            }
            if (cadena == 4) {
                return true;
            }
            fila++;
            columna++;
        }

        fila = 0; columna = 1;
        for (int i = 0; i < 6; i++) {
            if (tablero[fila][columna] == jugador) {
                cadena++;
            } else {
                cadena = 0;
            }
            if (cadena == 4) {
                return true;
            }
            fila++;
            columna++;
        }

        fila = 0; columna = 2;
        for (int i = 0; i < 5; i++) {
            if (tablero[fila][columna] == jugador) {
                cadena++;
            } else {
                cadena = 0;
            }
            if (cadena == 4) {
                return true;
            }
            fila++;
            columna++;
        }

        fila = 0; columna = 3;
        for (int i = 0; i < 4; i++) {
            if (tablero[fila][columna] == jugador) {
                cadena++;
            } else {
                cadena = 0;
            }
            if (cadena == 4) {
                return true;
            }
            fila++;
            columna++;
        }

        return false;
    }

    //--------------------------------------------------------------------------------------------------------------------
    
    //MAIN
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);
 
         //Variables
         String[][] tablero = new String[6][7];     //Matriz del tablero
         boolean gameOver = true;                   //Boolean para comprobar si se ha llegado al final de la partida
         boolean checkWinUsuario = false;           //Boolean para comprobar si ha ganado el usuario
         boolean checkWinCPU = false;               //Boolean para comprobar si ha ganado la CPU
         int columna;                               //Columna elegida por el usuario
         int fila;                                  //Fila en la que nos encontramos
         int contador;                              //Contador de fichas/turnos

         //Llamamos al método para rellenar el tablero con "_"
         rellenarTablero(tablero);
         
         //Bienvenida
         System.out.println();
         System.out.println("Bienvenido al juego 'Conecta4' desarrollado por Albert.");
         System.out.println(); 

         //--------------------------------------------------------------------------------------------------------------------
         
         //While principal
         while (gameOver) {

            //Llamamos al método para imprimir el tablero
            imprimirTablero(tablero);
            
            //Con ayuda del método de contar las fichas, comprobamos si el tablero está lleno (caso de empate)
            contador = compruebaFichas(tablero);

            if (contador == 42) {
                gameOver = false;
                break;
            }

            //--------------------------------------------------------------------------------------------------------------------

            //Turno Usuario
            do { 
                
                System.out.println();
                System.out.print("¿En qué columna deseas introducir la ficha? ");
                columna = input.nextInt();
                fila = compruebaFila(tablero, columna);

                if (fila == -1) {
    
                    System.out.println("Esa columna está llena, elige otra.");
    
                }

            } while (fila == -1);

            tablero[fila][columna] = "O";

            //Comprobamos victoria del Usuario
            //Filas
            checkWinUsuario = conectaFilas(tablero, "O", fila);
            if (checkWinUsuario) {
                gameOver = false;
                break;
            }
            //Columnas
            checkWinUsuario = conectaColumnas(tablero, "O", columna);
            if (checkWinUsuario) {
                gameOver = false;
                break;
            }
            //DiagonalDerecha
            checkWinUsuario = conectaDiagonalesDerecha(tablero, "O");
            if (checkWinUsuario) {
                gameOver = false;
                break;
            }
            //DiagonalIzquierda
            checkWinUsuario = conectaDiagonalesIzquierda(tablero, "O");
            if (checkWinUsuario) {
                gameOver = false;
                break;
            }

            //--------------------------------------------------------------------------------------------------------------------

            //Turno CPU
            do {

                columna = (int)(Math.random() * 7);
                fila = compruebaFila(tablero, columna);

            } while (fila == -1);

            tablero[fila][columna] = "X";

            //Comprobamos victoria de la CPU
            //Filas
            checkWinCPU = conectaFilas(tablero, "X", fila);
            if (checkWinCPU) {
                gameOver = false;
                break;
            }
            //Columnas
            checkWinCPU = conectaColumnas(tablero, "X", columna);
            if (checkWinCPU) {
                gameOver = false;
                break;
            }
            //DiagonalDerecha
            checkWinCPU = conectaDiagonalesDerecha(tablero, "X");
            if (checkWinCPU) {
                gameOver = false;
                break;
            }
            //DiagonalIzquierda
            checkWinCPU = conectaDiagonalesIzquierda(tablero, "X");
            if (checkWinCPU) {
                gameOver = false;
                break;
            }

        }

        //--------------------------------------------------------------------------------------------------------------------

        //Resultado de la partida
        System.out.println();

        imprimirTablero(tablero);

        System.out.println();
        System.out.println("Fin de la partida.");

        if (checkWinUsuario) {
            System.out.println("Gana el Usuario (O).");
        }
        if (checkWinCPU) {
            System.out.println("Gana la CPU (X).");
        }

        contador = compruebaFichas(tablero);
        if (contador == 42) {
            System.out.println("Empate.");
        }

        System.out.println();

    }  
     
}