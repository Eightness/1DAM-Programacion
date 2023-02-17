//OBJETIVO
/*
 * Implementar un programa modular (con funciones) que sirva de calculadora.
 */
//REQUISITOS
/*
 * El usuario interactuará con la apliación mediante un menú de texto que le permita elegir entre distintas opciones numeradas. 
 * Tras cada operación volverá a mostrarse el menú, a no ser que el usuario decida salir de la aplicación. 
 * Las opciones son:
 * 1. Suma (A + B)
 * 2. Resta (A - B)
 * 3. Multiplicación (A * B)
 * 4. División (A / B)
 * 5. Área de un rectángulo (Base * Altura)
 * 6. Área de un triángulo equilátero (Base * Altura / 2)
 * 7. Área de un círculo (Pi * R²)
 * 8. Seno, Coseno y Tangente (de X)
 * 9. Salir
 * 
 * En las opciones 1 a 4 se aceptarán tanto valores positivos como negativos.
 * 
 * En las opciones 5 a 7 solo se aceptarán valores entre 0 y 1.000.000.
 * 
 * En la opción 8 solo se aceptarán valores entre -360 y 360.
 * 
 * En las opciones 5 a 8 si el usuario no introduce un valor en el rango permitido, 
 * el programa volverá a pedir el valor una y otra vez hasta que introduzca uno válido.
 * 
 */
//PASOS
/*
 * 1. Realiza el diseño descendente (top-down) del programa, 
 * dividiendo el problema en subproblemas más pequeños, sucesivamente hasta que sean simples y no sea necesario dividirlos más.
 * 
 * 2. Piensa de qué forma puedes almacenar la información más importante. 
 * ¿Qué variables o estructuras de datos puedes necesitar? ¿De qué tipo serían?
 * 
 * 3. Identifica qué subproblemas convendría programar como una función. 
 * Identifica también si hay subproblemas parecidos que puedan ser resueltos por la misma función mediante parámetros, 
 * o si conviene crear funciones sobrecargadas.
 * 
 * 4. Haz una lista con las funciones que necesitarás programar (no todos los subproblemas necesitan ser funciones). 
 * Incluye la cabecera completa (tipo devuelto, nombre y parámetros) y un comentario explicando qué hace cada una de ellas.
 * 
 * 5. Implementa el programa: primero todas las funciones y por último el main.
 */

import java.util.Scanner;

public class Calculadora_Albert {

    //Método Menú
    public static void menu () {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Mostramos menú
        System.out.println();
        System.out.println("Bienvenido a la calculadora de Albert.");
        System.out.println();
        System.out.println("1. Suma (A + B)");
        System.out.println("2. Resta (A - B)");
        System.out.println("3. Multiplicación (A * B)");
        System.out.println("4. Divisón (A / B)");
        System.out.println("5. Área de un rectángulo (Base * Altura)");
        System.out.println("6. Área de un triángulo equilátero (Base * Altura / 2)");
        System.out.println("7. Área de un círculo (Pi * R²)");
        System.out.println("8. Seno, Coseno y Tangente (de X)");
        System.out.println("9. Salir.");
        System.out.println();
    }

    //Método para elegir opción
    public static int elegirOpcion () {
        //Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Elige opción: ");
        int eleccion = input.nextInt();

        return eleccion;
    }

    //Método para pedir valores
    public static double pedirValor () {
        //Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double n = input.nextDouble();

        return n;
    }

    //Método Opción
    public static void opcion (int eleccion) {
        //Variables
        double a, b;
        
        //Switch para cada opción
        switch (eleccion) {

            //Caso suma
            case 1:
            a = pedirValor();
            b = pedirValor();
            System.out.println(a + " + " + b + " = " + suma(a, b));
            break;

            //Caso resta
            case 2:
            a = pedirValor();
            b = pedirValor();
            System.out.println(a + " - " + b + " = " + resta(a, b));
            break;
            
            //Caso multiplicación
            case 3:
            a = pedirValor();
            b = pedirValor();
            System.out.println(a + " * " + b + " = " + mult(a, b));
            break;

            //Caso división
            case 4:
            a = pedirValor();
            b = pedirValor();
            System.out.println(a + " / " + b + " = " + div(a, b));
            break;

            //Caso área rectángulo
            case 5:
            a = pedirValor();
            b = pedirValor();
            System.out.println("El área del rectángulo con base " + a + " y altura " + b + " es: " + areaRectangulo(a, b));
            break;

            //Caso área triángulo
            case 6:
            a = pedirValor();
            b = pedirValor();
            System.out.println("El área del triángulo con base " + a + " y altura " + b + " es: " + areaTriangulo(a, b));
            break;

            //Caso área círculo
            case 7:
            a = pedirValor();
            System.out.println("El área del circulo de radio " + a + " es: " + areaCirculo(a));
            break;

            //Caso seno, coseno, tangente
            case 8:
            do {
                a = pedirValor();
            } while (a <= -360 && a >= 360);
            System.out.println("El seno de " + a + " es: " + Math.sin(a));
            System.out.println("El coseno de " + a + " es: " + Math.cos(a));
            System.out.println("La tangente de " + a + " es: " + Math.tan(a));
            break;

            //Caso salir
            case 9:
            salir();
            break;
        }
    }

    //Método Salir
    public static void salir () {
        System.exit(0);
    }

    //Método Suma
    public static double suma (double a, double b) {
        return a + b;
    }

    //Método Resta
    public static double resta (double a, double b) {
        return a - b;
    }

    //Método Muliplicación
    public static double mult (double a, double b) {
        return a * b;
    }

    //Método División
    public static double div (double a, double b) {
        return a / b;
    }

    //Método Área Rectángulo
    public static double areaRectangulo (double base, double altura) {
        return base * altura;
    }

    //Método Área Triángulo
    public static double areaTriangulo (double base, double altura) {
        return base * altura / 2;
    }

    //Método Área Círculo
    public static double areaCirculo (double radio) {
        return Math.PI * radio * radio;
    }

    //MAIN
    public static void main(String[] args) {

        while (true) {
            menu();
            opcion(elegirOpcion());
        }
        
    }
    
}
