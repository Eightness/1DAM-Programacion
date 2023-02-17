import java.net.SocketPermission;
import java.util.Scanner;

public class Beta4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nota = 0;
        int sumaNotas = 0;
        int mediaNotas = 0;
        int cantidad = 0;
        boolean diez = false;

        System.out.println("Vaya introduciendo notas del 0 al 10: ");
        
        do {
            nota = input.nextInt();

            cantidad += 1;
            sumaNotas += nota;

            if (nota == 10)
                diez = true;
        }
        while (nota != -1);

        cantidad -= 1;
        sumaNotas += 1;
        mediaNotas = sumaNotas / cantidad;
        
        System.out.println("La suma total de las notas es: " + sumaNotas);
        System.out.println("La media de todas las notas es: " + mediaNotas);
        
        if (diez == true)
            System.out.println("Alguna nota ha sido un 10.");
        else
            System.out.println("Ninguna nota ha sido diez.");

    }
}