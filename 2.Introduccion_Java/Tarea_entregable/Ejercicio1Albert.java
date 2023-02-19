import java.util.Scanner;

public class Ejercicio1Albert 
{
    public static void main(String[]args)   
    {
        int nota;
        double notamedia;

        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce la nota de la primera evaluación: ");
        nota = lector.nextInt();
        System.out.print("Introduce la nota de la segunda evaluación: ");
        nota += lector.nextInt();
        System.out.print("Introduce la nota de la tercera evaluación: ");
        nota += lector.nextInt();
        //con el operador de asignación += vamos sumando automáticamente las notas que introduce el usuario.

        notamedia = (double)nota / 3;
        
        System.out.print("La nota media de las evaluaciones es: " + notamedia);
    }
}