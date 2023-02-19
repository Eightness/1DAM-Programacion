import java.util.Scanner;

public class String10 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String F = input.nextLine();

        String P;
        char letra;

        for (int i = 0; i < F.length(); i++) {
            
            letra = F.charAt(i);

            if (letra == ' ') {
                P = F.substring(0, i);
                System.out.println(P);
                P = "";
            }

        }
     
    }
    
}