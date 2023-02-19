import java.util.Scanner;

public class Ejercicio2Albert 
{
    public static void main(String[]args)   
    {
        double A;
        double B;

        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        A = lector.nextDouble();
        System.out.print("Introduce otro número decimal: ");
        B = lector.nextDouble();
       
        System.out.println("El número " + A + " redondeado al entero más próximo es: " + Math.round(A));
        System.out.println("El número " + B + " redondeado al entero más próximo es: " + Math.round(B));
        System.out.println("El número mayor entre " + A + " y " + B + " es: " + Math.max(A, B));
        System.out.println("El número menor entre " + A + " y " + B + " es: " + Math.min(A, B));
        System.out.println("Un número (pseudo)aleatorio entre " + A + " y " + B + " es: " + (Math.random( ) * (B - A + 1) + A ));
    }
}