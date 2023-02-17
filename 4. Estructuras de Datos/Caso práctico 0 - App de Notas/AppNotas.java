//OBJETIVO

/* Implementar un programa que sirva para la gestión de notas de alumnos */

//REQUISITOS
/*
 * Se deben poder almacenar hasta un máximo de 100 notas de alumnos. Al iniciar la aplicación esta no tendrá ninguna nota almacenada.
 * 
 * De cada alumnon necesitamos poder registrar su nombre y una nota (número entero).
 * 
 * El usuario interactuará con la apliación mediante un menú de texto que te permita elegir entre distintas opciones numeradas. 
 * Tras cada operación volverá a mostrarse el menú, a no ser que el usuario decida salir de la aplicación. Las opciones son:
 * 
 * 1. Ver notas.
 *      Mostrará por pantalla la lista actual de alumnos y su nota, un alumno por línea, y debe estar numerada (ver ejemplo abajo).
 *      Nota 0. María 9.
 *      Nota 1. Pepito 7.
 * 2. Añadir notas.
 *      Permitirá añadir una nota a la lista de notas siempre y cuando no esté llena. Se pedirá el nombre del alumno y su nota, 
 *      y se registrará al final de la lista de notas.
 * 3. Borrar nota.
 *      Permitirá eliminar una nota de la lista. Se preguntará qué nota se desea eliminar y se borrará de la lista.
 * 4. Estadísticas.
 *      Mostrará la nota media de todos los alumnos, la nota máxima y la nota mínima.
 * 5. Ver suspendidas.
 *      Mostrará la lista de alumnos que han obtenido una nota inferior a 5.
 * 6. Salir.
 *      Termina el programa.
 */

import java.util.Scanner;

public class AppNotas {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Variables
        int opcion;
        int cont = 0;
        int contsuspendidas = 0;
        int borrar;
        int notaMedia = 0;
        int notaMin = Integer.MAX_VALUE;
        int notaMax = Integer.MIN_VALUE;

        //Definimos los vectores
        String[] alumnos = new String[100];
        int[] notas = new int[100];

        System.out.println();
        System.out.println("Bienvenido a la App de Notas.");
        System.out.println();

        //While principal
        while (true) {

            //Mostramos el menú el menú
            System.out.println("1. Ver notas.");
            System.out.println("2. Añadir notas.");
            System.out.println("3. Borrar nota.");
            System.out.println("4. Estadísticas.");
            System.out.println("5. Ver suspendidas.");
            System.out.println("6. Salir.");

            System.out.println();

            System.out.print("Introduce la opción deseada: ");
            opcion = input.nextInt();

            System.out.println();

            switch (opcion) {

                //1. Ver Notas
                case 1:

                if (cont == 0) {

                    System.out.println("No se ha añadido ninguna nota.");

                } else {

                    for (int i = 0; i < cont; i++) {

                        System.out.print("Nota " + i + ". " + alumnos[i] + " " + notas[i]);
                        System.out.println();

                    }

                }

                    System.out.println();

                break;

                //2. Añadir Notas
                case 2:

                if (cont < 100) {

                    input.nextLine();
                    System.out.print("Escribe el nombre del alumno " + cont + ": ");
                    alumnos[cont] = input.nextLine();

                    System.out.println();

                    System.out.print("Escribe la nota del alumno " + cont + ": ");
                    notas[cont] = input.nextInt();

                    if (notas[cont] < 5) {
                        contsuspendidas += 1;
                    }
                        
                    cont += 1;

                }

                    System.out.println();

                break;

                //3. Borrar nota
                case 3:

                System.out.print("Introduce la nota que quieres borrar: ");
                borrar = input.nextInt();

                if (alumnos[borrar] == null && notas[borrar] == 0) {

                    System.out.println("La nota que intentas borrar no existe.");

                } else {
                    
                    alumnos[borrar] = null;
                    notas[borrar] = 0;
    
                    cont -= 1;

                }

                System.out.println();

                break;

                //4. Estadísticas
                case 4:

                for (int i = 0; i < cont; i++) {

                    if (notas[i] < notaMin) {
                        notaMin = notas[i];
                    }

                    if (notas [i] > notaMax) {
                        notaMax = notas[i];
                    }

                    notaMedia += notas[i];
                    
                }

                if (cont > 0) {
                    System.out.println("La nota mínima es: " + notaMin);
                    System.out.println("La nota máxima es: " + notaMax);
                    System.out.println("La nota media es: " + (notaMedia / cont));
                } else {
                    System.out.println("No hay suficientes notas para mostrar estadísticas.");
                }

                System.out.println();

                break;

                //5. Ver suspendidas
                case 5:

                if (contsuspendidas == 0) {

                    System.out.println("No hay ningún alumno suspendido.");

                } else {

                    for (int i = 0; i < cont; i++) {

                        if (notas[i] < 5) {
                            System.out.print("Nota " + i + ". " + alumnos[i] + " " + notas[i]);
                            System.out.println();
                        }

                    }

                }

                    System.out.println();

                break;

                //6. Salir
                case 6:

                    System.exit(0);

                break;
                
            }

        }

    }
    
}