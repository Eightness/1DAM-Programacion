//Albert Lozano Blasco

//PROGRAMA 3

/*
 * Haz un programa que permita generar la clasificación final de una competición de lanzamiento de martillo según lo lejos que los deportistas han lanzado el martillo.
 * 
 * Primero el usuario indicará cuántos deportistas va a introducir, y luego introducirá la información de todos ellos.
 * Se introducirá una línea de texto por deportista, que contendrá su nombre (puede tener apellidos) y la distancia de lanzamiento (metros). Por ejemplo:
 * 
 * Michelle Araujo 44
 * Josué Asensio Guijarro 37
 * Esther Milagros Galán Correa 35
 * Antonio Fuertes 48
 * Constanza 41
 * 
 * El programa mostrará por pantalla la clasificación numerada según los tiempos que han obtenido en la carrera. El más rápido va el primero, el siguiente más
 * rápido va segundo, etc. hasta el más lento que aparece el último.
 * 
 * 1. Antonio Fuertes.
 * 2. Michelle Araujo.
 * 3. Constanza.
 * 4. Josué Asensio Guijarro.
 * 5. Esther Milagros Galán Correa.
 * 
 */

 import java.util.Scanner;
 import java.util.Arrays;

 public class Programa3_AlbertLozano {
 
    //MAIN
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);

         //Variables
         int cantidad;

         System.out.println();

         //Preguntamos por la cantidad de deportistas
         System.out.print("¿Cuántos deportistas participan? ");
         cantidad = input.nextInt();

         //Creamos el vector deportistas
         String[] deportistas = new String[cantidad];

         //Creamos otro vector para almacenar los lanzamientos en valor numérico
         int[] lanzamientos = new int[cantidad];

         System.out.println();

         input.nextLine();

         //Rellenamos los vector
         for (int i = 0; i < deportistas.length; i++) {

            //Preguntamos al usuario el nombre y lanzamiento del deportista
            System.out.print("Introduce el nombre del deportista " + (i + 1) + " y su lanzamiento: ");
            deportistas[i] = input.nextLine();

            //Asignamos al vector de lanzamientos una substring (del último espacio hasta el final de la cadena) convertida a valor numérico
            lanzamientos[i] = Integer.parseInt(deportistas[i].substring(((deportistas[i].lastIndexOf(" ") + 1)),(deportistas[i].length())));

            //Asignamos al vector deportistas simplemente el nombre del deportista (del principio de la cadena hasta el primer espacio)
            //deportistas[i] = deportistas[i].substring(0, deportistas[i].lastIndexOf(" "));

         }

         //Ordenamos el vector de menor a mayor
         Arrays.sort(lanzamientos);

         System.out.println();

         //Output
         for (int i = (lanzamientos.length - 1); i >= 0; i--) {

            for (int j = 0; j < lanzamientos.length; j++) {
                
                String lanzamiento = deportistas[j].substring(((deportistas[j].lastIndexOf(" ") + 1)),(deportistas[j].length()));
                
                if (lanzamiento.equals(Integer.toString(lanzamientos[i]))) {
                    System.out.println((i + 1) + ". " + deportistas[j].substring(0, deportistas[j].lastIndexOf(" ")) + ".");
                }

            }

         }
 
     }
     
 }