import java.util.Scanner;

public class String2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Escribe una cadena de texto: ");
        String texto1 = input.nextLine();
        System.out.print("Escribe otra cadena de texto: ");
        String texto2 = input.nextLine();

        if (texto1.equals(texto2) == true)
            System.out.println("Las dos cadenas son iguales (teniendo en cuenta las mayúsculas)");
        else
            System.out.println("Las dos cadenas no son iguales (teniendo en cuenta las mayúsculas).");

        if (texto1.equalsIgnoreCase(texto2) == true)
            System.out.println("Las dos cadenas son iguales (sin tener en cuenta las mayúsculas."); 
        else
            System.out.println("Las dos cadenas no son iguales (sin tener en cuenta las mayúsculas).");

    }
    
}
