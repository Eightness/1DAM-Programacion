import java.util.Scanner;

public class Calculadora_Albert {

    //Método Menú
    public static void menu () {
        //Mostramos menú
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

    //Método para pedir valores negativos y positivos (opciones 1 - 4)
    public static double pedirValor () {
        //Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double n = input.nextDouble();

        return n;
    }

    //Método para pedir valores entre 0 y 1000000 (opciones 5 - 7)
    public static double pedirValor2 () {
        //Scanner
        Scanner input = new Scanner(System.in);
        double n;

        do {
            System.out.print("Introduce un número entre 0 y 1.000.000: ");
            n = input.nextDouble();

            if (n < 0 || n > 1000000) {
                System.out.println("Inválido, prueba otro número.");
            }
        } while (n < 0 || n > 1000000);

        return n;
    }

    //Método para pedir valores entre -360 y 360 (opción 8)
    public static double pedirValor3 () {
        //Scanner
        Scanner input = new Scanner(System.in);
        double n;

        do {
            System.out.print("Introduce un número entre -360 y 360: ");
            n = input.nextDouble();

            if (n < -360 || n > 360) {
                System.out.println("Inválido, prueba otro número.");
            }
        } while (n < -360 || n > 360);

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
            a = pedirValor2();
            b = pedirValor2();
            System.out.println("El área del rectángulo con base " + a + " y altura " + b + " es: " + areaRectangulo(a, b));
            break;

            //Caso área triángulo
            case 6:
            a = pedirValor2();
            b = pedirValor2();
            System.out.println("El área del triángulo con base " + a + " y altura " + b + " es: " + areaTriangulo(a, b));
            break;

            //Caso área círculo
            case 7:
            a = pedirValor2();
            System.out.println("El área del circulo de radio " + a + " es: " + areaCirculo(a));
            break;

            //Caso seno, coseno, tangente
            case 8:
            a = pedirValor3();
            sinCosTan(a);
            break;

            //Caso salir
            case 9:
            salir();
            break;
        }
    }

    //Método 1 Suma
    public static double suma (double a, double b) {
        return a + b;
    }

    //Método 2 Resta
    public static double resta (double a, double b) {
        return a - b;
    }

    //Método 3 Muliplicación
    public static double mult (double a, double b) {
        return a * b;
    }

    //Método 4 División
    public static double div (double a, double b) {
        return a / b;
    }

    //Método 5 Área Rectángulo
    public static double areaRectangulo (double base, double altura) {
        return base * altura;
    }

    //Método 6 Área Triángulo
    public static double areaTriangulo (double base, double altura) {
        return base * altura / 2;
    }

    //Método 7 Área Círculo
    public static double areaCirculo (double radio) {
        return Math.PI * radio * radio;
    }

    //Método 8 Seno, Coseno y Tangente
    public static void sinCosTan (double a) {
        System.out.println("El seno de " + a + " es: " + Math.sin(a));
        System.out.println("El coseno de " + a + " es: " + Math.cos(a));
        System.out.println("La tangente de " + a + " es: " + Math.tan(a));
    }

    //Método 9 Salir
    public static void salir () {
        System.exit(0);
    }

    //MAIN
    public static void main(String[] args) {

        //Bienvenida
        System.out.println();
        System.out.println("Bienvenido/a a la calculadora de Albert.");

        //Bucle Calculadora
        while (true) {
            menu();
            opcion(elegirOpcion());
        }
        
    }
    
}
