//Albert Lozano Blasco - Agenda y contactos
//1 DAM - Programación

import java.util.Scanner;

//Main Class
public class AppMain {

    //Class Attributes
    public static Book contactBook = new Book();
    public static Scanner input = new Scanner(System.in);

    //----------------------------------------------------------

    //Functions

    //Function to get the input (option)
    public static int option() {
        System.out.print("Elige una opción: ");
        int option = input.nextInt();
        return option;
    }

    //Function to show the menu
    public static void showMenu() {
        System.out.println();
        System.out.println("1. Ver contactos.");
        System.out.println("2. Agregar contacto.");
        System.out.println("3. Eliminar contacto.");
        System.out.println("4. Buscar por nombre.");
        System.out.println("5. Buscar por teléfono.");
        System.out.println("6. Buscar por correo.");
        System.out.println("7. Buscar por global.");
        System.out.println("8. Salir.");
        System.out.println();
    }

    //Function to exit
    public static void exit() {
        System.out.println();
        System.out.println("Gracias por utilizar la aplicación, ¡adiós!");
        System.out.println();
        System.exit(0);
    }

    //Function to work with the chosen option
    public static void switchMenu(int option) {
        switch(option) {
            //Show contacts
            case 1:
            contactBook.showContacts();
            break;

            //Add contact
            case 2:
            contactBook.addContact();
            break;

            //Remove contact
            case 3:
            contactBook.removeContact();
            break;

            //Search by name
            case 4:
            contactBook.searchContact(option);
            break;
            
            //Search by phone
            case 5:
            contactBook.searchContact(option);
            break;
            
            //Search by mail
            case 6:
            contactBook.searchContact(option);
            break;
            
            //Search globally
            case 7:
            contactBook.searchContact(option);
            break;

            //Exit
            case 8:
            exit();
            break;

            default: System.out.println("Opción inválida.");
        }
    }

    //Function to show the output
    public static void output() {
        showMenu();
        switchMenu(option());
    }


    //----------------------------------------------------------

    //Main
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Bienvenido a la aplicación 'Agenda de Contactos', desarrollada por Albert Lozano.");

        while (true) {
            output();
        }

    }
    
    
}
