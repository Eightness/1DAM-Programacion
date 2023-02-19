import java.util.Scanner;

public class String4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Escribe un nombre: ");
        String nombre = input.nextLine();
        System.out.print("Escribe primer apellido: ");
        String apellido1 = input.nextLine();
        System.out.print("Escribe segundo apellido: ");
        String apellido2 = input.nextLine();

        nombre = nombre.substring(0,3);
        apellido1 = apellido1.substring(0,3);
        apellido2 = apellido2.substring(0,3);

        nombre = nombre.toUpperCase();
        apellido1 = apellido1.toUpperCase();
        apellido2 = apellido2.toUpperCase();

        System.out.println(nombre + apellido1 + apellido2);

    }
    
}
