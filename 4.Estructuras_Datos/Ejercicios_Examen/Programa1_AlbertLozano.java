//Albert Lozano Blasco

//PROGRAMA 1

/*
 * Haz un programa para el instituto que ayude a los profesores a generar el boletín de notas de un alumno.
 * El programa primero pedirá por teclado una cadena de texto con el nombre y apellidos del alumno, 
 * y otra cadena de texto con su fecha de nacimiento (en formato dia/mes/año).
 * Luego pedirá los nombres de cada módulo y sus notas (números enteros entre 0 y 10).
 * El usuario indicará cuántos módulos son. Por último, mostrará por pantalla la siguiente información:
 * 
 * 1. Código identificativo del alumno, que estará compuesto por las tres primeras letras del nombre y de los dos apellidos (en mayúsculas),
 * el año de nacimiento y la cantidad de vocales del nombre completo. Por ejemplo:
 * Maria Aparicio Diez, nacida en 1990, tendría el código identificativo MARAPADIE199010.
 * 
 * 2. Listado de módulos y sus notas.
 * 
 * 3. La nota media (suma de notas / números de asignaturas), cuántos módulos ha aprobado (nota 5 o más), 
 * cuántos módulos ha suspendido (nota inferior a 5),
 * si ha obtenido algún 0 y si ha obtenido algún 10.
 * 
 * Ejemplo de boletín de notas:
 * 
 * BOLETÍN DE NOTAS
 * Alumna/o: MARAPADIE199010
 * ----------
 * Castellano   7
 * Valenciano   8
 * Historia     10
 * Mates        6
 * Física       4
 * ----------
 * Nota media:  7
 * Aprobados:   4
 * Suspendidos: 1
 * ¿Algún 0?    No
 * ¿Algún 10?   Sí
 * 
 */

 import java.util.Scanner;

 public class Programa1_AlbertLozano {
 
    //MAIN
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);

         //Variables
         String nombreCompleto; //Nombre completo del alumno/a
         String nacimiento;     //Fecha de nacimiento del alumno/a en formato dia/mes/año
         int cantidad;          //Número de módulos existentes

         double notaMedia = 0;  //Nota media del alumno/a
         int aprobados = 0;     //Cantidad de módulos aprobados
         int suspendidos = 0;   //Cantidad de módulos suspendidos
         boolean cero = false;  //Boolean para detectar si ha habido algún 0 (en un principio false)
         boolean diez = false;  //Boolean para detectar si ha habido algún 10 (en un principio false)

         String nombre, apellido1, apellido2, año;  //Substrings
         int vocales = 0;                           //Número de vocales

         System.out.println();

         //Preguntamos nombre completo del alumno
         System.out.print("Introduce nombre y apellidos del alumno/a: ");
         nombreCompleto = input.nextLine();

         //Trabajamos con las substrings del nombre
         nombre = nombreCompleto.substring(0, 3);
         apellido1 = nombreCompleto.substring((nombreCompleto.indexOf(" ") + 1), (nombreCompleto.indexOf(" ") + 4));
         apellido2 = nombreCompleto.substring((nombreCompleto.lastIndexOf(" ") + 1), (nombreCompleto.lastIndexOf(" ") + 4));

         //Bucle para contar las vocales
         for (int i = 0; i < nombreCompleto.length(); i++) {

            //Condicionales para saber si el carácter en la posicion actual es una vocal o no
            if (nombreCompleto.charAt(i) == 'A' || nombreCompleto.charAt(i) == 'a') {
                vocales += 1;
            }
            if (nombreCompleto.charAt(i) == 'E' || nombreCompleto.charAt(i) == 'e') {
                vocales += 1;
            }
            if (nombreCompleto.charAt(i) == 'I' || nombreCompleto.charAt(i) == 'i') {
                vocales += 1;
            }
            if (nombreCompleto.charAt(i) == 'O' || nombreCompleto.charAt(i) == 'o') {
                vocales += 1;
            }
            if (nombreCompleto.charAt(i) == 'U' || nombreCompleto.charAt(i) == 'u') {
                vocales += 1;
            }
            
         }

         //Preguntamos fecha de nacimiento
         System.out.print("Introduce la fecha de nacimiento (en formato dia/mes/año): ");
         nacimiento = input.nextLine();

         //Trabajamos con las substrings
         año = nacimiento.substring((nacimiento.lastIndexOf("/") + 1), nacimiento.length());
         
         //Preguntamos número total de módulos
         System.out.print("¿Cuántos módulos son? ");
         cantidad = input.nextInt();

         //Creamos los vectores
         String[] modulos = new String[cantidad];   //Vector para los módulos
         int[] notas = new int[cantidad];           //Vector para las notas

         //Bucle para rellenar los vectores de módulos y notas
         for (int i = 0; i < cantidad; i++) {

            input.nextLine();

            System.out.print("Introduce el nombre del módulo " + (i + 1) + ": ");
            modulos[i] = input.nextLine();

            System.out.print("Introduce la nota del módulo " + (i + 1) + ": ");
            notas[i] = input.nextInt();
            
         }

         //Bucle para trabajar con el vector de notas
         for (int i = 0; i < notas.length; i++) {

            //Calculamos suma total de notas
            notaMedia += notas[i];

            //Condicional para aprobados y suspendidos
            if (notas[i] >= 5) {
                aprobados += 1;
            } else {
                suspendidos += 1;
            }

            //Condicional para comprobar si ha habido algún 0
            if (notas[i] == 0) {
                cero = true;
            }

            //Condicional para comprobar si ha habido algún 10
            if (notas[i] == 10) {
                diez = true;
            }
            
         }

         //Obtenemos la media de las notas
         notaMedia /= cantidad;

         //Output
         System.out.println();
         System.out.println("BOLETÍN DE NOTAS");
         System.out.println("Alumna/o: " + nombre.toUpperCase() + apellido1.toUpperCase() + apellido2.toUpperCase() + año + vocales);
         System.out.println("----------");
         
         for (int i = 0; i < cantidad; i++) {
            System.out.println(modulos[i] + "\t" + notas[i]);
         }

         System.out.println("----------");
         System.out.println("Nota media:\t" + notaMedia);
         System.out.println("Aprobados:\t" + aprobados);
         System.out.println("Suspendidos:\t" + suspendidos);

         if (cero) {
            System.out.println("¿Algún 0?\tSí");
         } else {
            System.out.println("Algún 0?\tNo");
         }

         if (diez) {
            System.out.println("¿Algún 10?\tSí");
         } else {
            System.out.println("Algún 10?\tNo");
         }
 
     }
     
 }