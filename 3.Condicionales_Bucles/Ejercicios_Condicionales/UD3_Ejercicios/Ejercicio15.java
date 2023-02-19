import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        /* Pedir 3 notas a un alumno, calcular la media, redondear al entero más próximo, si una de las tres notas es menor a 4, la media es 4. */
        
        int nota1, nota2, nota3;
        double media;

        Scanner lector = new Scanner(System.in);

        System.out.print("Introduzca la nota del primer trimestre: ");
        nota1 = lector.nextInt();
        System.out.print("Introduzca la nota del segundo trimestre: ");
        nota2 = lector.nextInt();
        System.out.print("Introduzca la nota del tercer trimestres: ");
        nota3 = lector.nextInt();

        media = ((double)nota1 + (double)nota2 + (double)nota3) / 3;

        if ((nota1 < 5 || nota2 < 5 || nota3 < 5) && media >= 4) {
            System.out.println("Nota final: 4");

        }
            else if ((nota1 < 5 || nota2 < 5 || nota3 < 5) && media < 4) {
                System.out.println("Nota final: " + Math.round(media));

            }
            else if (nota1 >= 5 && nota2 >= 5 && nota3 >= 5) {
                System.out.println("Nota final: " + Math.round(media));

            }
    }    
}