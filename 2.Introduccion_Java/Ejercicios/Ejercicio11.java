import java.util.Scanner;

public class Ejercicio11 
{
    public static void main(String[]args)   
    {
        int lados1;
        int lados2;
        int area;
        int perimetro;

        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce la primera longitud de dos lados de un rectángulo: ");
        lados1 = lector.nextInt();
        System.out.print("Introduce la segunda longitud de dos lados de un rectángulo: ");
        lados2 = lector.nextInt();

        area = lados1 * lados2;
        perimetro = (lados1 * 2) + (lados2 * 2);
        System.out.println("La longitud del lado 1 es: " + lados1);
        System.out.println("La longitud del lado 2 es: " + lados2);
        System.out.println("La longitud del lado 3 es: " + lados1);
        System.out.println("La longitud del lado 4 es: " + lados2);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("El área del rectángulo es: " + area);
    }
}