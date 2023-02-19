import java.util.Scanner;

public class String9 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Escribe una frase de dos palabras: ");
        String F = input.nextLine();

        String P1, P2;

        P1 = F.substring(0, F.indexOf(" "));
        P2 = F.substring((F.indexOf(" ") + 1), F.length());

        System.out.println(P1);
        System.out.println(P2);
     
    }
    
}