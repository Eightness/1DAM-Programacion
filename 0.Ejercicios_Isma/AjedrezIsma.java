//Ejercicio 1 Isma
/*
 * Escribe un programa que, dado un tablero de ajedrez (8x8) donde cada elemento representa una pieza del ajedrez, 
 * escriba por pantalla qué posiciones están en peligro de ser atacadas. 
 * Las posiciones deben estar representadas por su nombre algebraico (a1, c5, h8, etc).
 * 
 * A tener en cuenta:
 * Si el espacio atacado está ocupado por una pieza, este no cuenta como estar siendo atacado.
 * Si el espacio está siendo atacado por dos o más piezas, solo saldrá una vez (no se repite)
 * 
 */

import java.util.Scanner;

public class AjedrezIsma {

    //Método para imprimir el tablero
    public static void imprimeTablero(String[][] tablero) {

        int count = 8;

        System.out.println();
        System.out.println("TABLERO AJEDREZ");
        System.out.println();
        System.out.println("\ta\tb\tc\td\te\tf\tg\th");
        System.out.println();

        for (int i = 0; i < tablero.length; i++) {
            System.out.print(count);
            count--;
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("\t" + tablero[i][j]);
            }
            System.out.println();
            System.out.println();
        }

    }

    //Método para rellenar el tablero vacío
    public static void rellenaTableroVacio(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = "_";
            }
        }
    }

    //Método para rellenar el tablero
    public static void rellenaTablero(String[][] tablero) {

        Scanner input = new Scanner(System.in);

        int count = 0;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("Pieza " + count + ": ");
                tablero[i][j] = input.nextLine();
                count++;
            }
        }
    }

    //Método para detener visión de torres, alfiles y reina
    public static boolean frenarVision(String[][] tablero, int row, int col){

        if (tablero[row][col].equalsIgnoreCase("P") || tablero[row][col].equalsIgnoreCase("R") || tablero[row][col].equalsIgnoreCase("N") || tablero[row][col].equalsIgnoreCase("B") || tablero[row][col].equalsIgnoreCase("Q") || tablero[row][col].equalsIgnoreCase("K")){
            return true;
        }
        
        return false;
    }

    //Método para Peones
    public static void peones(String[][] tablero) {

        for (int row = 0; row < tablero.length; row++) {
            for (int col = 0; col < tablero[row].length; col++) {
                if (tablero[row][col].equalsIgnoreCase("P")) {
                    if (row - 1 >= 0 && col - 1 >= 0) {
                        if (tablero[row - 1][col - 1].equals("")) {
                            tablero[row - 1][col - 1] = "X";
                        }
                    }
                    if (row - 1 >= 0 && col + 1 < tablero.length) {
                        if (tablero[row - 1][col + 1].equals("")) {
                            tablero[row - 1][col + 1] = "X";
                        }
                    }
                }
            }
        }

    }

    //Método para Torres
    public static void torres(String[][] tablero) {

        for (int row = 0; row < tablero.length; row++) {
            for (int col = 0; col < tablero[row].length; col++) {
                if (tablero[row][col].equalsIgnoreCase("R")) {
                    for (int count = 0; count < tablero.length; count++) {
                        //Columna
                        if (tablero[count][col].equals("")) {
                            tablero[count][col] = "X";
                        }
                        //Fila
                        if (tablero[row][count].equals("")) {
                            tablero[row][count] = "X";
                        }
                    }        
                }
            }
        }

    }

    //Método para Alfiles
    public static void alfiles(String[][] tablero) {

        for (int row = 0; row < tablero.length; row++) {
            for (int col = 0; col < tablero[row].length; col++) {
                if (tablero[row][col].equalsIgnoreCase("B")) {
                    //Arriba Derecha
                    for (int i = 1; i < tablero.length; i++) {
                        if (row - i >= 0 && col + i < tablero.length) {
                            if (tablero[row - i][col + i].equals("")){
                                tablero[row - i][col + i] = "X";
                            }
                        }
                    }
                    //Arriba Izquierda
                    for (int i = 1; i < tablero.length; i++) {
                        if (row - i >= 0 && col - i >= 0) {
                            if (tablero[row - i][col - i].equals("")){
                                tablero[row - i][col - i] = "X";
                            }
                        }
                    }
                    //Abajo Derecha
                    for (int i = 1; i < tablero.length; i++) {
                        if (row + i < tablero.length && col + i < tablero.length) {
                            if (tablero[row + i][col + i].equals("")){
                                tablero[row + i][col + i] = "X";
                            }
                        }
                    }
                    //Abajo Izquierda
                    for (int i = 1; i < tablero.length; i++) {
                        if (row + i < tablero.length && col - i >= 0) {
                            if (tablero[row + i][col - i].equals("")){
                                tablero[row + i][col - i] = "X";
                            }
                        }
                    }
                }
            }
        }

    }


    //Método para Caballos
    public static void caballos(String[][] tablero) {

        for (int row = 0; row < tablero.length; row++) {
            for (int col = 0; col < tablero[row].length; col++) {
                if (tablero[row][col].equalsIgnoreCase("N")) {
                    //Abajo
                    if (row + 2 < tablero.length && col - 1 >= 0 && col + 1 < tablero.length) {
                        if (tablero[row + 2][col - 1].equals("")) {
                            tablero[row + 2][col - 1] = "X";
                        }
                        if (tablero[row + 2][col + 1].equals("")) {
                            tablero[row + 2][col + 1] = "X";
                        }
                    }
                    //Arriba
                    if (row - 2 >= 0 && col - 1 >= 0 && col + 1 < tablero.length) {
                        if (tablero[row - 2][col - 1].equals("")) {
                            tablero[row - 2][col - 1] = "X";
                        }
                        if (tablero[row - 2][col + 1].equals("")) {
                            tablero[row - 2][col + 1] = "X";
                        }
                    }
                    //Derecha
                    if (col + 2 < tablero.length && row - 1 >= 0 && row + 1 < tablero.length) {
                        if (tablero[row + 1][col + 2].equals("")) {
                            tablero[row + 1][col + 2] = "X";
                        }
                        if (tablero[row - 1][col + 2].equals("")) {
                            tablero[row - 1][col + 2] = "X";
                        }
                    }
                    //Izquierda
                    if (col - 2 >= 0 && row - 1 >= 0 && row + 1 < tablero.length) {
                        if (tablero[row + 1][col - 2].equals("")) {
                            tablero[row + 1][col - 2] = "X";
                        }
                        if (tablero[row - 1][col - 2].equals("")) {
                            tablero[row - 1][col - 2] = "X";
                        }
                    }
                }
            }
        }

    }

    //Método para Reina
    public static void reina(String[][] tablero) {

        for (int row = 0; row < tablero.length; row++) {
            for (int col = 0; col < tablero[row].length; col++) {
                if (tablero[row][col].equalsIgnoreCase("Q")) {
                    //Función Torres
                    for (int count = 0; count < tablero.length; count++) {
                        //Columna
                        if (tablero[count][col].equals("")) {
                            tablero[count][col] = "X";
                        }
                        //Fila
                        if (tablero[row][count].equals("")) {
                            tablero[row][count] = "X";
                        }
                    }
                    //Función Alfiles
                    //Arriba Derecha
                    for (int i = 1; i < tablero.length; i++) {
                        if (row - i >= 0 && col + i < tablero.length) {
                            if (tablero[row - i][col + i].equals("")){
                                tablero[row - i][col + i] = "X";
                            }
                        }
                    }
                    //Arriba Izquierda
                    for (int i = 1; i < tablero.length; i++) {
                        if (row - i >= 0 && col - i >= 0) {
                            if (tablero[row - i][col - i].equals("")){
                                tablero[row - i][col - i] = "X";
                            }
                        }
                    }
                    //Abajo Derecha
                    for (int i = 1; i < tablero.length; i++) {
                        if (row + i < tablero.length && col + i < tablero.length) {
                            if (tablero[row + i][col + i].equals("")){
                                tablero[row + i][col + i] = "X";
                            }
                        }
                    }
                    //Abajo Izquierda
                    for (int i = 1; i < tablero.length; i++) {
                        if (row + i < tablero.length && col - i >= 0) {
                            if (tablero[row + i][col - i].equals("")){
                                tablero[row + i][col - i] = "X";
                            }
                        }
                    }
                }
            }
        }

    }

    //Método para Rey
    public static void rey(String[][] tablero) {

        for (int row = 0; row < tablero.length; row++) {
            for (int col = 0; col < tablero[row].length; col++) {
                if (tablero[row][col].equalsIgnoreCase("K")) {
                    //Arriba
                    if (row - 1 >= 0) {
                        if (tablero[row - 1][col].equals("")){
                            tablero[row - 1][col] = "X";
                        }
                    }
                    //Abajo
                    if (row + 1 < tablero.length) {
                        if (tablero[row + 1][col].equals("")){
                            tablero[row + 1][col] = "X";
                        }
                    }
                    //Derecha
                    if (col + 1 < tablero.length) {
                        if (tablero[row][col + 1].equals("")){
                            tablero[row][col + 1] = "X";
                        }
                    }
                    //Izquierda
                    if (col - 1 >= 0) {
                        if (tablero[row][col - 1].equals("")){
                            tablero[row][col - 1] = "X";
                        }
                    }
                    //Arriba Derecha
                    if (row - 1 >= 0 && col + 1 < tablero.length) {
                        if (tablero[row - 1][col + 1].equals("")){
                            tablero[row - 1][col + 1] = "X";
                        }
                    }
                    //Arriba Izquierda
                    if (row - 1 >= 0 && col - 1 >= 0) {
                        if (tablero[row - 1][col - 1].equals("")){
                            tablero[row - 1][col - 1] = "X";
                        }
                    }
                    //Abajo Derecha
                    if (row + 1 < tablero.length && col + 1 < tablero.length) {
                        if (tablero[row + 1][col + 1].equals("")){
                            tablero[row + 1][col + 1] = "X";
                        }
                    }
                    //Abajo Izquierda
                    if (row + 1 < tablero.length && col - 1 >= 0) {
                        if (tablero[row + 1][col - 1].equals("")){
                            tablero[row + 1][col - 1] = "X";
                        }
                    }
                }
            }
        }

    }

    //Método para ejecutar todas las comprobaciones a la vez
    public static void comprobarTablero(String[][] tablero) {
        peones(tablero);
        torres(tablero);
        alfiles(tablero);
        caballos(tablero);
        reina(tablero);
        rey(tablero);
    }

    //Método para averiguar cuantas X
    public static int casillasDefendidas(String[][] tablero) {
        
        int totalCasillas = 0;

        for (int row = 0; row < tablero.length; row++) {
            for (int col = 0; col < tablero[row].length; col++) {
                if (tablero[row][col].equals("X")) {
                    totalCasillas++;
                }
            }
        }

        return totalCasillas;
    }

    //Método para transcribir filas
    public static String transcribirFilas(int row) {

        String resultado = "";

        switch (row) {
            case 0:
            resultado = "8";
            break;
            case 1:
            resultado = "7";
            break;
            case 2:
            resultado = "6";
            break;
            case 3:
            resultado = "5";
            break;
            case 4:
            resultado = "4";
            break;
            case 5:
            resultado = "3";
            break; 
            case 6:
            resultado = "2";
            break;
            case 7:
            resultado = "1";
            break;
        }

        return resultado;
    }

    //Método para transcribir columnas
    public static String transcribirColumnas(int col) {

        String resultado = "";

        switch (col) {
            case 0:
            resultado = "a";
            break;
            case 1:
            resultado = "b";
            break;
            case 2:
            resultado = "c";
            break;
            case 3:
            resultado = "d";
            break;
            case 4:
            resultado = "e";
            break;
            case 5:
            resultado = "f";
            break; 
            case 6:
            resultado = "g";
            break;
            case 7:
            resultado = "h";
            break;
        }

        return resultado;
    }

    //Método para representar nombre algebraico de la posición
    public static void nombreAlgebraico(String[][] tablero, String[] output) {

        int count = 0;

        for (int row = 0; row < tablero.length; row++) {
            for (int col = 0; col < tablero[row].length; col++) {
                if (tablero[row][col].equals("X")) {
                    String casilla = transcribirColumnas(col) + transcribirFilas(row);
                    output[count] = casilla;
                    count++;
                }
            }
        }
    }

    //Método para imprimir el vector output
    public static void imprimeOutput(String[] output) {
        for (int i = 0; i < output.length; i++) {
            if (i == (output.length - 1)) {
                System.out.print(output[i]);
            } else {
                System.out.print(output[i] + ", ");
            }
        }
    }

    //MAIN
    public static void main(String[] args) {

        //Matriz del tablero
        String[][] ajedrez = new String[8][8];
        
        rellenaTablero(ajedrez);
        comprobarTablero(ajedrez);
        imprimeTablero(ajedrez);

        //Vector del resultado final
        String[] output = new String[casillasDefendidas(ajedrez)];

        nombreAlgebraico(ajedrez, output);
        imprimeOutput(output);
        
    }
    
}
