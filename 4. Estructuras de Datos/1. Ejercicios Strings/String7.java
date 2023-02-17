import java.util.Scanner;

public class String7 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String F = input.nextLine();
        System.out.print("Escribe una palabra de la frase: ");
        String P1 = input.nextLine();
        System.out.print("Escribe una palabra aleatoria: ");
        String P2 = input.nextLine();

        F = F.replaceAll(P1, P2);

        System.out.println(F);
     
    }
    
}