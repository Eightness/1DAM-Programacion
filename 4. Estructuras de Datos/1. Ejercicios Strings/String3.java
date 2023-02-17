import java.util.Scanner;

public class String3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Escribe una cadena de texto: ");
        String texto1 = input.nextLine();
        System.out.print("Escribe otra cadena de texto: ");
        String texto2 = input.nextLine();

        if (texto1.compareToIgnoreCase(texto2) < 0) {
            System.out.println("1: " + texto1);
            System.out.println("2: " + texto2);
        }

        if (texto1.compareToIgnoreCase(texto2) == 0)
            System.out.println("Ambas cadenas son iguales.");
        
        if (texto1.compareToIgnoreCase(texto2) > 0) {
            System.out.println("1: " + texto2);
            System.out.println("2: " + texto1);
        }

    }
    
}
