/* Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados "Alumno 1", "Alumno 2", etc.) y 5 asignaturas. 
El usuario introducirá las notas por teclado y luego el programa mostrará la nota mínima, máxima y media de cada alumno. */

import java.util.Scanner;

public class Matriz4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[][] array = new double[4][5];
        double notaMin = Double.MAX_VALUE;
        double notaMax = Double.MIN_VALUE;
        double media = 0;

        for (int alumno = 0; alumno < array.length; alumno++) {
            
            for (int asignatura = 0; asignatura < array[alumno].length; asignatura++) {

                System.out.print("Introduce la nota del Alumno " + (alumno + 1) + " en la asignatura " + (asignatura + 1) + ": ");
                array[alumno][asignatura] = input.nextDouble();

                if (array[alumno][asignatura] < notaMin) {
                    notaMin = array[alumno][asignatura];
                }
                
                if (array[alumno][asignatura] > notaMax) {
                    notaMax = array[alumno][asignatura];
                }

                media += array[alumno][asignatura];

            }

            System.out.println("La nota mínima del Alumno " + (alumno + 1) + " es: " + notaMin);
            System.out.println("La nota máxima del Alumno " + (alumno + 1) + " es: " + notaMax);
            System.out.println("La nota media del Alumno " + (alumno + 1) + " es: " + (media / 5));

            media = 0;
        
        }
        
        for (int i = 0; i < array.length; i++) {
            
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + "\t");

            }
        
            System.out.println();

        }

    }
    
}