/*
 * Escribe un programa que muestre un menú con 2 opciones: "1. Circunferencia" y "2.Área".
 * En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo oportuno. Implementa las funciones:
 * 
 * int menu() // Muestra el menú y devuelve el número elegido
 * double pideRadio() // Pide que se introduzca el radio y lo devuelve
 * double circunferencia(double r) // Calcula la circunferencia y la devuelve
 * double area(double r) // Calcula el área y la devuelve
 * 
 * Modifica el programa añadiendo otra opción llamada "Volumen", permitiendo que el usuario también pueda solicitar el cálculo del volumen. Añade la función:
 * 
 * double volumen(double r) // Calcula el volumen y lo devuelve
 * 
 * Modifica el programa añadiendo otra opción llamada "Todas" en la que se pida el radio una sola vez y se muestren los tres cálculos posibles (circunferencia, área y volumen).
 * 
 * Modifica el programa anterior de modo que el proceso se repita una y otra vez (mostrar menú -> realizar el cálculo -> volver a mostrar menú). Añade una opción más llamada "Salir" que terminará el programa si es elegida.
 */

 import java.util.Scanner;

 public class Ejercicio21 {
 
     //Muestra el menú y devuelve el número elegido
     public static int menu() {

        //Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("1. Circunferencia.");
        System.out.println("2. Área.");
        System.out.println("3. Volumen.");
        System.out.println("4. Todas.");
        System.out.println("5. Salir.");
        System.out.println();

        System.out.print("Elige la opción del menú: ");
        int eleccion = input.nextInt();

        System.out.println();

        return eleccion;
     }

     //Pide que introduzca el radio y lo devuelve
     public static double pideRadio() {

        //Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el radio: ");
        double radio = input.nextDouble();

        System.out.println();

        return radio;
     }

     //Calcula la circunferencia y la devuelve
     public static double circunferencia(double r) {

        double circunferencia = 2 * Math.PI * r;

        return circunferencia;
     }

     //Calcula el área y la devuelve
     public static double area(double r) {

        double area = Math.PI * (r * r);

        return area;
     }

     //Calcula el volumen y lo devuelve
     public static double volumen(double r) {

        double volumen = (4 / 3) * Math.PI * (r * r * r); 

        return volumen;
     }
 
     //Main
     public static void main(String[] args) {

        System.out.println();

        boolean run = true;
        double r = pideRadio();
 
         while (run) {

            switch (menu()) {

                //Circunferencia
                case 1:
                System.out.println("La circunferencia es: " + circunferencia(r));
                System.out.println();
                break;

                //Area
                case 2:
                System.out.println("El area es: " + area(r));
                System.out.println();
                break;

                //Volumen
                case 3:
                System.out.println("El volumen es: " + volumen(r));
                System.out.println();
                break;

                //Todas
                case 4:
                System.out.println("La circunferencia es: " + circunferencia(r));
                System.out.println("El area es: " + area(r));
                System.out.println("El volumen es: " + volumen(r));
                System.out.println();
                break;

                //Salir
                case 5:
                run = false;
                break;
                
            }

         }
            
     }
 }
 