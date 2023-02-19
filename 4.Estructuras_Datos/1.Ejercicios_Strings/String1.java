import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Escribe una cadena de texto: ");
        String texto = input.nextLine();

        texto = texto.toUpperCase();

        System.out.println(texto);

    }
    
}
