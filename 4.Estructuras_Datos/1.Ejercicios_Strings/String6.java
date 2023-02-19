import java.util.Scanner;

public class String6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String F = input.nextLine();
        System.out.print("Escribe una palabra: ");
        String P = input.nextLine();

        if (F.indexOf(P) < 0)
            System.out.println("No está la palabra '" + P + "' en la frase '" + F + "'.");
        else
            System.out.println("La palabra '" + P + "' sí está en la frase '" + F + "'.");

        if (F.startsWith(P) == true)
            System.out.println("La frase '" + F + "' empieza por la palabra '" + P + "'.");
        else
            System.out.println("La frase '" + F + "' no empieza por la palabra '" + P + "'.");

        if (F.endsWith(P) == true)
            System.out.println("La frase '" + F + "' acaba por la palabra '" + P + "'.");
        else
            System.out.println("La frase '" + F + "' no acaba por la palabra '" + P + "'.");

     
    }
    
}