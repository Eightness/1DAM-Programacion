import java.util.Scanner;

public class String8 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String F = input.nextLine();
        System.out.print("Escribe una palabra: ");
        String P = input.nextLine();

        int totalP = 0;

        if (F.indexOf(P) < 0)
            System.out.println("No está la palabra '" + P + "' en la frase.");

        for (int i = 0; i < F.length(); i++) {
            
            if (F.indexOf(P, i) == i) {
                totalP++;
            }

        }

        System.out.println(totalP);
     
    }
    
}